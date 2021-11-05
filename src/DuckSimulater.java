import Behaviours.FlyBehaviour;
import Behaviours.FlyWithRockerBehaviour;
import Behaviours.FlyWithWingsBehaviour;
import Ducks.Duck;

public class DuckSimulater {
    public static void main(String[] args) {
        System.out.println("Hello Ducks");
        FlyBehaviour flyWithWingsBehaviour = new FlyWithWingsBehaviour();
        FlyBehaviour flyWithRocketBehaviour = new FlyWithRockerBehaviour();
        Duck simpleDuck = new Duck(flyWithWingsBehaviour);
        simpleDuck.performFly();
        simpleDuck.swim();
        simpleDuck.setFlyBehaviour(flyWithRocketBehaviour);
        simpleDuck.performFly();
    }
}
