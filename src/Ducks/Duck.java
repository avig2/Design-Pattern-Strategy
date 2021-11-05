package Ducks;

import Behaviours.FlyBehaviour;

public class Duck {
    private  FlyBehaviour flyBehaviour;
    public Duck(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performFly(){
        this.flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("I am Swimming!!");
    }

}
