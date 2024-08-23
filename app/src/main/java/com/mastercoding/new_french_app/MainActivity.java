package com.mastercoding.new_french_app;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button blackbtn,whitebtn,redbtn,yellowbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        blackbtn = findViewById(R.id.blackbtn);
        whitebtn = findViewById(R.id.whitebtn);
        redbtn = findViewById(R.id.redbtn);
        yellowbtn = findViewById(R.id.yellowbtn);

        blackbtn.setOnClickListener(this);
        whitebtn.setOnClickListener(this);
        redbtn.setOnClickListener(this);
        yellowbtn.setOnClickListener(this);

//        blackbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //MediaPlayer mediaPlayer = new MediaPlayer();
//                MediaPlayer mediaPlayer = MediaPlayer.create(
//                        getApplicationContext(),
//                        R.raw.blackfrench
//                );
//                mediaPlayer.start();
//            }
//        });

    }

    @Override
    public void onClick(View view) {

        int clickedBtnId = view.getId();

        if (clickedBtnId== R.id.blackbtn){
            playSounds(R.raw.blackfrench);
        } else if (clickedBtnId== R.id.whitebtn) {
            playSounds(R.raw.whitefrench);
        }else if (clickedBtnId== R.id.redbtn) {
            playSounds(R.raw.redfrench);
        }else if (clickedBtnId== R.id.yellowbtn) {
            playSounds(R.raw.yellowfrench);
        }

    }

    public void playSounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}