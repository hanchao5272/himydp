package pers.hanchao.dp02observer.d22.impl;

import pers.hanchao.dp02observer.d22.Display22;
import pers.hanchao.dp02observer.d22.Observer22;
import pers.hanchao.dp02observer.d22.Subject22;

/**
 * <p>第三个天气板</p>
 * @author hanchao 2018/4/30 21:24
 **/
public class StatisticsDisplay22 implements Observer22,Display22 {
    /* 温度*/
    private float temperature;
    /* 湿度*/
    private float humidity;
    /* 气压*/
    private float pressure;
    /* 主题--用于关注/取消关注主题 */
    private Subject22 weatherData;

    public StatisticsDisplay22(Subject22 weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public String toString() {
        return "StatisticsDisplay22{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        //设置最新天气
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //展示数据
        display();
    }
}
