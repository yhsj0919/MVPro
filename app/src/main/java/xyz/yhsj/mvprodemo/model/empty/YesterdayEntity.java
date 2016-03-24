package xyz.yhsj.mvprodemo.model.empty;

/**
 * 昨天天气
 * Created by LOVE on 2016/1/27.
 */
public class YesterdayEntity {
    /**
     * date : 2015-12-01T00:00:00+08:00
     * status : 0
     * tempMax : 12
     * tempMin : 9
     * weatherEnd : 1
     * weatherStart : 18
     * windDircEnd : 270
     * windDircStart : 135
     * windSpeedEnd : 24.0
     * windSpeedStart : 3.0
     */
    private String date;
    private int status;
    private String tempMax;
    private String tempMin;
    private String weatherEnd;
    private String weatherStart;
    private String windDircEnd;
    private String windDircStart;
    private String windSpeedEnd;
    private String windSpeedStart;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTempMax() {
        return tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getTempMin() {
        return tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getWeatherEnd() {
        return weatherEnd;
    }

    public void setWeatherEnd(String weatherEnd) {
        this.weatherEnd = weatherEnd;
    }

    public String getWeatherStart() {
        return weatherStart;
    }

    public void setWeatherStart(String weatherStart) {
        this.weatherStart = weatherStart;
    }

    public String getWindDircEnd() {
        return windDircEnd;
    }

    public void setWindDircEnd(String windDircEnd) {
        this.windDircEnd = windDircEnd;
    }

    public String getWindDircStart() {
        return windDircStart;
    }

    public void setWindDircStart(String windDircStart) {
        this.windDircStart = windDircStart;
    }

    public String getWindSpeedEnd() {
        return windSpeedEnd;
    }

    public void setWindSpeedEnd(String windSpeedEnd) {
        this.windSpeedEnd = windSpeedEnd;
    }

    public String getWindSpeedStart() {
        return windSpeedStart;
    }

    public void setWindSpeedStart(String windSpeedStart) {
        this.windSpeedStart = windSpeedStart;
    }
}
