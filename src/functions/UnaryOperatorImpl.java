package functions;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    public static void main(String[] args) {
        UnaryOperator<Integer> doubleNumber =
                number -> number * 2;

        System.out.println(doubleNumber.apply(10));

    }
}
