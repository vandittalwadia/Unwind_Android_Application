package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonactivity1 = (Button) findViewById(R.id.buttonactivity1);
        Button buttonmusic = (Button) findViewById(R.id.buttonmusic);
        Button buttonfacts = (Button) findViewById(R.id.buttonfacts);
        Button buttonrate = (Button) findViewById(R.id.buttonrate);

        buttonrate.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                RatingBar ratingBar=(RatingBar) findViewById(R.id.ratingBar);
                float rating= ratingBar.getRating();
                Toast.makeText(getApplicationContext(),rating + "stars",Toast.LENGTH_SHORT).show();
                openactivity5();




            }



        });
        buttonfacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity4();
            }
        });
        buttonmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity3();
            }
        });

        buttonactivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();
            }
        });
    }
        public void openactivity2(){
          Intent intent=new Intent(this,MainActivity2.class);
          startActivity(intent);
        }
        public void openactivity3(){
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
        public void openactivity4(){
            Intent intent=new Intent(this,MainActivity4.class);
            startActivity(intent);

        }
    public void openactivity5(){
        Intent intent=new Intent(this,MainActivity5.class);
        startActivity(intent);

    }
}