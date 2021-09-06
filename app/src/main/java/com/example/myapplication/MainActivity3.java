package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {
    MediaPlayer Goodsong;
    MediaPlayer Goodsong2;
    MediaPlayer Goodsong3;
    MediaPlayer Goodsong4;
    MediaPlayer Goodsong5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Goodsong = MediaPlayer.create(this, R.raw.chainsmoker);
        Goodsong2 = MediaPlayer.create(this, R.raw.closer);
        Goodsong3 = MediaPlayer.create(this, R.raw.rockstar);
        Goodsong4 = MediaPlayer.create(this, R.raw.cradles);
        Goodsong5 = MediaPlayer.create(this, R.raw.thunder);
    }
    public void playmusic1(View v)
    {
        Goodsong.start();
    }
    public void playmusic2(View v)
    {
        Goodsong2.start();
    }
    public void playmusic3(View v)
    {
        Goodsong3.start();
    }
    public void playmusic4(View v)
    {
        Goodsong4.start();
    }
    public void playmusic5(View v)
    {
        Goodsong5.start();
    }
    public void pausemusic1(View v)
    {
        if(Goodsong.isPlaying())
            Goodsong.pause();
    }
    public void pausemusic2(View v)
    {
        if(Goodsong2.isPlaying())
            Goodsong2.pause();
    }
    public void pausemusic3(View v)
    {
        if(Goodsong3.isPlaying())
            Goodsong3.pause();
    }
    public void pausemusic4(View v)
    {
        if(Goodsong4.isPlaying())
            Goodsong4.pause();
    }
    public void pausemusic5(View v)
    {
        if(Goodsong5.isPlaying())
            Goodsong5.pause();
    }

}