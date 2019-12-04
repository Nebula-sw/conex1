package com.example.qqmyapplication;

import android.webkit.WebViewClient;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;


public class SslWebViewConnect extends WebViewClient {

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed(); // SSL 에러가 발생해도 계속 진행!
    }

}
