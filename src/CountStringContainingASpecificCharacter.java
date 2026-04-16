import java.util.Arrays;
import java.util.List;

public class CountStringContainingASpecificCharacter {
    static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        char searchChar = 'a';

        long count = strings.stream()
                .filter(st -> st.contains(String.valueOf(searchChar)))
                .count();

        System.out.println("Number of strings containing '" + searchChar + "': " + count);
    }
}
