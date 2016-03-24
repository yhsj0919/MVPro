package xyz.yhsj.mvprodemo.model.service;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import xyz.yhsj.mvprodemo.model.empty.Weather;

/**
 * retrofit2 的接口类
 * Created by LOVE on 2016/1/22.
 */
public interface WeatherService {

    @GET("weather/all?isGlobal=false&locale=zh_cn&appKey=weather20151024")
    Observable<Weather> getWeather(@Query("latitude") String latitude, @Query("longitude") String longitude);
}
