package com.todaysfuture.craftvr;

/**
 * Created by rishabh on 16/8/16.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebVieww extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        WebView WebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebView.loadUrl("https://www.arjunsawhney.io/demo.html");
    }
}
