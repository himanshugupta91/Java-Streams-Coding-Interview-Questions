import java.util.Arrays;
import java.util.List;

public class MaximumElement {
    static void main() {

        List<Integer> number = Arrays.asList(1,43,54,753,233,2,34,66);

        int maxNumber = number.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();

        System.out.println("Max Element is : " + maxNumber);


    }
}
