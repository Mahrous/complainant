package com.example.shehab.complainant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thrid_line extends AppCompatActivity {

    private Button abaseaa, abdobashe, elgesh, babwlshareaa,atabaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid_line);

        abaseaa = (Button)findViewById(R.id.absea);
        abdobashe = (Button)findViewById(R.id.abdobasha);
        elgesh = (Button)findViewById(R.id.elgesh);
        babwlshareaa = (Button)findViewById(R.id.babelshareaa);
        atabaa = (Button)findViewById(R.id.atabaa);
        abaseaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.072481,31.283808");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        abdobashe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.064828,31.274803");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        elgesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.061900,31.266858");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        babwlshareaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("google.navigation:q="+"30.055665,31.244464");
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



    }
}
