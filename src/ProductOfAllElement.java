import java.util.Arrays;
import java.util.List;

public class ProductOfAllElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer reduce = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product Of All Element: " + reduce);

    }
}
