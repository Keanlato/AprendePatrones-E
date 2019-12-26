package com.kadama.aprendepatrones;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class facil extends AppCompatActivity {

    List<patrones> lsfacil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facil);
        lsfacil = new ArrayList<>();
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/1.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/2.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/3.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/4.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/5.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/6.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/7.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/8.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/9.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/10.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/11.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/12.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/13.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/14.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/15.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/16.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/17.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/18.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/19.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/20.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/21.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/22.jpg"));
        lsfacil.add(new patrones("Hola","https://raw.githubusercontent.com/Keanlato/A/master/Fotos%20app/Facil/23.jpg"));
        RecyclerView myr = (RecyclerView) findViewById(R.id.lista);
        AdaptadorItenes mya = new AdaptadorItenes(this,lsfacil);
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
