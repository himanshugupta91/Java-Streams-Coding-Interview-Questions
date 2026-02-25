import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    static void main() {
        List<Integer> list = Arrays.asList(11,33,44,55,1111,442,13,56,13);

        // not Starting with one
        List<Integer> notNumberStaringWithOne = list.stream()
                .filter(a -> !String.valueOf(a).startsWith("1"))
                .toList();

        System.out.println(notNumberStaringWithOne);

        //Starting with one
        List<Integer> numberStaringWithOne = list.stream()
                .filter(a -> String.valueOf(a).startsWith("1"))
                .toList();

        System.out.println(numberStaringWithOne);
    }
}
