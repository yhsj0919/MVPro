package xyz.yhsj.mvprodemo.presenter;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import xyz.yhsj.mvpro.presenter.ActivityPresenterImpl;
import xyz.yhsj.mvprodemo.R;
import xyz.yhsj.mvprodemo.model.impl.OnLoadDataListener;
import xyz.yhsj.mvprodemo.model.AppData;
import xyz.yhsj.mvprodemo.model.empty.User;
import xyz.yhsj.mvprodemo.model.impl.DataImpl;
import xyz.yhsj.mvprodemo.view.MainView;

public class MainActivity extends ActivityPresenterImpl<MainView> implements View.OnClickListener, OnLoadDataListener {
    private DataImpl dataImpl;

    @Override
    public void created(Bundle savedInstance) {
        super.created(savedInstance);
        dataImpl = new AppData();
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.fab) {
            dataImpl.getUser(this);
        }

    }

    @Override
    public void onSuccess(User user) {
        Toast.makeText(this, user.getName(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onError() {
        Toast.makeText(this, "请求失败", Toast.LENGTH_LONG).show();
    }
}
