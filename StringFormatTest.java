public class StringFormatTest {
    public static void main(String[] args) {
        String output = String.format("%s = %d", "joe", 35);
        System.out.println(output);
        System.out.println();
        System.out.printf("%s%d", "joe = ", 35);
    }
}
