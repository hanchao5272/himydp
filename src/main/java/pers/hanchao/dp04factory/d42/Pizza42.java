package pers.hanchao.dp04factory.d42;

/**
 * <p>披萨</p>
 * @author hanchao 2018/5/1 10:58
 **/
public interface Pizza42 {
    /**
     * 准备原材料
     */
    public void prepare();
    /**
     * 烘烤
     */
    public void bake();
    /**
     * 切分
     */
    public void cut();
    /**
     * 装盒子
     */
    public void box();
}
