package xyz.yhsj.mvprodemo.model.empty;


import java.util.List;


/**
 * Created by LOVE on 2016/1/27.
 */
public class Weather {

    private CurrentEntity current;
    private ForecastDailyEntity forecastDaily;
    private ForecastHourlyEntity forecastHourly;
    private IndicesEntity indices;
    private AqiEntity aqi;
    private YesterdayEntity yesterday;
    private UrlEntity url;
    private List<AlertsEntity> alerts;

    private int errCode;
    private String errDesc;


    public CurrentEntity getCurrent() {
        return current;
    }

    public void setCurrent(CurrentEntity current) {
        this.current = current;
    }

    public ForecastDailyEntity getForecastDaily() {
        return forecastDaily;
    }

    public void setForecastDaily(ForecastDailyEntity forecastDaily) {
        this.forecastDaily = forecastDaily;
    }

    public ForecastHourlyEntity getForecastHourly() {
        return forecastHourly;
    }

    public void setForecastHourly(ForecastHourlyEntity forecastHourly) {
        this.forecastHourly = forecastHourly;
    }

    public IndicesEntity getIndices() {
        return indices;
    }

    public void setIndices(IndicesEntity indices) {
        this.indices = indices;
    }

    public AqiEntity getAqi() {
        return aqi;
    }

    public void setAqi(AqiEntity aqi) {
        this.aqi = aqi;
    }

    public YesterdayEntity getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterdayEntity yesterday) {
        this.yesterday = yesterday;
    }

    public UrlEntity getUrl() {
        return url;
    }

    public void setUrl(UrlEntity url) {
        this.url = url;
    }

    public List<AlertsEntity> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<AlertsEntity> alerts) {
        this.alerts = alerts;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }

    public int getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }
}
