package pers.hanchao.dp01strategy.d14;

/**
 * <p>用实现多借口的方式来实现</p>
 * @author hanchao 2018/4/28 21:55
 **/
public abstract class Duck14 {
    /** 鸭子的名字 */
    private String name;

    public Duck14(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>游泳</p>
     * @author hanchao 2018/4/28 21:57
     **/
    void swim(){
        System.out.println(this.name + ": 正在游泳。");
    }

    /**
     * <p>外观</p>
     * @author hanchao 2018/4/28 21:57
     **/
    abstract void display();
}
