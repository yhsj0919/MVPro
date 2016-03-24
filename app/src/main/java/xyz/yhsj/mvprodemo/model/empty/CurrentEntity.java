package xyz.yhsj.mvprodemo.model.empty;

/**
 * 现在的天气
 * Created by LOVE on 2016/1/27.
 */


import xyz.yhsj.mvprodemo.model.empty.structures.Value_UV;
import xyz.yhsj.mvprodemo.model.empty.structures.WindData;

/**
 * feelsLike : {"unit":"℃","value":"0.9"}
 * humidity : {"unit":"%","value":"62"}
 * pressure : {"unit":"mb","value":"1013"}
 * pubTime : 2015-12-02T11:28:00+08:00
 * temperature : {"unit":"℃","value":"4"}
 * uvIndex : 2
 * visibility : {"unit":"km","value":"2.7"}
 * weather : 1
 * wind : {"direction":{"unit":"°","value":"0"},"speed":{"unit":"km/h","value":"24"}}
 */
public class CurrentEntity {
    private Value_UV feelsLike;
    private Value_UV humidity;
    private Value_UV pressure;
    private String pubTime;
    private Value_UV temperature;
    private String uvIndex;
    private Value_UV visibility;
    private String weather;
    private WindData<Value_UV, Value_UV> wind;
}
