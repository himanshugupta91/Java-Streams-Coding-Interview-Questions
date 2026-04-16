import java.util.Arrays;
import java.util.List;

public class ConverListOfStringToUpperCase {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        List<String> upperCaseSting = strings.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("UpperCase String : " + upperCaseSting);
    }
}
