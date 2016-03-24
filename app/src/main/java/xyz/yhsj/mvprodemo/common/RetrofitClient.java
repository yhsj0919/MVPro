package xyz.yhsj.mvprodemo.common;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A helper of retrofit2 for creating restful service easier.
 * <p/>
 * Created by LOVE on 2016/3/24.
 */
public class RetrofitClient {

    private static String HOST_NAME = "https://weatherapi.market.xiaomi.com/wtr-v3/";

    private static final RetrofitClient instance = new RetrofitClient();

    public static RetrofitClient getInstance() {
        return instance;
    }

    private Retrofit retrofit;

    public RetrofitClient() {
        createRetrofit();
    }

    private void createRetrofit() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(HOST_NAME)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }


    public <T> T create(Class<?> clazz) {
        return (T) retrofit.create(clazz);
    }

}
