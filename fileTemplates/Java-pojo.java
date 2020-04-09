#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") 
package ${PACKAGE_NAME};
#end

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
#parse("File Header.java")
public class ${NAME} implements Serializable{

    private static final long serialVersionUID = 1L;
    
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(300);
        sb.append(${NAME}.class.getSimpleName()).append(":{");
        Field[] fields = this.getClass().getDeclaredFields();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                String modifier = Modifier.toString(field.getModifiers());
                if (modifier.contains("static final")) {
                    continue;
                }
                sb.append(field.getName()).append(":").append(field.get(${NAME}.class)).append(",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("}");
        return sb.toString();
    }
}
