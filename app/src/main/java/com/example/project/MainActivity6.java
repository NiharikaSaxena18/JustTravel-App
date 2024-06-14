package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

     EditText destinationEditText;
     EditText startDateEditText;
    EditText endDateEditText;
    Button planTripButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText fields and Button
        destinationEditText = (EditText) findViewById(R.id.editTextDestination);
        startDateEditText = (EditText)findViewById(R.id.editTextStartDate);
        endDateEditText = (EditText) findViewById(R.id.editTextEndDate);
        planTripButton = (Button)findViewById(R.id.buttonPlanTrip);

        // Set OnClickListener for the Plan Trip button
        planTripButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get text from EditText fields
                String destination = destinationEditText.getText().toString().trim();
                String startDate = startDateEditText.getText().toString().trim();
                String endDate = endDateEditText.getText().toString().trim();

                // Check if any field is empty
                if (destination.isEmpty() || startDate.isEmpty() || endDate.isEmpty()) {
                    Toast.makeText(MainActivity6.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform trip planning logic (e.g., display trip details)
                    String tripDetails = "Destination: " + destination + "\n"
                            + "Start Date: " + startDate + "\n"
                            + "End Date: " + endDate;

                    Toast.makeText(MainActivity6.this, tripDetails, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
