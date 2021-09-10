package com.example.diceBag;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Randomizer extends AppCompatActivity {
    private static Random randomNumber = new Random();

    public static Integer randomizeD20() {
        return randomNumber.nextInt(19)+1;
    }

    public static Integer randomizeD12() {
        return randomNumber.nextInt(12) + 1;
    }

    public static Integer randomizeD10() {
        return randomNumber.nextInt(10) + 1;
    }

    public static Integer randomizeD8() {
        return randomNumber.nextInt(8) + 1;
    }

    public static Integer randomizeD6() {
        return randomNumber.nextInt(6) + 1;
    }

    public static Integer randomizeD4() {
        return randomNumber.nextInt(4) + 1;
    }
}
