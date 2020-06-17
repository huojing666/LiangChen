package DesignMode.TemplateMethodPattern;

public class Car2 extends CarModel {
    @Override
    protected boolean isAlarm() {
        return true;
    }

    @Override
    protected void start() {
        System.out.println("car2 start");
    }

    @Override
    protected void stop() {
        System.out.println("car2 stop");
    }

    @Override
    protected void alarm() {
        System.out.println("di~di~di~");
    }

    @Override
    protected void engineBoom() {
        System.out.println("car2!");
    }
}
