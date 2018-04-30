package pers.hanchao.dp02observer.d23;

import java.util.Observable;

/**
 * <p>JDK内置观察者模式-继承可观察者</p>
 * @author hanchao 2018/4/30 23:21
 **/
public class WeatherData23 extends Observable{
    /* 温度*/
    private float temperature;
    /* 湿度*/
    private float humidity;
    /* 气压*/
    private float pressure;

    public WeatherData23() {
        //无需手动初始化观察者集合了
    }

    /**
     * 气象站数据更新时--“拉取”
     */
    public void measurementsChanged(float temperature,float humidity,float pressure){
        //获取最新数据
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //表示状态已经改变
        this.setChanged();
        //通知所有观察者
        notifyObservers();
    }

    /**
     * 气象站数据更新时--“推送”
     */
    public void measurementsChanged2(WeatherEntity weatherEntity){
        //获取最新数据
        this.temperature = weatherEntity.getTemperature();
        this.humidity = weatherEntity.getHumidity();
        this.pressure = weatherEntity.getPressure();
        //表示状态已经改变
        this.setChanged();
        //通知所有观察者
        notifyObservers(weatherEntity);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
