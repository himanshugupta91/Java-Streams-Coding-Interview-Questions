import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class DifferenceBetweenMaximumAndMinimumNumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 5, 7, 18, 3, 15);

        OptionalInt min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();

        OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();

        int difference =max.getAsInt() -  min.getAsInt();

        System.out.println("Difference between maximum and minimum numbers: " +  difference );


    }
}
