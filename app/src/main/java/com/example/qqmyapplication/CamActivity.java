package com.example.qqmyapplication;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class CamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam);


        WebView webView = (WebView)findViewById(R.id.petview);

        webView.setWebViewClient(new SslWebViewConnect());

        webView.loadUrl("http://ksw0117.iptime.org:8091/javascript_simple.html");

        webView.setPadding(0,0,0,0);
        //webView.setInitialScale(100);
        webView.getSettings().setBuiltInZoomControls(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        //webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);


    }

    public void onClickBack(View view) {
        finish();
    }
}
