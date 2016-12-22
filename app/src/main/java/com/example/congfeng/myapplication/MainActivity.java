package com.example.congfeng.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        me.nereo.multi_image_selector.MultiImageSelectorActivity dd;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
