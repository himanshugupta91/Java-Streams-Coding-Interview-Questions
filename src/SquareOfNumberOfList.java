import java.util.Arrays;
import java.util.List;

public class SquareOfNumberOfList {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);

        List<Integer> distinctElement = numbers.stream()
                .distinct()
                .toList();

        List<Integer> list = distinctElement.stream()
                .map(n -> n * n)
                .toList();

        System.out.println("Square List is: " + list);
    }
}
