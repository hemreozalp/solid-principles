package birds;

public class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow eats seeds");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies");
    }
}
