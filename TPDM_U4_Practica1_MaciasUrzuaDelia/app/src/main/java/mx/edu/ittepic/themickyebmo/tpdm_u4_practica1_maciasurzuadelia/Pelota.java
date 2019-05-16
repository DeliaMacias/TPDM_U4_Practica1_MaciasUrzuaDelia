package mx.edu.ittepic.themickyebmo.tpdm_u4_practica1_maciasurzuadelia;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

public class Pelota {
    int x,y,tam,dx,dy;
    Paint paint;

    public Pelota(int x, int y) {
        this.x = x;
        this.y = y;
        dx=1;
        dy=1;
        Random color = new Random();
        paint = new Paint();
        tam = 2+color.nextInt(300);
        paint.setColor(Color.rgb(1+color.nextInt(245),1+color.nextInt(245),1+color.nextInt(245)));
    }


    public void pintar(final Canvas canvas){
        canvas.drawCircle(x,y,tam,paint);
    }
    public void mover(int wid, int hei) {
        if(tam >90){
            x+=((tam*0.02))*dx;
            y+=((tam*0.02))*dy;
        }
        else if(tam>10){
            x+=((tam*0.53))*dx;
            y+=((tam*0.53))*dy;
        }
        else{
            x+=((tam*7))*dx;
            y+=((tam*7))*dy;
        }

        if(x >= (wid-(tam)) || x <= (tam)){
            dx*=-1;
        }
        if(y >=(hei-(tam)) || y <= (tam)){
            dy*=-1;
        }
    }


}
