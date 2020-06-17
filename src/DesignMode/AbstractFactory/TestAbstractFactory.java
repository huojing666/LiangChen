package DesignMode.AbstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        HumanFactory man = new MaleFactory();
        HumanFactory woman = new FemaleFactory();

        Human maleYellowHuman = man.createYellowHuman();
        Human femaleYellowHuman = woman.createYellowHuman();

        System.out.println("Yellow man");
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

        System.out.println("Yellow woman");
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        femaleYellowHuman.getColor();
    }
}
