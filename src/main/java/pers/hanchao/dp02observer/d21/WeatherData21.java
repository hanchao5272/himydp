package pers.hanchao.dp02observer.d21;

/**
 * <p>2.1.错误示例：针对实现编程</p>
 * @author hanchao 2018/4/30 20:24
 **/
public class WeatherData21 {

    //定义三个天气板
    private CurrentConditionDisplay21 currentConditionDisplay;
    private ForecastDisplay21 forcasDisplay;
    private StatisticsDispaly21 statisticsDispaly;
    /**
     * 获取温度
     * @return 温度
     */
    public String getTemperature(){
        return null;
    };

    /**
     * 获取湿度
     * @return 湿度
     */
    public String getHumidity(){
        return null;
    }

    /**
     * 获取气压
     * @return 气压
     */
    public String getPressure(){
        return null;
    }

    /**
     * 一旦气象变动，就调用此方法
     */
    public void measurementsChanged(){
        //获取温度、湿度和气压
        String temperature = getTemperature();
        String humidity = getHumidity();
        String pressure = getPressure();
        //将天气情况告知天气板
        currentConditionDisplay.update(temperature,humidity,pressure);
        forcasDisplay.update(temperature,humidity,pressure);
        statisticsDispaly.update(temperature,humidity,pressure);
    }
}
