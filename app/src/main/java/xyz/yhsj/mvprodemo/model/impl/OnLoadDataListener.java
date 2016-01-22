package xyz.yhsj.mvprodemo.model.impl;

import xyz.yhsj.mvprodemo.model.empty.User;

/**
 * 数据加载回调，仅用于测试，一般用不到，或者直接传入网络的回调方法
 * Created by LOVE on 2016/1/22.
 */
public interface OnLoadDataListener {

    void onSuccess(User user);

    void onError();
}
