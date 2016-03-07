package xyz.yhsj.mvprodemo.model.impl;

/**
 * 数据加载回调，仅用于测试，一般用不到，或者直接传入网络的回调方法
 * Created by LOVE on 2016/1/22.
 */
public interface OnLoadDataListener<T> {

    void onSuccess(T data);

    void onError();
}
