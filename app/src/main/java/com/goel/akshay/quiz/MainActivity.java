package com.goel.akshay.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button submitButton;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = (Button) findViewById(R.id.submit_btn);
        editText1 = (EditText) findViewById(R.id.question_1_edit);
        editText2 = (EditText) findViewById(R.id.question_2_edit);
        editText3 = (EditText) findViewById(R.id.question_3_edit);
        editText4 = (EditText) findViewById(R.id.question_4_edit);
        editText5 = (EditText) findViewById(R.id.question_5_edit);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int point = 0;
        if (v == findViewById(R.id.submit_btn)) {
            if (editText1.getText().toString().equalsIgnoreCase("quiz")) {
                point += 1;
            }
            if (editText2.getText().toString().equalsIgnoreCase("nougat")) {
                point += 1;
            }
            if (editText3.getText().toString().equalsIgnoreCase("donut")) {
                point += 1;
            }
            if (editText4.getText().toString().equalsIgnoreCase("green")) {
                point += 1;
            }
            if (editText5.getText().toString().equalsIgnoreCase("android studio")) {
                point += 1;
            }

            Toast.makeText(this, "Your score : " + point + " out of 5", Toast.LENGTH_SHORT).show();
        }

    }
}
