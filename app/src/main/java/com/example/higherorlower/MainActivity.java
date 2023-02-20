package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void guess(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if(guessInt>randomNumber){
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        } else if (guessInt<randomNumber) {
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Your guess is right", Toast.LENGTH_SHORT).show();
        }


        //Toast.makeText(this, guessEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random ram = new Random();

        int randomNumber = ram.nextInt(20) + 1;
    }
}