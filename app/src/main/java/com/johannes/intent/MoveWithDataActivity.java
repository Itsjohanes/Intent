package com.johannes.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
    private TextView tvDataRecieve;
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataRecieve = findViewById(R.id.tv_data_reciever);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE,0);
        String text = "name " + name + "\n Your age " + age;
        tvDataRecieve.setText(text);
    }

}