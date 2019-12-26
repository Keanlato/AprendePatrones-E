package com.kadama.aprendepatrones;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class dificil extends AppCompatActivity {
    List<patrones> lsInter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificil);
        lsInter = new ArrayList<>();
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/1.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/2.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/3.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/4.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/5.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/6.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/7.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/8.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/9.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/10.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/11.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/12.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/13.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/14.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/15.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/16.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/17.jpeg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Dificil/18.jpeg"));
        RecyclerView myr = (RecyclerView) findViewById(R.id.lista);
        AdaptadorItenes mya = new AdaptadorItenes(this,lsInter);
        myr.setLayoutManager(new GridLayoutManager(this,getSpanCOunt()));
        myr.setAdapter(mya);
    }

    private int getSpanCOunt() {
        DisplayMetrics m = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(m);
        int anchura = m.widthPixels;
        float anchuraMini= TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,120,m);
        return (int) (anchura/ anchuraMini);
    }
}
