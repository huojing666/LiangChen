package DesignMode.TemplateMethodPattern;

public abstract class CarModel {

    //启动
    protected abstract void start();
    //暂停
    protected abstract void stop();
    //鸣笛
    protected abstract void alarm();
    //引擎声
    protected abstract void engineBoom();

    final public void run(){
        this.start();
        this.engineBoom();
        if (this.isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    //钩子方法 约束子类行为
    protected boolean isAlarm(){
        return true;
    }
}
