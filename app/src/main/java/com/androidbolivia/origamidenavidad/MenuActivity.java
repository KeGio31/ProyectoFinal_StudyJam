package com.androidbolivia.origamidenavidad;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class MenuActivity extends AppCompatActivity {
    private int n;
    private  int gal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();
        TabHost.TabSpec
                spec=tabs.newTabSpec("tab1");
        spec.setContent(R.id.ARBOLES);
        spec.setIndicator("ARBOLES");
        tabs.addTab(spec);
        spec=tabs.newTabSpec("tab2");
        spec.setContent(R.id.ESTRELLAS);
        spec.setIndicator("ESTRELLAS");
        tabs.addTab(spec);
        spec=tabs.newTabSpec("tab3");
        spec.setContent(R.id.CAJAS);
        spec.setIndicator("CAJAS");
        tabs.addTab(spec);
        n = getIntent().getExtras().getInt("numero");
        tabs.setCurrentTab(n);
    }
    public void atras(View view){
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);


    }
    public void arbo1(View view){
        gal=1;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void arbo2(View view){
        gal=2;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void arbo3(View view){
        gal=3;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void arbo4(View view){
        gal=4;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void arbo5(View view){
        gal=5;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void arbo6(View view){
        gal=6;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void estr7(View view){
        gal=7;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void estr8(View view){
        gal=8;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void estr9(View view){
        gal=9;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void estr10(View view){
        gal=10;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void estr11(View view){
        gal=11;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void estr12(View view){
        gal=12;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void estr13(View view){
        gal=13;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void estr14(View view){
        gal=14;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void estr15(View view){
        gal=15;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);

    }
    public void caj16(View view){
        gal=16;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void caj17(View view){
        gal=17;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void caj18(View view){
        gal=18;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void caj19(View view){
        gal=19;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void caj20(View view){
        gal=20;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void caj21(View view){
        gal=21;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void caj22(View view){
        gal=22;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void caj23(View view){
        gal=23;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
    }
    public void caj24(View view){
        gal=24;
        Intent intent=new Intent(getApplicationContext(),GaleriaActivity.class);
        intent.putExtra("num",gal);
        startActivity(intent);
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
