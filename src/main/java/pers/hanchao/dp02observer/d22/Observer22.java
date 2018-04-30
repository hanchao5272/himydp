package pers.hanchao.dp02observer.d22;

/**
 * <p>自定义观察者接口</p>
 * @author hanchao 2018/4/30 21:03
 **/
public interface Observer22 {
    //更新数据
    public void update(float temperature,float humidity,float pressure);
}
