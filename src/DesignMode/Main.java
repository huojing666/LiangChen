package DesignMode;

import java.util.HashMap;

//里氏替换原则
public class Main {
    public static void main(String[] args) {
        //Father f = new Father();
        Son son = new Son();
        HashMap map = new HashMap();
        son.doSomethings(map);
    }
}
