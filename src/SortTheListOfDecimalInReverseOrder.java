void main() {

    List<Double> list = Arrays.asList(4.23, 43.64, 3.5, 76.9);

    list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);



}
