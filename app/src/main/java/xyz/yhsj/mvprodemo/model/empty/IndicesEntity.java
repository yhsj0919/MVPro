package xyz.yhsj.mvprodemo.model.empty;

import java.util.List;

import xyz.yhsj.mvprodemo.model.empty.structures.IndicesData;


/**
 * 指数
 * Created by LOVE on 2016/1/27.
 */
public class IndicesEntity {
    private int status;
    private List<IndicesData> indices;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<IndicesData> getIndices() {
        return indices;
    }

    public void setIndices(List<IndicesData> indices) {
        this.indices = indices;
    }
}
