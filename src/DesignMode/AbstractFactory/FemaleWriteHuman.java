package DesignMode.AbstractFactory;

public class FemaleWriteHuman extends AbstractWriteHuman {
    @Override
    public void getSex() {
        System.out.println("I am write woman!");
    }
}
