package xyz.yhsj.mvprodemo.model.impl;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import xyz.yhsj.mvprodemo.model.empty.Weather;
import xyz.yhsj.mvprodemo.model.service.WeatherService;
import xyz.yhsj.mvprodemo.common.RetrofitClient;

/**
 * 数据接口实现类，在这里完善各种操作
 * Created by LOVE on 2016/1/22.
 */
public class WeatherImpl {
    private WeatherService weatherService;

    public WeatherImpl() {
        weatherService = RetrofitClient.getInstance().create(WeatherService.class);
    }

    public Observable<Weather> getWeather(String latitude, String longitude) {
        return weatherService
                .getWeather(latitude, longitude)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }


}
