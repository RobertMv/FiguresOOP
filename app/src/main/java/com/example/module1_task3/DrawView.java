package com.example.module1_task3;

import android.content.Context;
import android.view.View;

import com.example.module1_task3.Figures.Figure;

class DrawView extends View {

    Figure [] figures = new Figure[8];

    public DrawView(Context context) {
        super(context);

    }
}
