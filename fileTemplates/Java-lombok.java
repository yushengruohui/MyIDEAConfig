#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") 
package ${PACKAGE_NAME};
#end

import java.io.Serializable;
import lombok.Data;
#parse("File Header.java")
@Data
public class ${NAME} implements Serializable{

    private static final long serialVersionUID = 1L;
    
    
    
}
