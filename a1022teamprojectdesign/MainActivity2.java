package com.example.a1022teamprojectdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    int n;
    String textView3 = "";
    public void rng(){
        Random rand = new Random();
        n = rand.nextInt(100)+1;
    }
    public void guess(View view) {
        EditText guess = (EditText) findViewById(R.id.editTextTextPersonName2);
        int guessint = Integer.parseInt(guess.getText().toString());
        if (n < guessint) {
            textView3 = "Higher!";
        } else if (n > guessint) {
            textView3 = "Lower!";
        } else if (n == guessint) {
            textView3 = "Correct!";
        }
        Toast.makeText(this, textView3, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rng();
    }
}
