import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintShortestString {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");

        String s = strings.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Shortest Sting: " + s);
    }
}
