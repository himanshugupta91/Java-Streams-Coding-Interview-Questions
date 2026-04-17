import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);

        List<Integer> distinctElement = numbers.stream()
                .distinct()
                .toList();

        System.out.println("Distinct Element Are: " + distinctElement);
    }
}
