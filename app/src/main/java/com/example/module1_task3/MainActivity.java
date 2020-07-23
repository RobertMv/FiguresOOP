package com.example.module1_task3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private DrawView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new DrawView(this);
        setContentView(view);

//        final Handler handler = new Handler();
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                view.invalidate();
//                handler.postDelayed(this, 100);
//            }
//        }, 100);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            v.invalidate();
        }
        return true;
    }
}
