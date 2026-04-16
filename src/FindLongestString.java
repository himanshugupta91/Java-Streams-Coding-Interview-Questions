import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        Optional<String> max = strings.stream()
                .max((st1, st2) -> st1.length() - st2.length());

        System.out.println("Longest String: " + (max.orElse("N/A")));
    }
}
