import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvokingTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MethodsTemplate privateObject = new MethodsTemplate();
        Method privateStringMethod = MethodsTemplate.class.getDeclaredMethod("privatelyPrintAll", String.class);
        privateStringMethod.setAccessible(true);
        privateStringMethod.invoke(privateObject, "private hello");

        Method publicStringMethod = MethodsTemplate.class.getDeclaredMethod("PrintAll", String.class);
        publicStringMethod.invoke(privateObject, "public hello");
    }
}
