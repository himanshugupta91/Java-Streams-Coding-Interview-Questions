import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class concatenateAllString {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        String concatenatedString = strings.stream()
                .collect(Collectors.joining());
        System.out.println("ConCatenated String: " + concatenatedString);
    }
}
