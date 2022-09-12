package com.johannes.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMoveActivity;
    private Button btnMoveActivityData;
    private Button btnDialNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this); //berada diactivity ini
        btnMoveActivityData = findViewById(R.id.btn_move_activity_data);
        btnMoveActivityData.setOnClickListener(this);
        btnDialNumber = findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_move_activity){
            Intent moveIntent  = new Intent(MainActivity.this,MoveActivity.class);
            startActivity(moveIntent);

        }else if(view.getId() == R.id.btn_move_activity_data){
            Intent moveIntentByData = new Intent(MainActivity.this,MoveWithDataActivity.class);
            moveIntentByData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Halo Aku Putra");
            moveIntentByData.putExtra(MoveWithDataActivity.EXTRA_AGE,5);
            startActivity(moveIntentByData);
        }else if(view.getId() == R.id.btn_dial_number){
            String phoneNumber = "081934172542";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null));
            startActivity(intent);
        }
    }
}