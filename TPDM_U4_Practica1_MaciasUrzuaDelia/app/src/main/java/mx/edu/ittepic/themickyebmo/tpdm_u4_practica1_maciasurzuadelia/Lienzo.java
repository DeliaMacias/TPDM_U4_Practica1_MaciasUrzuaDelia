package mx.edu.ittepic.themickyebmo.tpdm_u4_practica1_maciasurzuadelia;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.CountDownTimer;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;

import java.util.Random;
import java.util.zip.ZipEntry;

public class Lienzo extends View {

    int width,height;
    CountDownTimer timer;
    Pelota pelota,p2,p3,p4,p5;
    Random posi;



    public Lienzo(Context context) {
        super(context);
        posi = new Random();
        width = getResources().getSystem().getDisplayMetrics().widthPixels;
        height = getResources().getSystem().getDisplayMetrics().heightPixels-230;


            pelota = new Pelota(1+posi.nextInt(width-90),1+posi.nextInt(height-90));
        p2 = new Pelota(10+posi.nextInt(width-90),1+posi.nextInt(height-90));
        p3 = new Pelota(10+posi.nextInt(width-90),1+posi.nextInt(height-90));
        p4 = new Pelota(10+posi.nextInt(width-90),1+posi.nextInt(height-90));
        p5 = new Pelota(10+posi.nextInt(width-90),1+posi.nextInt(height-90));
        timer = new CountDownTimer(30000,10) {
            @Override
            public void onTick(long l) {
                invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };
    }
    @Override
    protected void onDraw(Canvas canvas) {

        pelota.pintar(canvas);
        pelota.mover(width, height);

        p2.pintar(canvas);
        p2.mover(width, height);

        p3.pintar(canvas);
        p3.mover(width, height);

        p4.pintar(canvas);
        p4.mover(width, height);

        p4.pintar(canvas);
        p4.mover(width, height);
        timer.start();

    }
}
