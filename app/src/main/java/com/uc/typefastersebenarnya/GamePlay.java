package com.uc.typefastersebenarnya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GamePlay extends AppCompatActivity {
    Button playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
        playButton = findViewById(R.id.submit);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(GamePlay.this, PostGame.class);
                startActivity(a);
            }
        });
    }
}
