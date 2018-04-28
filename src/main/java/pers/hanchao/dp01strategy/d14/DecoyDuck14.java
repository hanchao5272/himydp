package pers.hanchao.dp01strategy.d14;

/**
 * <p>诱饵鸭</p>
 * @author hanchao 2018/4/28 22:05
 **/
public class DecoyDuck14 extends Duck14{

    public DecoyDuck14(String name) {
        super("诱饵鸭[" + name + "]");
    }

    /**
     * <p>外表</p>
     * @author hanchao 2018/4/28 22:02
     **/
    @Override
    public void display() {
        System.out.println(super.getName() + ": 外表是诱饵鸭。");
    }
}