package com.example.project;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

     EditText trainNameEditText;
     TimePicker reminderTimePicker;
     Button setReminderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trainNameEditText = (EditText) findViewById(R.id.trainNameEditText);
        reminderTimePicker = (TimePicker) findViewById(R.id.reminderTimePicker);
        setReminderButton = (Button) findViewById(R.id.setReminderButton);


        setReminderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String trainName = trainNameEditText.getText().toString();
                int hour = reminderTimePicker.getHour();
                int minute = reminderTimePicker.getMinute();

                // Show a simple toast message for demonstration (replace with notification)
                String message = "Reminder set for " + trainName + " at " + hour + ":" + minute;
                Toast.makeText(MainActivity5.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
