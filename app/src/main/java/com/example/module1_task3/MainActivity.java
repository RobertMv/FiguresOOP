package com.example.module1_task3;

import android.graphics.Point;
import android.os.Handler;
import android.support.constraint.solver.widgets.Rectangle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private DrawView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new DrawView(this);
        setContentView(view);

        final Handler handler = new Handler();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.invalidate();
                handler.postDelayed(this, 700);
            }
        }, 700);
    }

}
