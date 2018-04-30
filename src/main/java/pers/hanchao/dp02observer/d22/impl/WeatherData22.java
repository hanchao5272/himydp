package pers.hanchao.dp02observer.d22.impl;

import pers.hanchao.dp02observer.d22.Observer22;
import pers.hanchao.dp02observer.d22.Subject22;

import java.util.ArrayList;

/**
 * <p>天气数据-实现主题接口</p>
 * @author hanchao 2018/4/30 21:07
 **/
public class WeatherData22 implements Subject22 {
    /* 观察者集合*/
    private ArrayList<Observer22> observers;
    /* 温度*/
    private float temperature;
    /* 湿度*/
    private float humidity;
    /* 气压*/
    private float pressure;

    public WeatherData22() {
        observers = new ArrayList<>();
    }

    /**
     * 气象站数据更新时
     */
    public void measurementsChanged(float temperature,float humidity,float pressure){
        //获取最新数据
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //通知所有观察者
        notifyObservers();
    }

    /**
     * 注册观察者
     * @param observer 观察者
     */
    @Override
    public void registerObserver(Observer22 observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer22 observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        observers.forEach(observer->{observer.update(temperature,humidity,pressure);});
    }
}
