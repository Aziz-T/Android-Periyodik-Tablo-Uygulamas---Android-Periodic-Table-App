package com.k.periyodiktablo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private GridLayout layout,layout2;
    private int count=-1, position=0, reklamsayaci=1;
    private RelativeLayout relativeLayout;
    private TextView sembolText,numberText,adiText,agirlikText,elektron,proton,notron;
    private TextView dizilimText, yukselText,fizikselHal,renk,elektronDizilimi;

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.table);
        layout2=findViewById(R.id.table2);
        relativeLayout=findViewById(R.id.atomRelative);
        sembolText=findViewById(R.id.sembolText);
        numberText=findViewById(R.id.numberText);
        adiText=findViewById(R.id.adiText);
        agirlikText=findViewById(R.id.agirlikText);
        dizilimText=findViewById(R.id.dizilimiText);
        yukselText=findViewById(R.id.yukseltgenmeText);
        fizikselHal=findViewById(R.id.fizikselHal);
        renk=findViewById(R.id.renk);
        elektronDizilimi=findViewById(R.id.spText);
        elektron=findViewById(R.id.elektron);
        proton=findViewById(R.id.proton);
        notron=findViewById(R.id.notron);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        final VeriTabani veriTabani = new VeriTabani();

        int i;
        for(i=0; i<156;i++){
            final TextView text = new TextView(this);
            if((i>0 && i<17) || (i>19 && i<30) || (i>37 && i<48)  ){
                text.setAlpha(0);
                text.setEnabled(false);
                textOlustur(text);
                text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.bostasarim));
                layout.addView(text);
             }else if((i>92 && i<108) || (i>125 && i<141)){
                count++;
                text.setText(veriTabani.atomModeliList.get(count).getAtomSembol());
                textOlustur(text);
                arkaplan(text,veriTabani.atomModeliList.get(count).getMetallik());
                layout2.addView(text);
            } else
                {
                    count++;
                    text.setText(veriTabani.atomModeliList.get(count).getAtomSembol());
                    textOlustur(text);
                    arkaplan(text,veriTabani.atomModeliList.get(count).getMetallik());
                    layout.addView(text);
            }

            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                sembolText.setText(text.getText().toString());
                position = elementBul(text.getText().toString(),veriTabani.atomModeliList);
                numberText.setText(veriTabani.atomModeliList.get(position).getAtomNumarasi());
                relativeArka(veriTabani.atomModeliList.get(position).getMetallik() , relativeLayout);
                agirlikText.setText(veriTabani.atomModeliList.get(position).getAgirlik());
                adiText.setText(veriTabani.atomModeliList.get(position).getAtomAdi());
                dizilimText.setText(veriTabani.atomModeliList.get(position).getDizilim());
                elektronDizilimi.setText("Electron Configuration: " + veriTabani.atomModeliList.get(position).getElektronDizilmi());
                renk.setText("Color: "+veriTabani.atomModeliList.get(position).getRenk());
                yukselText.setText("Oxidation Step: " + veriTabani.atomModeliList.get(position).getYukselt());
                fizikselHal.setText("Physical State: "+veriTabani.atomModeliList.get(position).getFizikselHal());
                elektron.setText("e: "+veriTabani.atomModeliList.get(position).getElektron());
                proton.setText("p: "+veriTabani.atomModeliList.get(position).getProton());
                notron.setText("n: "+veriTabani.atomModeliList.get(position).getNotron());
                reklamsayaci++;
                if(reklamsayaci%5==0){
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                }

                }
            });
        }



    }

    private void relativeArka(String metallik, RelativeLayout relativeLayout) {
        if(metallik.equals("Alkaline Metal")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.alcalinemetal));
        }else if(metallik.equals("Alkaline Earth")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.alcalineearth));
        }else if(metallik.equals("Transition Metal")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.transitionmetal));
        }else if(metallik.equals("Semimetal")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.semimetal));
        }else if(metallik.equals("Nonmetal")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.nonmetal));
        }else if(metallik.equals("Basic Metal")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.basicmetal));
        }else if(metallik.equals("Halogen")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.halogen));
        }else if(metallik.equals("Noble Gas")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.noblegas));
        }else if(metallik.equals("Lanthanide")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.lanthanite));
        }else if(metallik.equals("Actinide")){
            relativeLayout.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.actinide));
        }else{

        }
    }

    private int elementBul(String toString, List<AtomModeli> atomModeliList) {
        int i,k=0;
        for(i=0; i<atomModeliList.size();i++){
            if(toString.equals(atomModeliList.get(i).getAtomSembol())){
                k=i;
            }
        }
        return k;
    }

    private void textOlustur(TextView text) {
        text.setTextColor(Color.BLACK);

        text.setHeight((int)getResources().getDimension(R.dimen.text_height));
        text.setWidth((int)getResources().getDimension(R.dimen.text_width));
        text.setGravity(Gravity.CENTER);
    }

    private void arkaplan(TextView text, String metallik) {
        if(metallik.equals("Alkaline Metal")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.alcalinemetal));
        }else if(metallik.equals("Alkaline Earth")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.alcalineearth));
        }else if(metallik.equals("Transition Metal")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.transitionmetal));
        }else if(metallik.equals("Semimetal")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.semimetal));
        }else if(metallik.equals("Nonmetal")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.nonmetal));
        }else if(metallik.equals("Basic Metal")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.basicmetal));
        }else if(metallik.equals("Halogen")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.halogen));
        }else if(metallik.equals("Noble Gas")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.noblegas));
        }else if(metallik.equals("Lanthanide")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.lanthanite));
        }else if(metallik.equals("Actinide")){
            text.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.actinide));
        }else{

        }

    }
}
