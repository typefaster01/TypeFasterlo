package com.uc.typefastersebenarnya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PostGame extends AppCompatActivity {
    Button playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postgame);
        playButton = findViewById(R.id.doneButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PostGame.this, LeaderBoard.class);
                startActivity(a);
            }
        });
    }
}
