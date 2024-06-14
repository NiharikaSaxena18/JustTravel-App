package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView output;
    ImageButton play1,play2,play3;
    EditText f1,f2,f3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        output=(TextView) findViewById(R.id.output);
        play1=(ImageButton) findViewById(R.id.play1);
        play2=(ImageButton) findViewById(R.id.play2);
        f1=(EditText) findViewById(R.id.f1);
        f2=(EditText) findViewById(R.id.f2);
        f3=(EditText) findViewById(R.id.f3);
        setContentView(R.layout.activity_main3);
        Intent intent2=getIntent();
        String Name= intent2.getStringExtra("Name");
        output.setText("Hi! "+Name);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent3);

            }
        });
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent4);
            }
        });
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5= new Intent(MainActivity3.this, MainActivity6.class);
                startActivity(intent5);
            }
        });
    }
}