package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText BillEditText;
    private TextView TipTextView;
    private Button FifteenButton;
    private Button EighteenButton;
    private Button TwentyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BillEditText = findViewById(R.id.billEditText);
        TipTextView = findViewById(R.id.tipTextView);
        FifteenButton = findViewById(R.id.fifteenButton);
        EighteenButton = findViewById(R.id.eighteenButton);
        TwentyButton = findViewById(R.id.twentyButton);

        FifteenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bill = Double.parseDouble(BillEditText.getText().toString());
                double tip = bill * .15;
                double total = bill + tip;
                TipTextView.setText("Tip: $" + tip + ", Total Bill: $" + total);
            }
        });

        EighteenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bill = Double.parseDouble(BillEditText.getText().toString());
                double tip = bill * .18;
                double total = bill + tip;
                TipTextView.setText("Tip: $" + tip + ", Total Bill: $" + total);
            }
        });

        TwentyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bill = Double.parseDouble(BillEditText.getText().toString());
                double tip = bill * .20;
                double total = bill + tip;
                TipTextView.setText("Tip: $" + tip + ", Total Bill: $" + total);
            }
        });
    }
}