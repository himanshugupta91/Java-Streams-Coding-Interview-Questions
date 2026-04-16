import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterAllEvenNumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(1,3,56,43,53,245,64,553);

        List<Integer> evenNumber = numbers.stream()
                .filter(num -> (num % 2 == 0))
                .toList();
        System.out.println("Even Number Are : " + evenNumber );
    }
}
