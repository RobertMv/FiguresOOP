package com.example.module1_task3.Figures;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Ellipse extends Circle implements ColorChangeable{

    private int radius2;
    private Paint paint;

    public Ellipse(Point point, int radius, int radius2) {
        super(point, radius);
        this.radius2 = radius2;
    }

    @Override
    public void draw(Canvas canvas) {
        paint = new Paint();
        paint.setColor(Color.RED);
        canvas.drawOval(getPoint().getX(), getPoint().getY(), getRadius2() * 2, getRadius() * 2, paint);
    }

    @Override
    public void changeColor(int color) {
        paint.setColor(color);
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
}
