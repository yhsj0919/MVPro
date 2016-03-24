package xyz.yhsj.mvprodemo.model.empty;


/**
 * 每天预报
 * Created by LOVE on 2016/1/27.
 */

import xyz.yhsj.mvprodemo.model.empty.structures.Public_PSV;
import xyz.yhsj.mvprodemo.model.empty.structures.Public_SUV;
import xyz.yhsj.mvprodemo.model.empty.structures.Public_SV;
import xyz.yhsj.mvprodemo.model.empty.structures.Value_FT;
import xyz.yhsj.mvprodemo.model.empty.structures.WindData;

/**
 * aqi : {"pubTime":"2015-12-02T00:00:00+08:00","status":0,"value":[94,35,35,42,61]}
 * precipitationProbability : {"status":0,"value":["0","0","0","0","20"]}
 * pubTime : 2015-12-02T08:00:00+08:00
 * status : 0
 * sunRiseSet : {"status":0,"value":[{"from":"2015-12-02T06:50:00+08:00","to":"2015-12-02T16:44:00+08:00"},{"from":"2015-12-03T06:51:00+08:00","to":"2015-12-03T16:44:00+08:00"},{"from":"2015-12-04T06:52:00+08:00","to":"2015-12-04T16:44:00+08:00"},{"from":"2015-12-05T06:53:00+08:00","to":"2015-12-05T16:44:00+08:00"},{"from":"2015-12-06T06:54:00+08:00","to":"2015-12-06T16:44:00+08:00"}]}
 * temperature : {"status":0,"unit":"℃","value":[{"from":"7","to":"0"},{"from":"4","to":"-1"},{"from":"5","to":"0"},{"from":"8","to":"3"},{"from":"8","to":"3"}]}
 * weather : {"status":0,"value":[{"from":"1","to":"1"},{"from":"1","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"1","to":"1"}]}
 * wind : {"direction":{"status":0,"unit":"°","value":[{"from":"315","to":"315"},{"from":"315","to":"315"},{"from":"315","to":"0"},{"from":"180","to":"180"},{"from":"180","to":"0"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"48.0","to":"48.0"},{"from":"48.0","to":"48.0"},{"from":"48.0","to":"22.4"},{"from":"22.4","to":"22.4"},{"from":"22.4","to":"22.4"}]}}
 */

public class ForecastDailyEntity {
    private Public_PSV<Integer> aqi;
    private Public_SV<String> precipitationProbability;
    private String pubTime;
    private int status;
    private Public_SV<Value_FT> sunRiseSet;
    private Public_SUV<Value_FT> temperature;
    private Public_SV<Value_FT> weather;
    private WindData<Public_SUV<Value_FT>, Public_SUV<Value_FT>> wind;

    public Public_PSV<Integer> getAqi() {
        return aqi;
    }

    public void setAqi(Public_PSV<Integer> aqi) {
        this.aqi = aqi;
    }

    public Public_SV<String> getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(Public_SV<String> precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Public_SV<Value_FT> getSunRiseSet() {
        return sunRiseSet;
    }

    public void setSunRiseSet(Public_SV<Value_FT> sunRiseSet) {
        this.sunRiseSet = sunRiseSet;
    }

    public Public_SUV<Value_FT> getTemperature() {
        return temperature;
    }

    public void setTemperature(Public_SUV<Value_FT> temperature) {
        this.temperature = temperature;
    }

    public Public_SV<Value_FT> getWeather() {
        return weather;
    }

    public void setWeather(Public_SV<Value_FT> weather) {
        this.weather = weather;
    }

    public WindData<Public_SUV<Value_FT>, Public_SUV<Value_FT>> getWind() {
        return wind;
    }

    public void setWind(WindData<Public_SUV<Value_FT>, Public_SUV<Value_FT>> wind) {
        this.wind = wind;
    }
}
