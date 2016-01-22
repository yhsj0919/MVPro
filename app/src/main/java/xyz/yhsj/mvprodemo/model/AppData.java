package xyz.yhsj.mvprodemo.model;

import xyz.yhsj.mvprodemo.model.impl.OnLoadDataListener;
import xyz.yhsj.mvprodemo.model.empty.User;
import xyz.yhsj.mvprodemo.model.impl.DataImpl;

/**
 * 数据获取类，定义好DataImpl，在这里一一实现，
 * Created by LOVE on 2016/1/22.
 */
public class AppData implements DataImpl {

    @Override
    public void getUser(OnLoadDataListener listener) {

        //生成随机数
        int temp = (int) (Math.random() * 10);
        //模拟加载错误
        if (temp == 9) {
            if (listener != null) {
                listener.onError();
            }
        } else {
            listener.onSuccess(new User("name" + temp, temp));
        }


    }
}
