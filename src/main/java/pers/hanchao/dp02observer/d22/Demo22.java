package pers.hanchao.dp02observer.d22;

import pers.hanchao.dp02observer.d22.impl.CurrentConditionDisplay22;
import pers.hanchao.dp02observer.d22.impl.ForecastDisplay22;
import pers.hanchao.dp02observer.d22.impl.StatisticsDisplay22;
import pers.hanchao.dp02observer.d22.impl.WeatherData22;

/**
 * <p>通过自定义的观察者模式进行实践</p>
 * @author hanchao 2018/4/30 21:21
 **/
public class Demo22 {
    /**
     * <p></p>
     * @author hanchao 2018/4/30 21:21
     **/
    public static void main(String[] args) {
        //定义一个主题
         WeatherData22 weatherData = new WeatherData22();
         //定义三个天气板
        Observer22 currentConditionDisplay = new CurrentConditionDisplay22(weatherData);
        Observer22 forecastDisplay22 = new ForecastDisplay22(weatherData);
        Observer22 statisticsDisplay22 = new StatisticsDisplay22(weatherData);
        //模拟气象变换
        weatherData.measurementsChanged(11.5F,2,3.33F);
        weatherData.measurementsChanged(2F,11.4F,32.33F);
    }
}
