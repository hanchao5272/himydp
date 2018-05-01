package pers.hanchao.dp04factory.d41;

/**
 * <p>披萨</p>
 * @author hanchao 2018/5/1 10:58
 **/
public class Pizza41 {
    private String name;

    public Pizza41() {
        this.name = "披萨";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void prepare(){
        System.out.println(this.name + ":" + "准备原料");
    };
    public void bake(){
        System.out.println(this.name + ":" + "烘烤");
    }
    public void cut(){
        System.out.println(this.name + ":" + "切片");
    }
    public void box(){
        System.out.println(this.name + ":" + "装盒子");
    }
}
