package functions;

import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<Integer> isEvenNumber = number -> number % 2 == 0;

        System.out.println(isEvenNumber.test(10));
        System.out.println(isEvenNumber.test(5));
    }
}
