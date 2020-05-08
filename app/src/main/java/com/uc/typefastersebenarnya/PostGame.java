package com.uc.typefastersebenarnya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PostGame extends AppCompatActivity {
    Button playButton;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postgame);
        playButton = findViewById(R.id.doneButton);
        hasil = findViewById(R.id.hasil);
        hasil.setText(array.hasil);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(PostGame.this, LeaderBoard.class);
                startActivity(a);
            }
        });
    }
}
