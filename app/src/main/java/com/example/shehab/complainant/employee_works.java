package com.example.shehab.complainant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class employee_works extends AppCompatActivity {

    ProgressBar loadProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_works);


        loadProgress = (ProgressBar)findViewById(R.id.loadprograss);
        WebView wv = (WebView) findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setScrollBarStyle(View.VISIBLE);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.getSettings().setSupportZoom(true);
        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setUseWideViewPort(true);
        wv.getSettings().setAllowContentAccess(true);
        wv.loadUrl("http://jobs.gov.eg/");
        wv.setVisibility(View.INVISIBLE);
        wv.setWebViewClient(new WebViewClass(wv, loadProgress));

    }
}
