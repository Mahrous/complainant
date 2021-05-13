package com.example.shehab.complainant;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class Test extends Activity {
    VideoView videoView;
/*
    private void test_2(){
        String httpLiveUrl = "https://firebasestorage.googleapis.com/v0/b/fir-uploadimage-62802.appspot.com/o/gIRGGJhK1DbKf8eT.mp4?alt=media&token=443632c9-e4da-4b97-91aa-1236a848495b";
        videoView = (VideoView) findViewById(R.id.VideoView);
        videoView.setVideoURI(Uri.parse(httpLiveUrl));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
        videoView.start();
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
       // test_2();

    }

    public void Maps(View view)
    {
        Uri uri = Uri.parse("google.navigation:q="+"30.521616,31.345585");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }


}
