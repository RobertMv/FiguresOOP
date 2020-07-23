package com.example.module1_task3.Figures;

import android.graphics.Canvas;

public abstract class Figure {
    private Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public void moveTo(int x, int y) {
        point.setX(point.getX() + x);
        point.setY(point.getY() + y);
    }

    public abstract void draw(Canvas canvas);

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
