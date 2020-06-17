package DesignMode.TemplateMethodPattern;

public class TestCar {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.setAlarm(true);
        car1.run();

        Car2 car2 = new Car2();
        car2.run();
    }
}
