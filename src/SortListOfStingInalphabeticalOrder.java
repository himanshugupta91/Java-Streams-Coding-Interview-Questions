import java.util.Arrays;
import java.util.List;

public class SortListOfStingInalphabeticalOrder {
    static void main() {

        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        List<String> sortedString = strings.stream()
                .sorted()
                .toList();
        System.out.println("Sorted String: " + sortedString);
    }
}
