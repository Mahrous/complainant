package com.example.shehab.complainant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Metro_activity extends AppCompatActivity {

    private Button first_line,second_line,third_line;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro_activity);
        first_line = (Button)findViewById(R.id.first_line);
        second_line = (Button)findViewById(R.id.second_line);
        third_line = (Button)findViewById(R.id.third_line);

        first_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),First_line.class));
            }
        });
        second_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Second_line.class));

            }
        });
        third_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Thrid_line.class));

            }
        });
    }
}
