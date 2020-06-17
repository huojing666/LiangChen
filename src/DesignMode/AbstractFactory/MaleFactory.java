package DesignMode.AbstractFactory;

public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWriteHuman() {
        return new MaleWriteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackMan();
    }
}
