package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button buttonbooks = (Button) findViewById(R.id.buttonbooks);
        webview = (WebView) findViewById(R.id.webview);
        buttonbooks.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {

                                               webview.loadUrl("file:///android_asset/yourfirstpage.html");

                                           }
                                       });

    }
}