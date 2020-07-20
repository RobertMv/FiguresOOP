package com.example.module1_task3.Figures;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Rectangle extends Square {

    private int anotherSide;
    private Paint paint;

    public Rectangle(Point point, int side, int anotherSide) {
        super(point, side);
        this.anotherSide = anotherSide;
    }

    @Override
    public void changeColor(int color) {
        paint.setColor(color);
    }

    @Override
    public void draw(Canvas canvas) {
        paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawRect(
                getPoint().getX(),
                getPoint().getY(),
                getPoint().getX() + getSide(),
                getPoint().getY() + getAnotherSide(),
                paint
        );
    }

    public int getAnotherSide() {
        return anotherSide;
    }

    public void setAnotherSide(int anotherSide) {
        this.anotherSide = anotherSide;
    }
}
