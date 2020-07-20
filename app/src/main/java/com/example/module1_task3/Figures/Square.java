package com.example.module1_task3.Figures;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Square extends Figure implements ColorChangeable {
    private int side;
    private Paint paint;

    public Square(Point point, int side) {
        super(point);
        this.side = side;
    }

    @Override
    public void changeColor(int color) {
        paint.setColor(color);
    }

    @Override
    public void draw(Canvas canvas) {
        paint = new Paint();
        paint.setColor(Color.GREEN);
        canvas.drawRect(
                getPoint().getX(),
                getPoint().getY(),
                getPoint().getX() + getSide(),
                getPoint().getY() + getSide(),
                paint
        );
    }



    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
