package functions;

import java.util.function.Function;

public class FunctionImpl {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = name -> name.length();

        System.out.println(stringLength.apply("KennySmart"));
        System.out.println(stringLength.apply("Olatunji"));
                


    }
}
