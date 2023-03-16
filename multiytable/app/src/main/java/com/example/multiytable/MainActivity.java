package com.example.multiytable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    private TextView mt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        textView = enter the number
        textView= findViewById(R.id.textView);
//        editText = take user inputs
        editText=findViewById(R.id.editTextNumber);
//        button for multi-plication table
        button=findViewById(R.id.button);
//        all multiplication table here store
        mt=findViewById(R.id.text1);
//        mt=findViewById(R.id.textView);
//        for store multiplication table in the string
//        String s="";
//        for (int i=1;i<=10;i++){
//            s=s+i+" x "
//        }

//        int n=10;
//        n=Integer.parseInt(editText.getText().toString());

//        System.out.println(s);

        mt.setText("s");
    }
    public void multy(View view){
        String s2= editText.getText().toString();
        String s="";
        int n=Integer.parseInt(s2);
        for (int i=1;i<=10;i++){
            s=s+n+" X "+i+ " = "+i*n +"\n";
        }
        mt.setText(s);
    }
}