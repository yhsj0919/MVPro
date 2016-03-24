package xyz.yhsj.mvprodemo.model.empty.structures;

/**
 * Created by LOVE on 2016/1/27.
 */
public class Public_PSV<T> extends Public_SV<T> {
    private String pubTime;

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }
}
