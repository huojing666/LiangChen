package DesignMode.AbstractFactory;

public abstract class AbstractBlackHuman implements Human {

    public void getColor() {
        System.out.println("I am Black people!");
    }


    public void talk() {
        System.out.println("I can not speak Chinese!");
    }
}
