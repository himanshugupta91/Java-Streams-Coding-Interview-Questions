import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class HowToJoinTwoStream {
    static void main() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        Stream<Integer> combineStream = Stream.concat(list1.stream(),list2.stream());

        combineStream.forEach(System.out::println);
    }
}
