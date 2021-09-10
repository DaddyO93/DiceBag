package com.example.diceBag;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Utilities extends AppCompatActivity {
    public static Integer parseInput(String input) {
        Integer additional = 0;
        if (input.length()>0) {
            additional = Integer.parseInt(input);
        }
        return additional;
    }

}
