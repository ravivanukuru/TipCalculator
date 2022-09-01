package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EnterBillAmount;
    private TextView TipTextView;
    private Button FifteenPercentButton ;
    private Button EighteenPercentButton;
    private Button TwentyPercentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EnterBillAmount = findViewById(R.id.EnterBillAmount);
        TipTextView = findViewById(R.id.tipTextView);
        FifteenPercentButton  = findViewById(R.id.FifteenPercentButton);
        EighteenPercentButton = findViewById(R.id.EighteenPercentButton);
        TwentyPercentButton = findViewById(R.id.TwentyPercentButton);

        FifteenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bill = Double.parseDouble(EnterBillAmount.getText().toString());
                double tip = bill * .15;
                double total = bill + tip;
                TipTextView.setText("Tip: $" + tip + ", Total Bill: $" + total);
            }
        });

        EighteenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bill = Double.parseDouble(EnterBillAmount.getText().toString());
                double tip = bill * .18;
                double total = bill + tip;
                TipTextView.setText("Tip: $" + tip + ", Total Bill: $" + total);
            }
        });

        TwentyPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bill = Double.parseDouble(EnterBillAmount.getText().toString());
                double tip = bill * .20;
                double total = bill + tip;
                TipTextView.setText("Tip: $" + tip + ", Total Bill: $" + total);
            }
        });
    }
}