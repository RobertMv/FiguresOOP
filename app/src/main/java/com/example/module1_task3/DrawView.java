package com.example.module1_task3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

import com.example.module1_task3.Figures.Circle;
import com.example.module1_task3.Figures.ColorChangeable;
import com.example.module1_task3.Figures.Ellipse;
import com.example.module1_task3.Figures.Figure;
import com.example.module1_task3.Figures.Point;
import com.example.module1_task3.Figures.Rectangle;
import com.example.module1_task3.Figures.Square;

import java.util.Random;

class DrawView extends View {

    private Random random;
    private Figure[] figures;

    public DrawView(Context context) {
        super(context);
        random = new Random();
        Circle circle = new Circle(new Point(60, 60), 30);
        Circle circle1 = new Circle(new Point(100, 200), 60);
        Square square = new Square(new Point(223, 41), 95);
        Square square1 = new Square(new Point(663, 441), 30);
        Ellipse ellipse = new Ellipse(new Point(886, 355), 10, 20);
        Ellipse ellipse1 = new Ellipse(new Point(440, 555), 5, 150);
        Rectangle rectangle = new Rectangle(new Point(399, 62), 25, 70);
        Rectangle rectangle1 = new Rectangle(new Point(525, 112), 90, 35);

        figures = new Figure[]{circle, circle1, ellipse, ellipse1, square, square1, rectangle, rectangle1};


    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        for (Figure figure : figures) {
            figure.draw(canvas);
        }
    }

    @Override
    public void invalidate() {
        for (Figure figure : figures) {
            figure.moveTo(random.nextInt(6) - 3, random.nextInt(6) - 3);
            if (figure instanceof ColorChangeable) {
                ((ColorChangeable) figure).changeColor(-random.nextInt(16777216));
            }
        }
        super.invalidate();
    }
}
