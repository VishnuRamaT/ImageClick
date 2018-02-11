package com.visakh.imageclick;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.bell_sound);
    }

    public void showToast(View view) {
        if(mp.isPlaying()){
            mp.pause();
            mp.seekTo(0);
            mp.start();
        } else {
            mp.start();
        }
        mp.start();
        Toast.makeText(this,"Bell Clicked", Toast.LENGTH_SHORT).show();
    }
}
