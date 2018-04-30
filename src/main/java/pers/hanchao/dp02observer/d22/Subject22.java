package pers.hanchao.dp02observer.d22;

/**
 * <p>自定义主题接口</p>
 * @author hanchao 2018/4/30 21:02
 **/
public interface Subject22 {
    /**
     * 注册观察者
     * @param observer 观察者
     */
    public void registerObserver(Observer22 observer);

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer22 observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();
}
