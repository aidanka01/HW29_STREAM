import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*  Integer массивден жуп сандарды терип алыныздар жана алардын квадраттарынын эн чонун табыныз.*/

        Integer[] integers = {10, 77, 34, 41, 58, 65};
        Stream.of(integers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .max(Integer::compare)
                .stream()
                .forEach(x -> System.out.println("max square: " + x));

    }
}