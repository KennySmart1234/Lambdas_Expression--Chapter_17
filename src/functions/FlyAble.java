package functions;

@FunctionalInterface
public interface FlyAble {
    void fly(int distance);

    static int flyBack() {
        return 1;
    }
}
