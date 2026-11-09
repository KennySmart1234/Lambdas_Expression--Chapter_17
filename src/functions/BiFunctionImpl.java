package functions;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        System.out.println(multiply.apply(3, 20));
        System.out.println(multiply.apply(8, 5));
    }
}
