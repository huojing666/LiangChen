package DesignMode.Singleton;

public class TestMultition {
    public static void main(String[] args) {
        //定义五个需要获取实例的模块
        int fangwen = 5;

        for (int i = 0; i <fangwen ; i++) {
            MultitonPattern multitonPattern = MultitonPattern.getInstance();
            System.out.print("第"+(i+1)+"个模块获取的实例是:");
            multitonPattern.doSomething();
        }
    }
}
