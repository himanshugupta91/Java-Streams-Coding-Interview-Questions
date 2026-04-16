import java.util.Arrays;
import java.util.List;

public class SumOfAllElement {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,2,34,4,5,3);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
