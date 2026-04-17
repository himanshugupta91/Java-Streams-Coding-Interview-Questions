
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintPrimeNumber {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);

        List<Integer> list = numbers.stream()
                .filter(PrintPrimeNumber::isPrime)
                        .toList();

        System.out.println("Prime Number Are: " + list);
    }

        private static boolean isPrime(int n){
            if(n <= 1){
                return false;
            }

            for(int i = 2; i<Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
}
