package pers.hanchao.dp01strategy.d11;

/**
 * <p>鸭子-超类，实现部分共用方法，抽象部分个性方法</p>
 * @author hanchao 2018/4/28 0:03
 **/
public abstract class Duck11 {
    /** 鸭子名 */
    private String name;

    public Duck11(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>叫</p>
     * @author hanchao 2018/4/28 0:06
     **/
    void quack(){
        System.out.println(name + ": 正在呱呱叫！");
    }

    /**
     * <p>游泳</p>
     * @author hanchao 2018/4/28 0:06
     **/
    void swim(){
        System.out.println(name + ": 正在游泳！");
    }

    /**
     * <p>飞行</p>
     * @author hanchao 2018/4/28 20:42
     **/
    void fly(){
        System.out.println(name + ": 正在飞行！");
    }
    /**
     * <p>外观</p>
     * @author hanchao 2018/4/28 0:07
     **/
    abstract void display();
}
