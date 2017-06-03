package jp.techacademy.kasumi.watanabe.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Intent intent = getIntent();

        float c= intent.getFloatExtra("VALUE3", 0);


        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setText(String.valueOf(c));

    }


}