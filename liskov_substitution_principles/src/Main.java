import birds.Bird;
import birds.FlyingBird;
import birds.Ostrich;
import birds.Sparrow;

public class Main {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        Bird ostrich = new Ostrich();
        ostrich.eat();
    }
}