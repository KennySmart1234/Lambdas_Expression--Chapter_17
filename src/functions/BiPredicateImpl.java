package functions;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> areEqual =
                (x, y) -> x.equals(y);
        System.out.println(areEqual.test(7, 5));

    }
}
