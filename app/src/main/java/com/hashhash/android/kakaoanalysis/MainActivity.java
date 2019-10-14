package com.hashhash.android.kakaoanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button button1;
    ImageButton button_img1;
    ImageButton button_img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.gone);
        button_img1 = (ImageButton)findViewById(R.id.invisible);
        button_img2 = (ImageButton)findViewById(R.id.invisible);
    }
}
