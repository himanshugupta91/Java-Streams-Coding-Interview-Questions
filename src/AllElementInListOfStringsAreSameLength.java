import java.util.Arrays;
import java.util.List;

public class AllElementInListOfStringsAreSameLength {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");

        boolean sameLength = strings.stream()
                .map(String::length)
                .distinct()
                .count() == 1;

        System.out.println("All elements have the same length: " + sameLength);

    }
}

