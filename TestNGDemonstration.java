import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestNGDemonstration {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = PrintTest.class.getDeclaredMethods();
        for(Method method : methods){
            for (Annotation annotation : method.getDeclaredAnnotations()){
                if (annotation instanceof Test){
                    System.out.println(method.getName()); // test01
                    method.invoke(new PrintTest()); // hello
                }
            }
        }
    }
}
