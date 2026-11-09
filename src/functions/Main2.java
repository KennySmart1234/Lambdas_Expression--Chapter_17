package functions;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int [] numbers = {3, 10, 8, 7, 5};
        Arrays.stream(numbers)
                .map((number)-> number*number)
                .filter((number)-> number > 20)
                .forEach((number)-> System.out.println(number));

        System.out.print(Arrays.toString(numbers));
    }
}
