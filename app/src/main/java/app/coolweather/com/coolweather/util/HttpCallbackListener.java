package app.coolweather.com.coolweather.util;

/**
 * Created by genglingbao on 2015/6/11.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
