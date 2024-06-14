package com.example.project;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class expense_manager extends Fragment {

    private EditText expenseNameEditText;
    private EditText expenseAmountEditText;
    private Button addExpenseButton;
    private TextView totalAmountTextView;
    private double totalAmountSpent = 0.0;

    public expense_manager() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_expense_manager, container, false);

        // Initialize views
        expenseNameEditText = view.findViewById(R.id.editTextExpenseName);
        expenseAmountEditText = view.findViewById(R.id.editTextExpenseAmount);
        addExpenseButton = view.findViewById(R.id.buttonAddExpense);
        totalAmountTextView = view.findViewById(R.id.textViewTotalAmount);

        // Set OnClickListener for the Add Expense button
        addExpenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get text from EditText fields
                String expenseName = expenseNameEditText.getText().toString().trim();
                String expenseAmountStr = expenseAmountEditText.getText().toString().trim();

                // Check if any field is empty
                if (expenseName.isEmpty() || expenseAmountStr.isEmpty()) {
                    Toast.makeText(getActivity(), "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Convert expense amount to double
                    double expenseAmount = Double.parseDouble(expenseAmountStr);

                    // Update total amount spent
                    totalAmountSpent += expenseAmount;

                    // Display total amount spent
                    totalAmountTextView.setText(String.format("Total Amount Spent: $%.2f", totalAmountSpent));

                    // Perform expense adding logic (e.g., display added expense)
                    String expenseDetails = "Expense Name: " + expenseName + "\n"
                            + "Expense Amount: $" + expenseAmount;

                    Toast.makeText(getActivity(), expenseDetails, Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }
}
