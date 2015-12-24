package xyz.yhsj.mvprodemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;

import xyz.yhsj.mvpro.presenter.ActivityPresenterImpl;
import xyz.yhsj.mvprodemo.view.MainView;

public class MainActivity extends ActivityPresenterImpl<MainView> implements View.OnClickListener {


    @Override
    public void created(Bundle savedInstance) {
        super.created(savedInstance);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fab) {
            Snackbar.make(v, "......这是文字......", Snackbar.LENGTH_SHORT).show();
        }
    }
}
