package com.example.diceBag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.chip.Chip;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView resultTextArea = findViewById(R.id.resultTextArea);
        TextView additionalNumber = findViewById(R.id.additionalNumber);
        TextView rollResult = findViewById(R.id.rollResult);
        TextView modifiedResult = findViewById(R.id.modifiedNumber);
        TextView runningTotal = findViewById(R.id.runningTotal);
        TextView saveNumber1 = findViewById(R.id.saveNumber1);
        TextView saveNumber2 = findViewById(R.id.saveNumber2);
        TextView saveNumber3 = findViewById(R.id.saveNumber3);

        Button d20 = findViewById(R.id.d20);
        Button d12 = findViewById(R.id.d12);
        Button d10 = findViewById(R.id.d10);
        Button d8 = findViewById(R.id.d8);
        Button d6 = findViewById(R.id.d6);
        Button d4 = findViewById(R.id.d4);
//        Button rollButton = findViewById(R.id.rollButton);
        Button clearTotalButton = findViewById(R.id.clearButton);

        Chip saveChip1 = findViewById(R.id.saveChip1);
        Chip saveChip2 = findViewById(R.id.saveChip2);
        Chip saveChip3 = findViewById(R.id.saveChip3);

//        rollButton.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint({"SetTextI18n", "ResourceType"})
//            @Override
//            public void onClick(View view) {
//                Integer additional = Utilities.parseInput(additionalNumber.getText().toString());
//                Integer rollTotal = Randomizer.randomizeD20() + additional;
//                rollResult.setText(rollTotal.toString());
//                resultTextArea.setText("Your Roll");
//            }
//        });

        clearTotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer zero = 0;
                runningTotal.setText(zero.toString());
            }
        });

        saveChip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber1.setText(runningTotal.getText());
            }
        });

        saveChip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber2.setText(runningTotal.getText());
            }
        });

        saveChip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNumber3.setText(runningTotal.getText());
            }
        });

        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer roll = Randomizer.randomizeD20();
                displayResults(roll, "You rolled a D20");
            }
        });

        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer roll = Randomizer.randomizeD12();
                displayResults(roll, "You rolled a D12");
            }
        });

        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer roll = Randomizer.randomizeD10();
                displayResults(roll, "You rolled a D10");
            }
        });

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer roll = Randomizer.randomizeD8();
                displayResults(roll, "You rolled a D8");
            }
        });

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer roll = Randomizer.randomizeD6();
                displayResults(roll, "You rolled a D6");
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer roll = Randomizer.randomizeD4();
                displayResults(roll, "You rolled a D4");
            }
        });
    }

    private void displayResults(Integer results, String message) {
        TextView additionalNumber = findViewById(R.id.additionalNumber);
        TextView modifiedResult = findViewById(R.id.modifiedNumber);
        TextView rollResult = findViewById(R.id.rollResult);
        TextView runningTotal = findViewById(R.id.runningTotal);
        TextView resultTextArea = findViewById(R.id.resultTextArea);

        Integer additional = Utilities.parseInput(additionalNumber.getText().toString());
        Integer rollTotal = results + additional;
        modifiedResult.setText(rollTotal.toString());
        rollResult.setText(results.toString());
        Integer runningTotalDisplay = Utilities.parseInput(runningTotal.getText().toString()) + rollTotal;
        runningTotal.setText(runningTotalDisplay.toString());
        resultTextArea.setText(message);
    }

}