package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button sum;
    private EditText num1;
    private EditText num2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum=findViewById(R.id.button);
        num1=findViewById(R.id.editTextNumber);
        num2=findViewById(R.id.editTextNumber2);
        result=findViewById(R.id.textView3);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res=Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
                result.setText("The sum is : " + res );
            }
        });
    }
}