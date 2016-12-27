package com.androidbolivia.origamidenavidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class MenuActivity extends AppCompatActivity {
    private int n;

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
}
