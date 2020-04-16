public class GenericsTest {
    public static void main(String[] args) {
        Integer[] wholeNums = {5,6};
        String[] words = {"hello","World"};
        printArray(wholeNums);
        printArray(words);
    }

    public static <E> void printArray(E[] elements) {
        for (E element : elements){
            System.out.println(element);
        }
    }
}
