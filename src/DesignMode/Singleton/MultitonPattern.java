package DesignMode.Singleton;


import java.util.ArrayList;
import java.util.Random;

//多例模式
public class MultitonPattern {

    //限制最多三个实例
    private static int maxPattern = 2;

    //使用ArrayList存储每个对象的属性
    private static ArrayList<String> nameList = new ArrayList<String>();

    //使用ArrayList存储对象
    private static volatile ArrayList<MultitonPattern> list = new ArrayList<MultitonPattern>();

    //当前实例序号
    private static int countNowNumber = 0;

    //产生所有的对象
    static {
        for (int i = 0; i <maxPattern ; i++) {
            list.add(new MultitonPattern("实例"+i));
        }
    }

    //限制不产生第二个实例
    private MultitonPattern() {
    }

    //传入实例名称 建立实例对象
    private MultitonPattern(String name) {
        nameList.add(name);
    }

    //随机获取一个实例
    public static synchronized MultitonPattern getInstance(){
        Random random = new Random();
        //产生一个随机数 代表当前实例
        countNowNumber = random.nextInt(maxPattern);
        return list.get(countNowNumber);
    }

    //实例动作
    public static void doSomething(){
        System.out.println(nameList.get(countNowNumber));
    }
}
