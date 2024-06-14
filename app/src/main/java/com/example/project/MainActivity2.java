package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity2 extends AppCompatActivity {
    ImageView ppl;
    TextView t4;
    EditText Name,Password;
    Button Submit;
    String str1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        t4=(TextView) findViewById(R.id.textView4);
        Name=(EditText) findViewById(R.id.Name);
        Password=(EditText) findViewById(R.id.Password);
        Submit=(Button) findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent2);
                str1=Name.getText().toString();
                intent2.putExtra("Name",str1);


            }
        });


    }
}