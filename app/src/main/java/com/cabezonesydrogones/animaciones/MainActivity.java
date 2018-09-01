package com.cabezonesydrogones.animaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.imagen);
        boton = findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //trans();
                //rotacion();
                //dilatacion();
                //contraccion();
                //aparicion();
                desaparicion();
                aparicion();
            }
        });


    }
    public void trans(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.translacion);
        //animation.setFillAfter(true); //detiene la animacion en el punto final
        imagen.startAnimation(animation);
    }

    public void rotacion(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotacion);
        animation.setFillAfter(true);
        imagen.startAnimation(animation);
    }

    public void dilatacion(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.dilatacion);
        animation.setFillAfter(true);
        imagen.startAnimation(animation);
    }

    public void contraccion(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.contraccion);
        animation.setFillAfter(true);
        imagen.startAnimation(animation);
    }
    public void aparicion(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.aparicion);
        animation.setFillAfter(true);
        imagen.startAnimation(animation);
    }

    public void desaparicion(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.desaparicion);
        animation.setFillAfter(true);
        imagen.startAnimation(animation);
    }
}
