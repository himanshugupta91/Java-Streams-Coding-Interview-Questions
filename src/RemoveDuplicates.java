
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    static void main() {

        List<String> list = Arrays.asList("apple", "banana", "apple", "kiwi", "banana");
        list.stream().distinct().forEach(System.out::println);

    }
}
