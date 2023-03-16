package com.example.unix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView3);
        editText=findViewById(R.id.editTextTextPersonName);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////              Toast.makeText(MainActivity.this, "My dear please enter value first", Toast.LENGTH_SHORT).show();
//                String s= editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound=2.2*kg;
//                BigDecimal bd = new BigDecimal(pound).setScale(2, RoundingMode.HALF_UP);
//                double newNum = bd.doubleValue();
//                textView.setText("The value of kg "+ kg+" is " + newNum + " lb "); }
//        });

    }

    public void calculate(View view){
        String s= editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound=2.2*kg;
        BigDecimal bd = new BigDecimal(pound).setScale(2, RoundingMode.HALF_UP);
        double newNum = bd.doubleValue();
        textView.setText("The value of kg "+ kg+" is " + newNum + " lb ");
        Toast.makeText(MainActivity.this, "Thank you for use", Toast.LENGTH_SHORT).show();
    }
}