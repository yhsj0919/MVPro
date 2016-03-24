package xyz.yhsj.mvprodemo.model.empty;


import xyz.yhsj.mvprodemo.model.empty.structures.Public_PSUV;
import xyz.yhsj.mvprodemo.model.empty.structures.Public_PSV;

/**
 * 每小时预报
 * Created by LOVE on 2016/1/27.
 */
public class ForecastHourlyEntity {
    private Public_PSV<Integer> aqi;
    private int status;
    private Public_PSUV<Integer> temperature;
    private Public_PSV<Integer> weather;

    public Public_PSV<Integer> getAqi() {
        return aqi;
    }

    public void setAqi(Public_PSV<Integer> aqi) {
        this.aqi = aqi;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Public_PSUV<Integer> getTemperature() {
        return temperature;
    }

    public void setTemperature(Public_PSUV<Integer> temperature) {
        this.temperature = temperature;
    }

    public Public_PSV<Integer> getWeather() {
        return weather;
    }

    public void setWeather(Public_PSV<Integer> weather) {
        this.weather = weather;
    }
}
