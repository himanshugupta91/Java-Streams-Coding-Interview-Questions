void main() {

    List<String> words = Arrays.asList("apple","banana","cherry","coffee","dog","goose");

    String result = words.stream()

            .collect(Collectors.joining(",","[","]"));

    System.out.println(result);


}
