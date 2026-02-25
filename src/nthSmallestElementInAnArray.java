void main() {

    int[] arr = {12,33,44,22,44,46,2,1,11,45,78,99};
    int i = 3; // nth smallest (eg 3rd smallest)

    Arrays.stream(arr)
            .boxed()
            .sorted(Comparator.reverseOrder()) // for 3 largest
            .skip(i-1)
            .findFirst()
            .ifPresent(System.out::println);



}
