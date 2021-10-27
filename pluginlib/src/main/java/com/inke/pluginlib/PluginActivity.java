package com.inke.pluginlib;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class PluginActivity extends Activity implements IPlugin {

    private int mFrom = FROM_INTERNAL;
    private Activity mProxyActivity;

    @Override
    public void attach(Activity activity) {
        mProxyActivity = activity;
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        if(saveInstanceState != null) {
            mFrom = saveInstanceState.getInt("FROM");
        }
        if(mFrom == FROM_INTERNAL) {
            super.onCreate(saveInstanceState);
            mProxyActivity = this;
        }
    }

    @Override
    public void setContentView(int layoutResId) {
        if(mFrom == FROM_INTERNAL) {
            super.setContentView(layoutResId);
        }
        mProxyActivity.setContentView(layoutResId);
    }

    @Override
    public void onStart() {
        if(mFrom == FROM_INTERNAL) {
            super.onStart();
        }
    }

    @Override
    public void onRestart() {
        if(mFrom == FROM_INTERNAL) {
            super.onRestart();
        }
    }
}
