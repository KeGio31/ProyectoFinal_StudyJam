package com.androidbolivia.origamidenavidad;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private ImageView imNav;
    private Animation animacion;
    private MediaPlayer sound;
    private int indica;
    private ImageView coverView;
    private MediaPlayer musica;
    private int selec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imNav = (ImageView) findViewById(R.id.arbol_navi);
        sound = MediaPlayer.create(getApplicationContext(), R.raw.boton);
        coverView = (ImageView) findViewById(R.id.cover);

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
        sound.release();

    }
    public void estrellas(View view){
        indica=1;
        Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
        intent.putExtra("numero",indica);
        startActivity(intent);
        sound.release();

    }
    public void cajas(View view){
        indica=2;
        Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
        intent.putExtra("numero",indica);
        startActivity(intent);
        sound.release();
    }
    public void  jingle(View view){

        coverView.setImageResource(R.drawable.trap);
        selec=1;
        crear(selec);

    }
    public void  sabanero(View view){


        coverView.setImageResource(R.drawable.burritosbanero);
        selec=2;
        crear(selec);

    }
    public void  merry(View view){


        coverView.setImageResource(R.drawable.rock);
        selec=3;
        crear(selec);
    }
    public void  feliz(View view){

        coverView.setImageResource(R.drawable.feliznavidad);
        selec=4;
        crear(selec);


    }
    public void crear(int selec){
       if(selec==1){
           if(sound.isPlaying()){
               sound.release();
           }
           sound = MediaPlayer.create(getApplicationContext(), R.raw.jingle);
           sound.start();
       }
        if(selec==2){
            if(sound.isPlaying()){
                sound.release();
            }
            sound = MediaPlayer.create(getApplicationContext(), R.raw.burrito);
            sound.start();
        }
        if(selec==3){
            if(sound.isPlaying()){
                sound.release();
            }
            sound = MediaPlayer.create(getApplicationContext(), R.raw.christmasrock);
            sound.start();
        }
        if(selec==4){
            if(sound.isPlaying()){
                sound.release();
            }
            sound = MediaPlayer.create(getApplicationContext(), R.raw.feliznavidad);
            sound.start();
        }



    }
    public void stop(View view){
        sound.stop();
        coverView.setImageResource(R.drawable.defaulmusic);

    }
    public void gmail(View view){
        String[] to={"kegio.dirq@gmail.com","kevin_311997@hotmail.com"};
        Intent email=new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL,to);
        startActivity(Intent.createChooser(email,"Enviar Email"));


    }
    public void github(View view){
        Intent pagina=new Intent(Intent.ACTION_VIEW);
        pagina.setData(Uri.parse("https://www.github.com/kegio31"));
        startActivity(pagina);

    }
    public void face(View view){
        Intent pagina=new Intent(Intent.ACTION_VIEW);
        pagina.setData(Uri.parse("https://www.facebook.com/kegiod"));
        startActivity(pagina);

    }



}
