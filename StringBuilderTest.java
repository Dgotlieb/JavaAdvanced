public class StringBuilderTest {
    public static void main(String[] args) {
        appendTest();
        insertTest();
        replaceTest();
        reverseTest();
        deleteTest();
        indexOfTest();
    }

    private static void appendTest(){
        StringBuilder strBuilder = new StringBuilder("Hello");
        strBuilder.append("World");
        System.out.println(strBuilder);
    }

    private static void insertTest() {
        StringBuilder strBuilder = new StringBuilder("Hello");
        strBuilder.insert(1,"World");
        System.out.println(strBuilder);
    }

    private static void replaceTest() {
        StringBuilder strBuilder = new StringBuilder("Hello");
        strBuilder.replace( 2, 4, "World");
        System.out.println(strBuilder);
    }


    private static void reverseTest() {
        StringBuilder strBuilder  =  new StringBuilder("Hello");
        strBuilder.reverse();
        System.out.println(strBuilder);
    }

    private static void deleteTest() {
        StringBuilder strBuilder = new StringBuilder("Hello");
        strBuilder.delete( 2, 4);
        System.out.println(strBuilder);
    }

    private static void indexOfTest() {
        StringBuilder strBuilder = new StringBuilder("Hello");
        System.out.println(strBuilder.indexOf("e"));
        System.out.println(strBuilder);
    }
}
