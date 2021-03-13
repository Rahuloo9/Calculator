package com.rahul009.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText,editText2;
TextView tvAns;
Button addButton,subButton,multiButton,divButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edText);
        editText2=findViewById(R.id.ed2Text);

        tvAns=findViewById(R.id.tvAns);

        addButton=findViewById(R.id.addButton);
        subButton=findViewById(R.id.subButton);
        multiButton=findViewById(R.id.multiplyButton);
        divButton=findViewById(R.id.divButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result;
                int a=Integer.parseInt(editText.getText().toString());
                int b=Integer.parseInt(editText2.getText().toString());
                result=a+b;
                tvAns.setText("Ans is = "+result);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result;
                int a=Integer.parseInt(editText.getText().toString());
                int b=Integer.parseInt(editText2.getText().toString());
                result=a-b;
                tvAns.setText("Ans is = "+result);
            }
        });
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result;
                int a=Integer.parseInt(editText.getText().toString());
                int b=Integer.parseInt(editText2.getText().toString());
                result=a*b;
                tvAns.setText("Ans is = "+result);
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result;
                int a=Integer.parseInt(editText.getText().toString());
                int b=Integer.parseInt(editText2.getText().toString());
                result=a/b;
                tvAns.setText("Ans is = "+result);
            }
        });
    }
}