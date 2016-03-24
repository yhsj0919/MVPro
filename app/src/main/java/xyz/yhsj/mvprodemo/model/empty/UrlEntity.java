package xyz.yhsj.mvprodemo.model.empty;

/**
 * 天气支持地址
 * Created by LOVE on 2016/1/27.
 */
public class UrlEntity {
    /**
     * weathercn : http://mobile.weather.com.cn/city/101120201.html?par=Xiaomi
     * caiyun : http://caiyunapp.com
     */
    private String weathercn;
    private String caiyun;

    public String getWeathercn() {
        return weathercn;
    }

    public void setWeathercn(String weathercn) {
        this.weathercn = weathercn;
    }

    public String getCaiyun() {
        return caiyun;
    }

    public void setCaiyun(String caiyun) {
        this.caiyun = caiyun;
    }
}
