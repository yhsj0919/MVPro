package xyz.yhsj.mvprodemo.presenter;

import android.os.Bundle;
import android.view.View;

import com.google.gson.Gson;

import rx.Observer;
import rx.functions.Action1;
import xyz.yhsj.mvpro.presenter.AppCompatActivityPresenterImpl;
import xyz.yhsj.mvprodemo.R;
import xyz.yhsj.mvprodemo.model.empty.Weather;
import xyz.yhsj.mvprodemo.model.impl.WeatherImpl;
import xyz.yhsj.mvprodemo.view.MainView;

public class MainActivity extends AppCompatActivityPresenterImpl<MainView> implements View.OnClickListener {
    private WeatherImpl dataImpl;

    @Override
    public void created(Bundle savedInstance) {
        super.created(savedInstance);
        dataImpl = new WeatherImpl();
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.fab) {
            dataImpl.getWeather("36.663", "117.009").subscribe(new Action1<Weather>() {
                @Override
                public void call(Weather weather) {
                    mView.getContent().setText(new Gson().toJson(weather));
                }
            });
        }

    }

}
