package com.example.shehab.complainant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second_line extends AppCompatActivity {
    private Button shopraelkhema,koletelzraa, elmazlat,khlfaoe,santtreas,roadelfarg,
            masraa,elshohdaa,atabaa,mohmmednagib,elsadat,opra,eldokee,elbohoss,gamatelcahera,fisal,elgiza,dohegiza,saketmeky,elmonep;

    private TextView shopra_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_line);
        shopra_text = (TextView)findViewById(R.id.shopra_text);
        shopraelkhema = (Button)findViewById(R.id.shopra);
        koletelzraa = (Button)findViewById(R.id.koleateltheraa);
        elmazlat = (Button)findViewById(R.id.mzlaat);
        khlfaoe = (Button)findViewById(R.id.khlfaoe);
        santtreas = (Button)findViewById(R.id.senttreas);
        roadelfarg = (Button)findViewById(R.id.roadelfarg);
        masraa = (Button)findViewById(R.id.msraa);
        elshohdaa = (Button)findViewById(R.id.elshohdaa);
        atabaa = (Button)findViewById(R.id.atabaa);
        mohmmednagib = (Button)findViewById(R.id.mohmedngeb);
        elsadat = (Button)findViewById(R.id.elsadat);
        opra = (Button)findViewById(R.id.opra);
        eldokee = (Button)findViewById(R.id.dokee);
        elbohoss = (Button)findViewById(R.id.bohoss);
        gamatelcahera = (Button)findViewById(R.id.gamaatelcahera);
        fisal = (Button)findViewById(R.id.feasl);
        elgiza = (Button)findViewById(R.id.giza);
        dohegiza = (Button)findViewById(R.id.dohegiza);
        saketmeky = (Button)findViewById(R.id.sakeameky);
        elmonep = (Button)findViewById(R.id.moneb);

        shopra_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.122456,31.244504");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        shopraelkhema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.122456,31.244504");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        koletelzraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.113671,31.248750");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        elmazlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.104174,31.245643");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        khlfaoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.097705,31.245451");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        santtreas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.087965,31.245498");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        roadelfarg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.080595,31.245410");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        masraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.070904,31.245103");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        elshohdaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.061085,31.246041");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        atabaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.052355,31.246799");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        mohmmednagib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.045324,31.244159");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        elsadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.044152,31.234417");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        opra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.042170,31.224952");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        eldokee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.038437,31.212227");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        elbohoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.035874,31.200130");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        gamatelcahera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.026001,31.201115");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        fisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.017378,31.203938");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        elgiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.010839,31.207160");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        dohegiza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.005484,31.207913");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        saketmeky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.995494,31.208634");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        elmonep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.981060,31.212323");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });


    }
}
