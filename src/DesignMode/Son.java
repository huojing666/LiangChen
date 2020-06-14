package DesignMode;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {

    public Collection doSomethings(Map map) {
        System.out.println("子类方法被执行");
        return map.values();
    }
}
