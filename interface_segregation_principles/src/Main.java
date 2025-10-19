import workers.Eatable;
import workers.HumanWorker;
import workers.RobotWorker;
import workers.Workable;

public class Main {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        Workable robot = new RobotWorker();
        Eatable eater = new HumanWorker();

        human.work();
        robot.work();
        eater.eat();
    }
}