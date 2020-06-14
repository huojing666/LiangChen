package DesignMode;

import java.util.Collection;
import java.util.HashMap;

public class Father {
    public Collection doSomethings(HashMap map){
        System.out.println("父类方法被执行……");
        return  map.values();
    }
}
