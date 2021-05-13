package com.example.shehab.complainant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Emergnce_call extends AppCompatActivity implements MyRecyclerViewAdapter_phones.ItemClickListener2 {


    MyRecyclerViewAdapter_phones adapter;
    String[] data_name;
    String[] number_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergnce_call);
         number_data = new String[]{"123",
                 "126",
                 "128",
                 "128",
                 "180",
                 "121",
                 "01221110000",
                 "129",
                 "144",
                 "177",
                 "16",
                 "2265-5000",
                 "2265-2029",
                 "2575-3555",

         };
         data_name  = new String[]{"الاسعاف",
                 "شرطه السياحه",
                 "شرطه المرور",
                 "شرطه الطورئ",
                 "المطافئ",
                 "طورئ الكهرباء",
                 "نجده الطريق السريع",
                 "طورئ الغاز",
                 "المكالمات الدوليه من خطوط ارضيه",
                 "استعلام عن فواتير خطوط ارضيه",
                 "شكاوي الخطوط الارضيه",
                 "مطار القاهره محطه واحد",
                 "مطار القاهره محطه اتنين",
                 "سكك الحديد",

         };
        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recycler_department);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        adapter = new MyRecyclerViewAdapter_phones(this, number_data,data_name);
        recyclerView.setLayoutManager(layoutManager);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {

        String phone_number = number_data[position];

        Intent call_intent = new Intent(Intent.ACTION_DIAL);
        call_intent.setData(Uri.parse("tel:"+phone_number));
        startActivity(call_intent);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
