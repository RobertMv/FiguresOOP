package com.example.module1_task3.Figures;

import android.graphics.Canvas;

public abstract class Figure {
    private Point point;

    public Figure(Point point) {
        this.point = point;
    }

    private void moveTo(Point point){
        point.setX(point.getX() + point.getX());
        point.setY(point.getY() + point.getY());
    }

    public abstract void draw(Canvas canvas);

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
