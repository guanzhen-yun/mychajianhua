package com.inke.neplug;

import android.os.Bundle;

import com.inke.pluginlib.PluginActivity;

public class PlugActivity extends PluginActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plug);
    }
}