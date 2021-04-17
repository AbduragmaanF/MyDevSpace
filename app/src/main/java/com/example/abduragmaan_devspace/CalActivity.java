package com.example.abduragmaan_devspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalActivity extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private TextView ViewResult;
    private Button calculate, back,reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        reset=findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                input2.setText("");
                ViewResult.setText("");
            }
        });

        input1 = findViewById(R.id.height_number_1);
        input2 = findViewById(R.id.radius_number_2);
        ViewResult = findViewById(R.id.textView_result);

        calculate = findViewById(R.id.button_add);
        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double pie=3.14285714286;
                if (input1.getText().toString().length() == 0) {
                    input1.setText("0");
                }
                if (input2.getText().toString().length() == 0) {
                    input2.setText("0");
                }
                int num1 = Integer.parseInt(input1.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());
                double sum =  pie*(num2*num2)*num1;
                ViewResult.setText(String.valueOf(sum)+"");
            }
        });
    }
}