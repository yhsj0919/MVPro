package xyz.yhsj.mvprodemo.model.empty;

/**
 * 预警
 * Created by LOVE on 2016/1/27.
 */
public class AlertsEntity {
    /**
     * detail : 青岛市气象台2015年12月01日14时15分发布大风蓝色预警信号：目前，我市沿海地区及近海海域南风阵风已达7级，预计今天下午到前半夜，上述地区南风依然较大。另外，受较强冷空气影响，今天后半夜起全市转北风，陆地风力将逐渐增至5到6级阵风8级，海上7到8级阵风10级，请注意防范。
     * level : 蓝色
     * pubTime : 2015-12-01T14:15:00+08:00
     * title : 青岛市发布大风蓝色预警
     * type : 大风
     */
    private String detail;
    private String level;
    private String pubTime;
    private String title;
    private String type;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
