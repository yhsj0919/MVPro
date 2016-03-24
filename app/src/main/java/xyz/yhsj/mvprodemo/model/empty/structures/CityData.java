package xyz.yhsj.mvprodemo.model.empty.structures;

import xyz.yhsj.mvprodemo.model.empty.AdditionInfoEntity;

/**
 * Created by LOVE on 2016/1/27.
 */
public class CityData {

    /**
     * additionInfo : {"locale":"zh_CN","source":["xiaomi"],"status":"0","timestamp":1449046526332}
     * affiliation : 济南,山东,中国
     * key : weathercn 101120101
     * latitude : 36.663
     * locale :
     * longitude : 117.009
     * name : 济南
     * timeZoneShift : 28800
     */

    private String affiliation;
    private String key;
    private String latitude;
    private String locale;
    private String longitude;
    private String name;
    private int timeZoneShift;
    private AdditionInfoEntity additionInfo;

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeZoneShift() {
        return timeZoneShift;
    }

    public void setTimeZoneShift(int timeZoneShift) {
        this.timeZoneShift = timeZoneShift;
    }

    public AdditionInfoEntity getAdditionInfo() {
        return additionInfo;
    }

    public void setAdditionInfo(AdditionInfoEntity additionInfo) {
        this.additionInfo = additionInfo;
    }
}
