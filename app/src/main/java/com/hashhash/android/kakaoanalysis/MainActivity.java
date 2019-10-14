package com.hashhash.android.kakaoanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button button1;
<<<<<<< HEAD

    /* test versino */
=======
    ImageButton img_button01;
>>>>>>> 1a1a645e4bbe6386655fc2b386bcb5364eb58774
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.gone);
        img_button01 = (Button)findViewById(R.id.button01);
    }
}
