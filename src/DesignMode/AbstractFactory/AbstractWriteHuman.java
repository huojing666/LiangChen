package DesignMode.AbstractFactory;

public abstract class AbstractWriteHuman implements Human  {
    public void getColor() {
        System.out.println("I am Write people!");
    }


    public void talk() {
        System.out.println("I can speak English!");
    }
}
