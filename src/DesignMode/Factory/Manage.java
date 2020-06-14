package DesignMode.Factory;


//工厂模式
//定义一个接口用于创建对象的接口，让子类决定实例化哪一个类。
//工厂方法使一个类的实例化延迟到其子类
public class Manage {
    public static void main(String[] args) {
        //定义工厂
        AbstractHumanFactory humanFactory = new FactoryHuman();

        //先生产白种人
        Human whriteHuman = humanFactory.createHuman(WhiteHuman.class);
        whriteHuman.getColor();
        whriteHuman.talk();

        //生产黄种人
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

        //生产黑种人
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

    }
}
