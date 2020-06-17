package DesignMode.TemplateMethodPattern;

public class Car1 extends CarModel {

    private  boolean alarm = true;
    @Override
    protected void start() {
        System.out.println("car1 start!");
    }

    @Override
    protected void stop() {
        System.out.println("car1 stop!");
    }

    @Override
    protected void alarm() {
        System.out.println("di~di~di~");
    }

    @Override
    protected void engineBoom() {
        System.out.println("car1 !");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }
}
