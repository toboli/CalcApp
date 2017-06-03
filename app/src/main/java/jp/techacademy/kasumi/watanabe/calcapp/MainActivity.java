package jp.techacademy.kasumi.watanabe.calcapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText EditText1;
    EditText EditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setText("+");
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setText("-");
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setText("×");
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setText("÷");
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondScreen.class);

        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);


        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();
        float a = Float.parseFloat(str1);
        float b = Float.parseFloat(str2);
        float c= 0;

        intent.putExtra("VALUE1", a);
        intent.putExtra("VALUE2", b);


        if(v.getId()==R.id.button1){
             c = a+b;
        }else if (v.getId()==R.id.button2){
             c = a-b;
        }else if(v.getId()==R.id.button3){
             c = a*b;
        }else{
             c = a/b;
        }


        intent.putExtra("VALUE3", c);

        startActivity(intent);

    }


}
