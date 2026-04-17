import java.util.Arrays;
import java.util.List;

public class StringWithSpecificPrefix {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");

        List<String> a = strings.stream()
                .filter(s -> s.startsWith("a"))
                .toList();

        System.out.println("Strings starting with prefix 'a' : " + a);
    }
}
