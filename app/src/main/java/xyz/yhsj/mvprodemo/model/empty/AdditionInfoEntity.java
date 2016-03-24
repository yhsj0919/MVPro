package xyz.yhsj.mvprodemo.model.empty;

import java.util.List;

/**
 * Created by LOVE on 2016/1/27.
 */
public class AdditionInfoEntity {


    /**
     * locale : zh_CN
     * source : ["xiaomi"]
     * status : 0
     * timestamp : 1449046526332
     */

    private String locale;
    private String status;
    private long timestamp;
    private List<String> source;

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setSource(List<String> source) {
        this.source = source;
    }

    public String getLocale() {
        return locale;
    }

    public String getStatus() {
        return status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public List<String> getSource() {
        return source;
    }
}
