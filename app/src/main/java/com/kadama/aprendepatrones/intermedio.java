package com.kadama.aprendepatrones;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class intermedio extends AppCompatActivity {
    TextView t;
    List<patrones> lsInter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermedio);

        lsInter = new ArrayList<>();
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/1.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/2.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/3.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/4.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/5.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/6.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/7.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/8.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/9.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/10.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/11.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/12.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/13.jpg"));
        lsInter.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Intermedio/14.jpg"));
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
