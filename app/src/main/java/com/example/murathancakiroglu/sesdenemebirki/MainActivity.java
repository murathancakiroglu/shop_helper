package com.example.murathancakiroglu.sesdenemebirki;

import android.app.Application;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.mapzen.speakerbox.Speakerbox;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Speakerbox speakerbox = new Speakerbox(this.getApplication());
        Button b = findViewById(R.id.tikla);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakerbox.play("Hi");
            }
        });
    }
}
