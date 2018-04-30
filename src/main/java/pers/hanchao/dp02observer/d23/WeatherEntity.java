package pers.hanchao.dp02observer.d23;

/**
 * <p>天气实体-</p>
 * @author hanchao 2018/4/30 23:49
 **/
public class WeatherEntity {
    /* 温度*/
    private float temperature;
    /* 湿度*/
    private float humidity;
    /* 气压*/
    private float pressure;

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    public WeatherEntity(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
