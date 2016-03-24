package xyz.yhsj.mvprodemo.model.empty.structures;

import java.util.List;

/**
 * Created by LOVE on 2016/1/27.
 */
public class Public_SV<T> {
    private int status = 0;
    private List<T> value;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<T> getValue() {
        return value;
    }

    public void setValue(List<T> value) {
        this.value = value;
    }
}
