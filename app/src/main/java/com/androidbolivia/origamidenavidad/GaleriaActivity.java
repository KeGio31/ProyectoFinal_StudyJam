package com.androidbolivia.origamidenavidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GaleriaActivity extends AppCompatActivity {
private int indi;
    private ImageView galeria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        indi=getIntent().getExtras().getInt("num");
        galeria=(ImageView) findViewById(R.id.marco);
        if(indi==1){
            galeria.setImageResource(R.drawable.garbol1);
        }
        if(indi==2){
            galeria.setImageResource(R.drawable.garbol2);
        }
        if(indi==3){
            galeria.setImageResource(R.drawable.garbol3);
        }
        if(indi==4){
            galeria.setImageResource(R.drawable.garbol4);
        }
        if(indi==5){
            galeria.setImageResource(R.drawable.garbol5);
        }
        if(indi==6){
            galeria.setImageResource(R.drawable.garbol6);
        }
        if(indi==7){
            galeria.setImageResource(R.drawable.gestr7);
        }
        if(indi==8){
            galeria.setImageResource(R.drawable.gestr8);
        }
        if(indi==9){
            galeria.setImageResource(R.drawable.gestr9);
        }
        if(indi==10){
            galeria.setImageResource(R.drawable.gestr10);
        }
        if(indi==11){
            galeria.setImageResource(R.drawable.gestr11);
        }
        if(indi==12){
            galeria.setImageResource(R.drawable.gestr12);
        }
        if(indi==13){
            galeria.setImageResource(R.drawable.gestr13);
        }
        if(indi==14){
            galeria.setImageResource(R.drawable.gestr14);
        }
        if(indi==15){
            galeria.setImageResource(R.drawable.gestr15);
        }
        if(indi==16){
            galeria.setImageResource(R.drawable.gcaja16);
        }
        if(indi==17){
            galeria.setImageResource(R.drawable.gcaja17);
        }
        if(indi==18){
            galeria.setImageResource(R.drawable.gcaja18);
        }
        if(indi==19){
            galeria.setImageResource(R.drawable.gcaja19);
        }
        if(indi==20){
            galeria.setImageResource(R.drawable.gcaja20);
        }
        if(indi==21){
            galeria.setImageResource(R.drawable.gcaja21);
        }
        if(indi==22){
            galeria.setImageResource(R.drawable.gcaja22);
        }
        if(indi==23){
            galeria.setImageResource(R.drawable.gcaja23);
        }
        if(indi==24){
            galeria.setImageResource(R.drawable.gcaja24);
        }

    }
    public void regresar(View view){
        if(indi>0&&indi<7){
        int indica=0;
        Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
        intent.putExtra("numero",indica);
        startActivity(intent);}
        if(indi>6&&indi<16){
            int indica=1;
            Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
            intent.putExtra("numero",indica);
            startActivity(intent);}
        if(indi>15&&indi<25){
            int indica=2;
            Intent intent=new Intent(getApplicationContext(),MenuActivity.class);
            intent.putExtra("numero",indica);
            startActivity(intent);}
    }

}
