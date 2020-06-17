package DesignMode.AbstractFactory;

public class MaleWriteHuman extends AbstractWriteHuman {
    @Override
    public void getSex() {
        System.out.println("I am write man!");
    }
}
