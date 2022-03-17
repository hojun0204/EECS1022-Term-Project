package com.example.a1022teamprojectdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    int n;
    private Button button;
    String textView3 = "";
    TextView x3;
    Button checkbutton;
    public void rng(){
        Random rand = new Random();
        n = rand.nextInt(100)+1;
    }
    public void guess(View view) {
        updatecounter();
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
    private void updatecounter(){
        counter ++;
        x3.setText(counter + "");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rng();
        button = (Button) findViewById(R.id.nextbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    public void openActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
