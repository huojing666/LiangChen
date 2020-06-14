package DesignMode.Factory;

public class WhiteHuman implements Human  {
    @Override
    public void getColor() {
        System.out.println("我是白种人");
    }

    @Override
    public void talk() {
        System.out.println("我会英语");
    }
}
