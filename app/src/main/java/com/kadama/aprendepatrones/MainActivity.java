package com.kadama.aprendepatrones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;


public class MainActivity extends AppCompatActivity implements RewardedVideoAdListener {


    Button facil, intermedio, dificil, facilF, intermedioF, dificilF;
    //ESTO SE AGREGA PARA EL BANNER PUBLICITARIO
    private AdView mAdView;

    //ESTO SE AGREGA PARA LA PANTALLA FLOTANTE PUBLICITARIA
    private InterstitialAd mInterstitialAd;

    //ESTO AGREGA UN VIDEO RECOMPENSADO EN LA APP
    private RewardedVideoAd mRewardedVideoAd;
    private RewardedVideoAd mRewardedVideoAd2;
    private RewardedVideoAd mRewardedVideoAd3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Inicializar el banner
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        //Codigo del banner
        mAdView = findViewById(R.id.ban_publicidad1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Codigo del banner
        mAdView = findViewById(R.id.ban_publicidad2);
        mAdView.loadAd(adRequest);


        // VIDEOS RECOMPENSADOS PUBLICIDAD
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        // Use an activity context to get the rewarded video instance.
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        // Use an activity context to get the rewarded video instance.
        mRewardedVideoAd2 = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd2.setRewardedVideoAdListener(this);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        // Use an activity context to get the rewarded video instance.
        mRewardedVideoAd3 = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd3.setRewardedVideoAdListener(this);



        loadRewardedVideoAd();//Con esto mandamos a cargar la video publicidad
        loadRewardedVideoAd2();//Con esto mandamos a cargar la video publicidad
        loadRewardedVideoAd3();//Con esto mandamos a cargar la video publicidad


    }

    //metodo para cargar la publicidad de video recompensado
    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }

    private void loadRewardedVideoAd2() {
        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }
    private void loadRewardedVideoAd3() {
        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }


    //para abrir a traves del boton ver todos
    public void abrirFacil (View v){
        Intent facil = new Intent(this, facil.class);
        startActivity(facil);

        if (mRewardedVideoAd.isLoaded()) {
            mRewardedVideoAd.show();//Llamamos a la video Publicidad
        } else {
            //.d("TAG", "The interstitial wasn't loaded yet.");
        }

    }

    public void abrirIntermedio (View v){
        Intent intermedio = new Intent(this, intermedio.class);
        startActivity(intermedio);

        if (mRewardedVideoAd.isLoaded()) {
            mRewardedVideoAd.show();//Llamamos a la video Publicidad
        } else {
            //.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    public void abrirDificil (View v){
        Intent dificil = new Intent(this, dificil.class);
        startActivity(dificil);

        if (mRewardedVideoAd.isLoaded()) {
            mRewardedVideoAd.show();//Llamamos a la video Publicidad
        } else {
            //.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }


    //para abrir a traves del boton de flecha
    public void abrirFacilF (View v){
        Intent facil = new Intent(this, facil.class);
        startActivity(facil);

        if (mRewardedVideoAd.isLoaded()) {
            mRewardedVideoAd.show();//Llamamos a la video Publicidad
        } else {
            //.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    public void abrirIntermedioF (View v){
        Intent intermedio = new Intent(this, intermedio.class);
        startActivity(intermedio);

        if (mRewardedVideoAd.isLoaded()) {
            mRewardedVideoAd.show();//Llamamos a la video Publicidad
        } else {
            //.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    public void abrirDificilF (View v){
        Intent dificil = new Intent(this, dificil.class);
        startActivity(dificil);

        if (mRewardedVideoAd.isLoaded()) {
            mRewardedVideoAd.show();//Llamamos a la video Publicidad
        } else {
            //.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
        Toast.makeText(this,"Gracias por ver el video", Toast.LENGTH_SHORT).show(); //MOSTRATRA UN MENSAJE DE AGRADECIMIENTO POR VER LA VIDEOPUBLICIDAD
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}
