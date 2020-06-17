package DesignMode.AbstractFactory;

public interface HumanFactory {
    //创造黄种人
    Human createYellowHuman();
    //创造白种人
    Human createWriteHuman();
    //创造黑色人
    Human createBlackHuman();
}
