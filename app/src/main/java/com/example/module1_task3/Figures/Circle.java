package com.example.module1_task3.Figures;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circle extends Figure {

    private int radius;
    private Paint paint;

    public Circle(Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public void draw(Canvas canvas) {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(getPoint().getX(), getPoint().getY(), getRadius(), paint);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
