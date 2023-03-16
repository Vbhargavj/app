package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    public static final String EXTRA_NAME="com.example.multiscreen.EXTRA.NAME";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

    }
    public void sendName(View view){
        editText=findViewById(R.id.editTextTextPersonName);
        String s=editText.getText().toString();
        Toast.makeText(this, "You Entered", Toast.LENGTH_SHORT).show();
//        editText=findViewById(R.id.editTextTextPersonName);

        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra(EXTRA_NAME,s);
        startActivity(intent);
    }
}