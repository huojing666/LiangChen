package DesignMode.Factory;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("我是黑种人");
    }

    @Override
    public void talk() {
        System.out.println("我会印第安语");
    }
}
