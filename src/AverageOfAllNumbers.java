import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfAllNumbers {
    static void main() {
        List<Integer> number = Arrays.asList(1,43,54,753,233,2,34,66);

        OptionalDouble average = number.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        System.out.println("Average: " + (average.orElse(0)));
    }
}
