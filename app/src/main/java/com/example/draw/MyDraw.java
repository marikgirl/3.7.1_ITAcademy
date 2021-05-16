package com.example.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {
    public MyDraw (Context context){
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();

        int px = 0;
        int py = 0;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(255,77,169,214));
        canvas.drawPaint(paint);

        //трава
        paint.setColor(Color.argb(255,8,194,20));
        py = height-200;
        px = 100;
        for(int i=0;i<7;i++){
            canvas.drawCircle(px,py, (float) (400+Math.random()*100),paint);
            px += 600;
        }

        //солнце
        paint.setColor(Color.argb(255,255,196,0));
        px=50;
        py=50;
        canvas.drawCircle(px,py,150,paint);
        paint.setStrokeWidth(7);
        paint.setColor(Color.argb(160,255,196,0));
        canvas.drawLine(0, 0, 330, 10, paint);
        canvas.drawLine(0, 0, 310, 80, paint);
        canvas.drawLine(0, 0, 270, 160, paint);
        canvas.drawLine(0, 0, 230, 235, paint);
        canvas.drawLine(0, 0, 170, 290, paint);
        canvas.drawLine(0, 0, 95, 320, paint);
        canvas.drawLine(10, 0, 20, 340, paint);

        //дом
        //основа
        paint.setColor(Color.argb(255,150,40,6));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(100,1100,700, 1900,paint);
        //крыша
        float rotate_center_x = 500; //центр поворота холста по оси X
        float rotate_center_y = 1000; // центр поворота холста по оси Y
        float rotate_angle = 315; //угол поворота
        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);
        canvas.drawRect(290,930,700, 1355,paint);
        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);

        //прорисовка границ дома и крыши
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setStyle(Paint.Style.STROKE);
        //границы крыши
        canvas.drawLine(100,1100, 400, 800,paint);
        canvas.drawLine(400,800, 700, 1100,paint);
        //границы дома
        canvas.drawRect(100,1100,700, 1900,paint);
        //окно на крыше
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.argb(255,175, 238, 238));
        canvas.drawCircle(400,1000,60,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.rgb(0, 0, 0));
        canvas.drawCircle(400,1000,60,paint);


        //окно
        paint.setColor(Color.argb(255,175, 238, 238));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(200,1350,300, 1700,paint);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(200,1350,300, 1700,paint);

        paint.setStrokeWidth(2);
        px=200;
        for (int i=0;i<4;i++) {
            canvas.drawLine(px,1350 , px, 1700, paint);
            px+=25;
        }
        py=1350;
        for (int i=0;i<7;i++) {
            canvas.drawLine(200,py,300, py, paint);
            py+=50;
        }

        //дверь
        paint.setColor(Color.rgb(240, 240, 98));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(400,1600,600, 1900,paint);
        paint.setColor(Color.rgb(0, 0, 0));
        canvas.drawCircle(450,1750,10,paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(400,1600,600, 1900,paint);
        paint.setStrokeWidth(2);

        px=600;
        py=1600;
        for (int i=0;i<11;i++) {
            canvas.drawLine(px,1600 , 600, py, paint);
            px-=20;
            py+=30;
        }
        px=400;
        py=1900;
        for (int i=0;i<10;i++) {
            canvas.drawLine(400,py,px, 1900, paint);
            px+=20;
            py-=30;
        }
        //дерево
        paint.setStrokeWidth(7);
        paint.setColor(Color.argb(255,107,40,6));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(900,800,1000, 1900,paint);

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.argb(255,57,140,18));
        canvas.drawCircle(900,800,250,paint);
        canvas.drawCircle(700,500,350,paint);
        canvas.drawCircle(1000,500,350,paint);

    }
}
