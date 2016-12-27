package com.androidbolivia.origamidenavidad;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imNav;
    private Animation animacion;
    private MediaPlayer sound;
    private int indica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imNav = (ImageView) findViewById(R.id.arbol_navi);
        sound = MediaPlayer.create(getApplicationContext(), R.raw.boton);
    }

    public void rot(View view) {
        sound.start();
        animacion = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotacion);
        imNav.startAnimation(animacion);


    }

    public void zoom(View view) {
        sound.start();
        animacion = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        imNav.startAnimation(animacion);


    }

    public void desvanecer(View view) {
        sound.start();
        animacion = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.desv);
        imNav.startAnimation(animacion);


    }
    public void arboles(View view){
        indica=0;
        Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
        intent.putExtra("numero",indica);
        startActivity(intent);

    }
    public void estrellas(View view){
        indica=1;
        Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
        intent.putExtra("numero",indica);
        startActivity(intent);

    }
    public void cajas(View view){
        indica=2;
        Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
        intent.putExtra("numero",indica);
        startActivity(intent);
    }
}
