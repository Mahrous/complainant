package com.example.shehab.complainant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class sites_government extends AppCompatActivity implements MyRecyclerViewAdapter_sites.ItemClickListener3 {
    MyRecyclerViewAdapter_sites adapter;
    String[] data_name;
    String[] number_data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sites_government);
        number_data = new String[]{
                "http://www.mod.gov.eg/ModWebSite/",
                "http://www.emigration.gov.eg/DefaultAr/Pages/default.aspx",
                "http://www.mfa.gov.eg/",
                "http://www.touregypt.net/",
                "http://nile.enal.sci.eg/"
                ,"http://www.sis.gov.eg/?lang=en-DM",
                "http://www.egypttourism.org/",
                "http://www.islamic-council.org/",
                "http://www.customs.gov.eg/",
                "https://www.nbe.com.eg/",
                "http://www.mohp.gov.eg/",
                "http://www.awkafonline.com/",
                "http://www.moe.gov.eg/",
                "https://cso.moi.gov.eg/",
                "http://www.moee.gov.eg/",
                "http://www.ad.gov.eg/Ar/Default.aspx",
                "http://www.parliament.gov.eg/",
                "http://www.manpower.gov.eg/",
                "http://www.dar-alifta.org/home.html",
                "http://www.emss.gov.eg/",
                "http://www.moiegypt.gov.eg/arabic/default",
                "http://www.scu.eun.eg/",
                "http://www.civilaviation.gov.eg/",
                "http://www.mof.gov.eg/arabic/Pages/Home.aspx",
                "http://www.miic.gov.eg/Arabic/Pages/default.aspx",
                "http://www.mcit.gov.eg/Ar",
                "http://www.eeaa.gov.eg/arabic/main/about.asp",

        };
        data_name  = new String[]{
                "القوات المسلحه االمصريه",
                " وزارة الهجرة",
                "وزاره الخرجيه",
                "وزاره السياحه",
                "وزاره الزراعه",
                "الهيئه العامه للاستعلامات",
                "الهيئه العا مه للسياحه",
                "المجلس الأعلى للشئون الإسلامية",
                " مصلحة الجمارك المصرية",
                "البنك الاهلي المصري",
                "وزارة الصحة",
                "وزاره الاوقاف",
                "وزاره التربيه والتعليم",
                "وزاره الدخليه قظاع الاحوال المدنيه",
                "وزاره الكهرباء والطاقه",
                "وزاره التخطيط والمتابعه",
                "مجلس النواب",
                "وزار القوه العامله",
                "دار الافتاء المصري",
                "وزاره الشياب و الرياضه",
                "وزاره الدخليه",
                "وزاره التعليم العالي",
                "وزاره الطيران المدني",
                "وزاره الماليه",
                "وزاره الاستثمار",
                "وزاره الاتصالات",
                "وزاره الدوله لشئون البيئيه"

        };
        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recycler_department);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        adapter = new MyRecyclerViewAdapter_sites(this, number_data,data_name);
        recyclerView.setLayoutManager(layoutManager);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {

        String sites = number_data[position];
        Toast.makeText(this, ""+sites, Toast.LENGTH_SHORT).show();



        Intent to_sites_opent_activity = new Intent(getApplicationContext(),Activity_open_sites.class);
        to_sites_opent_activity.putExtra("sitesMessage",sites);
        startActivity(to_sites_opent_activity);


    }
}
