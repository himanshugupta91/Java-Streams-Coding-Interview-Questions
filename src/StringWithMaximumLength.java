import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringWithMaximumLength {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");

        Optional<String> maxLength = strings.stream()
                .max(Comparator.comparingInt(String::length));

        System.out.println("String with maximum length: " + maxLength);
    }
}
