void main() {

    List<Integer> list = Arrays.asList(100,2,3,4,5,6,7,8,9,10);
    List<Integer> list2 = Arrays.asList(100,2,3,4,5,6,7,8,9,10);

    int sum = list.stream()
            .limit(2)
            .mapToInt(Integer::intValue)
            .sum();
    System.out.println(sum);

    Optional<Integer> mul = list2.stream()
            .limit(3)
            .reduce((a, b) ->  a * b );

    mul.ifPresent(System.out::println);


}
