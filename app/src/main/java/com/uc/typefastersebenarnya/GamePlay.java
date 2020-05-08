package com.uc.typefastersebenarnya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class GamePlay extends AppCompatActivity {
    Button playButton;
    TextView soal;
    TextInputLayout jawaban;
    String ajawaban,asoal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
        playButton = findViewById(R.id.submit);
        soal = findViewById(R.id.soal);
        jawaban = findViewById(R.id.jawaban);
        array.masukSoal();
        asoal=array.randomSoal();
        soal.setText(asoal);
        ajawaban = jawaban.getEditText().getText().toString().trim();
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (asoal.equals(ajawaban)){
                    array.hasil="Pintar ";
                }else{
                    array.hasil="Bodoh";
                }
                Intent a = new Intent(GamePlay.this, PostGame.class);
                startActivity(a);
            }
        });
    }
}
