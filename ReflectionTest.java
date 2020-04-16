import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) {
        Method[] methods = User.class.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName()); // getName setName
        }
        Field[] fields = User.class.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName()); // name
        }
    }
}
