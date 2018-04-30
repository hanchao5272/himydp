package pers.hanchao.dp02observer.d23;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay23 implements Observer,Display23  {
    /* 温度*/
    private float temperature;
    /* 湿度*/
    private float humidity;
    /* 气压*/
    private float pressure;
    /* 可观察者--用于关注/取消关注主题 */
    private Observable weatherData;

    public StatisticsDisplay23(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public String toString() {
        return "StatisticsDisplay23{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    /**
     * 更新天气板
     * @param o 可观察者
     * @param arg 数据
     */
    @Override
    public void update(Observable o, Object arg) {
        //如果可观察者是气象站数据，则进行更新
        if (o instanceof WeatherData23){
            WeatherData23 weatherData = (WeatherData23) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
