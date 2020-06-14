package DesignMode.Singleton;


//线程不安全的单例
//线程安全的单例子
public class LazySingleton {

//    private static LazySingleton lazySingleton = null;
//
//    //限制产生多个对象
//    private  LazySingleton(){
//
//    }
//
//    public static LazySingleton getLazySingleton() {
//
//        if (lazySingleton == null){
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }
    //线程安全
   private static volatile  LazySingleton lazySingleton = null;

    //限制产生多个对象
    private  LazySingleton(){

    }

    public static synchronized LazySingleton getLazySingleton() {

        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
