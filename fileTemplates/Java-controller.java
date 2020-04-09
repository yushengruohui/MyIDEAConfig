#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") 
package ${PACKAGE_NAME};
#end


#parse("File Header.java")
@RestController
public class ${NAME} {
    @Resource
    private String temp;
    
    @GetMapping("/test")
    public void test(String str) {
        
    }
    
    
}
