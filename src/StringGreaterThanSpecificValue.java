import java.util.Arrays;
import java.util.List;

public class StringGreaterThanSpecificValue {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");

        List<String> list = strings.stream()
                .filter(s -> s.length() > 5)
                .toList();

        System.out.println("strings with length greater than a specified value 5 : " + list);
    }
}
