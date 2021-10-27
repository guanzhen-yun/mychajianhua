package com.inke.pluginlib;

import android.app.Activity;
import android.os.Bundle;

public interface IPlugin {

    int FROM_INTERNAL = 0;//内部
    int FROM_EXTERNAL = 1;//外部

    void attach(Activity activity);

    void onCreate(Bundle saveInstanceState);

    void onStart();

    void onRestart();

}
