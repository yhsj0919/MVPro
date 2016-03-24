package xyz.yhsj.mvprodemo.model.empty;

/**
 * 空气质量
 * Created by LOVE on 2016/1/27.
 */
public class AqiEntity {

    /**
     * aqi : 179
     * no2 : 45
     * pm10 : 174
     * pm25 : 135
     * pubTime : 2015-12-02T10:00:00+08:00
     * so2 : 43
     * src : 中国环境监测总站
     * status : -1
     */

    private String aqi;
    private String no2;
    private String pm10;
    private String pm25;
    private String pubTime;
    private String so2;
    private String src;
    private int status;

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
