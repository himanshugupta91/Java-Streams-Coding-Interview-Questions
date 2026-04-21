import java.util.Arrays;
import java.util.List;

public class RemoveAllWhitespaceFromListOfString {
    static void main() {

        List<String> strings = Arrays.asList("apple", "ba nana", "kiwi", "oran ge", "pear");

        List<String> list = strings.stream()
                .map(s -> s.replaceAll("\\s", ""))
                .toList();

        System.out.println("List with whitespace removed: " + list);
    }
}
