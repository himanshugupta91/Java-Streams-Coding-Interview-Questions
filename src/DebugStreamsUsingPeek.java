void main() {

    List<String> list = Arrays.asList("apple", "banana", "apple", "kiwi", "banana");

    List<String> result = list.stream()
            .peek(word -> System.out.println("Original word: " + word))
            .filter(word -> word.startsWith("a"))

            .peek(word -> System.out.println("After Filtering: " + word))
            .map(String::toUpperCase)

            .peek(word -> System.out.println("After UpperCase: " + word))
            .toList();

    System.out.println(result);


}
