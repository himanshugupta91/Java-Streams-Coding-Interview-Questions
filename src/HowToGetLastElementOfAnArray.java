void main() {

    int[] number = {10,20,30,40,50,60,70,80,90,100};

    Arrays.stream(number)
            .skip(number.length -1)
            .findFirst()
            .ifPresent(System.out::println);


}
