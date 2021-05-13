package com.example.shehab.complainant;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import static android.media.CamcorderProfile.get;

public class WebViewClass extends WebViewClient {
    final ProgressBar loadProgress;
    final WebView wv;

    WebViewClass(WebView webView, ProgressBar progressBar) {
        this.wv = webView;
        this.loadProgress = progressBar;
    }

    public void onPageFinished(WebView view, String url) {
        wv.setVisibility(View.VISIBLE);
        loadProgress.setVisibility(View.INVISIBLE);
        view.clearCache(true);
    }

    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        wv.loadData("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + "<center>" + get(R.string.erroopsproblem) + ".</center>", "text/html", "UTF-8");
    }
}
