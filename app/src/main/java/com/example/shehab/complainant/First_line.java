package com.example.shehab.complainant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class First_line extends AppCompatActivity {


    private Button elmargelgdeda,elmarg,azbtelnkhl,ainshms,elmtrea,helmetelzeton,hedeakelzaton,sreaelkopa,hmamatelkopa,kopreelkopa,
            manshetelsadr,eldemrdash,ghmra,elshohadaa,ahmedorabe,gmalebdelnaseer,elsadat,sadzaglol,elsedazianb,elmalkelsaleh,
            margrges,elzhraa, darelsalam,hdeakelmaadee,
            elmaadee,thnkatelmaadee,toraelbld,koteska,toraasment,elmasraa,hdeakhelwan, wadehof,gamathelwan,ainhelwan,helwan;
    private TextView elmarg_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firest_line);

        elmarg_text = (TextView) findViewById(R.id.elmarg_text);
        elmargelgdeda = (Button)findViewById(R.id.emargelgdeda);
        elmarg = (Button)findViewById(R.id.elmarg);
        azbtelnkhl = (Button)findViewById(R.id.azptElnkhl);
        ainshms = (Button)findViewById(R.id.ainshms);
        elmtrea = (Button)findViewById(R.id.mtrea);
        helmetelzeton = (Button)findViewById(R.id.hlmeazatoon);
        hedeakelzaton = (Button)findViewById(R.id.hdeakzatoon);
        sreaelkopa = (Button)findViewById(R.id.sreaaopaa);
        hmamatelkopa = (Button)findViewById(R.id.hmaamaatopaa);
        kopreelkopa = (Button)findViewById(R.id.kopreopaa);
        manshetelsadr = (Button)findViewById(R.id.mnsheasadr);
        eldemrdash = (Button)findViewById(R.id.demerdash);
        ghmra = (Button)findViewById(R.id.ghamraa);
        elshohadaa = (Button)findViewById(R.id.shohdaa);
        ahmedorabe = (Button)findViewById(R.id.ahmedorabe);
        gmalebdelnaseer = (Button)findViewById(R.id.gmalabdelnaser);
        elsadat = (Button)findViewById(R.id.sadat);
        sadzaglol = (Button)findViewById(R.id.sadzaghlol);
        elsedazianb = (Button)findViewById(R.id.elsedazinb);
        elmalkelsaleh = (Button)findViewById(R.id.elmalekelsaleh);
        margrges = (Button)findViewById(R.id.marregrges);
        elzhraa = (Button)findViewById(R.id.elzhreaa);
        darelsalam = (Button)findViewById(R.id.darelsalam);
        hdeakelmaadee = (Button)findViewById(R.id.hadaekelmaadee);
        elmaadee = (Button)findViewById(R.id.elmaadee);
        thnkatelmaadee = (Button)findViewById(R.id.thenkatelmaadee);
        toraelbld = (Button)findViewById(R.id.toraelbld);
        koteska = (Button)findViewById(R.id.costseka);
        toraasment = (Button)findViewById(R.id.toraasment);
        elmasraa = (Button)findViewById(R.id.elmassraa);
        hdeakhelwan = (Button)findViewById(R.id.hdeakhelwan);
        wadehof = (Button)findViewById(R.id.wadehof);
        gamathelwan = (Button)findViewById(R.id.gamaathelwan);
        ainhelwan = (Button)findViewById(R.id.ainhelwan);
        helwan = (Button)findViewById(R.id.helwan);

        elmarg_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.157292,31.336601");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elmargelgdeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.157292,31.336601");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elmarg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.132365,310319170");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        azbtelnkhl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.139335,31.324183");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        ainshms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.131053,31.318995");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elmtrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.121571,31.313794");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        helmetelzeton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.113500,31.314374");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        hedeakelzaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.105933,31.310454");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        sreaelkopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.097655,31.304560");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        hmamatelkopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.091243,31.298915");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        kopreelkopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.087238,31.294844");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        manshetelsadr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.082038,31.287483");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        eldemrdash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.077293,31.277810");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        ghmra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.069032,31.264621");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elshohadaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.061085,31.246041");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        ahmedorabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.056984,31.242367");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        gmalebdelnaseer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.053435,31.238711");
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
        sadzaglol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.037042,31.238361");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elsedazianb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.029262,31.235402");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elmalkelsaleh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.006156,31.237630");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        margrges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.006073,31.229621");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elzhraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.995454,31.231175");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        darelsalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.982082,31.242187");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        hdeakelmaadee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.970182,31250518");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elmaadee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.960317,31.257634");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        thnkatelmaadee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.953328,31.62967");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        toraelbld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.946764,31.272979");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        koteska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.936428,31.281397");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        toraasment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.925971,31.287541");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        elmasraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.906057,31.299503");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        hdeakhelwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.897148,31.303999");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        wadehof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.879023,31.313430");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        gamathelwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.869487,31.320054");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        ainhelwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.862615,31.324874");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        helwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"29.848992,31.334226");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

    }
}
