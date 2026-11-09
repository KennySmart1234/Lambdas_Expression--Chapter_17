package functions;

import java.security.SecureRandom;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierImpl {
    public static void main(String[] args) {

        Supplier<Integer> integerSupplier = () ->
                new SecureRandom().nextInt(1, 5);

        Stream.generate(integerSupplier)
                .forEach((number)-> System.out.print(number));

    }
}
