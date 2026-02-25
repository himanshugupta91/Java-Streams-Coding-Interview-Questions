void main() {

    List<String> list = Arrays.asList("1apple","2Banana","Kiwi","date","4orenge");

    list.stream()
            .filter(s -> !s.isEmpty() && Character.isDigit(s.charAt(0)))
            .forEach(System.out::println);
}
