package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
     WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button buttonFacts = (Button) findViewById(R.id.buttonFacts);
        webview = (WebView) findViewById(R.id.webview);
        buttonFacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                webview.loadUrl("file:///android_asset/myfirsthtml.html");

            }
        });

    }
}