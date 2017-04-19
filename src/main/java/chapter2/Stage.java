package chapter2;

/**
 * Created by dzbe1116 on 4/10/2017.
 */
public class Stage {
    private Stage(){};

    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}
