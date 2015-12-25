package xyz.yhsj.mvprodemo.view;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import xyz.yhsj.mvpro.helper.EventHelper;
import xyz.yhsj.mvpro.view.ViewImpl;
import xyz.yhsj.mvprodemo.R;

/**
 * Created by LOVE on 2015/12/24.
 */
public class MainView extends ViewImpl {
    @Bind(R.id.fab)
    FloatingActionButton fab;

    @Override
    public void created() {
        super.created();
        ButterKnife.bind(this,mRootView);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Toolbar getToolbar() {
        return findViewById(R.id.toolbar);
    }

    @Override
    public void bindEvent() {
        ButterKnife.bind(mPresenter,mRootView);
        EventHelper.click(mPresenter, fab);
    }

    @Override
    public int getOptionsMenuId() {
        return R.menu.menu_main;
    }


}
