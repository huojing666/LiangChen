package DesignMode.Factory;

public class FactoryHuman extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> tClass) {
        Human human = null;
        try {
            human = (T) Class.forName(tClass.getName()).newInstance();
        }catch (Exception e){
            System.out.println("生产错误"+e.getMessage());
        }
        return (T) human;
    }
}
