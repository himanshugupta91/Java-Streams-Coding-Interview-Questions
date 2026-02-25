void main() {


    String name = "Himanshu";

    boolean isPalindrome = IntStream.range(0, name.length()/2)
            .allMatch(i -> name.charAt(i) == name.charAt(name.length()-i-1));
    System.out.println(isPalindrome);
}
