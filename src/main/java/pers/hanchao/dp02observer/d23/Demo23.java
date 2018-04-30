package pers.hanchao.dp02observer.d23;

import java.util.Observer;

/**
 * <p>
 *     JDK内置的观察者模式
 * </p>
 * @author hanchao 2018/4/30 23:28
 **/
public class Demo23 {
    /**
     * <p></p>
     * @author hanchao 2018/4/30 23:28
     **/
    public static void main(String[] args) {
        //定义一个可观察者
         WeatherData23 weatherData = new WeatherData23();
         //定义三个观察者
        Observer concurrentConditionDisplay = new ConcurrentConditionDisplay23(weatherData);
        Observer forecastDisplay = new ForecastDisplay23(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay23(weatherData);
        //以拉取的形式发送信息
        weatherData.measurementsChanged(11.1F,22.2F,33F);
        weatherData.measurementsChanged(2,3.3F,11.5F);
        //以推送的形式发送数据
        weatherData.measurementsChanged(11.1F,22.2F,33F);
        weatherData.measurementsChanged(2,3.3F,11.5F);
    }
}
