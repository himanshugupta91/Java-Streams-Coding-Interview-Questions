import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoSortedListIntoASingleSortedList {
    static void main() {
        List<Integer> list1 = Arrays.asList(11,33,44,55,1111,442,13,56);
        List<Integer> list2 = Arrays.asList(12,23,45,67,54,33,55,66,32);

        List<Integer> combineList = Stream.concat(list1.stream(),list2.stream())
                .sorted()
                .toList();

        combineList.forEach(System.out::println);
    }
}
