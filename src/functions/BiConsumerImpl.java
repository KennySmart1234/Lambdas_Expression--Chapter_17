package functions;

import java.util.Map;

public class BiConsumerImpl {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of(
                "Kenny", 10,
                "Olatunji", 20,
                "Smart", 15

        );

        map.forEach((name, age) ->
                System.out.printf("%s is %d years old\n", name, age));
    }
}
