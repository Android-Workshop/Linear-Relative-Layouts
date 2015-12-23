package com.example.jimit.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Change layout as given in res/layout to see difference between linear and relative
        setContentView(R.layout.layout_relative);
    }
}
