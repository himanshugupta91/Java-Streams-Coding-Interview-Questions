import java.util.Arrays;
import java.util.List;

public class ContainSpecificString {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");

        String target = "banana";

        boolean contains = strings.stream()
                .anyMatch(s -> s.contains(target));

        System.out.println("Contains Banana Or Not: " + contains);

    }
}
