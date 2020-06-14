package DesignMode.Singleton;


//饿汉单例模式
//单例确保某一个类只有一个实例，而且自行实例化并向整个系统提供使用
//单例模式与单一职责原则有冲突
public class EagerSingleton {

    private static final EagerSingleton eaferSingleton = new EagerSingleton();

    //限制产生多个对象
    private EagerSingleton() {
    }

    //通过该方法获取实例对象
    public static EagerSingleton getEaferSingleton() {
        return eaferSingleton;
    }

    //其他方法 尽量也用static
}

