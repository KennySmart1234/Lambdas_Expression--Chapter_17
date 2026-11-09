package functions;


public class Main {
    public static void main(String[] args) {
        FlyAble jet = (distance) ->{
            System.out.print("I am jet tat flies at " + distance + "mph");
        };
        jet.fly(117);

        FlyAble bird = (distance)->
                System.out.print("I am jet tat flies at " + distance + "mph");
        bird.fly(11);
    }
}