package xyz.yhsj.mvpro.presenter;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;

import xyz.yhsj.mvpro.helper.GenericHelper;
import xyz.yhsj.mvpro.view.IView;


/**
 * 将Activity作为Presenter的基类 <br />
 * Created by qibin on 2015/11/15.
 */
public class FragmentActivityPresenterImpl<T extends IView> extends FragmentActivity implements IPresenter<T> {

    protected T mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        create(savedInstanceState);

        try {
            mView = getViewClass().newInstance();
            mView.bindPresenter(this);
            setContentView(mView.create(getLayoutInflater(), null));
            mView.bindEvent();
            created(savedInstanceState);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Class<T> getViewClass() {
        return GenericHelper.getViewClass(getClass());
    }

    @Override
    public void create(Bundle savedInstance) {

    }


    @Override
    public void created(Bundle savedInstance) {

    }
}
