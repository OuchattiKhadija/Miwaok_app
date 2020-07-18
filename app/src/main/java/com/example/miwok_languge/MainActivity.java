package com.example.miwok_languge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView color = (TextView) findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent color = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(color);
            }
        });
    }

    public void openNumbersList(View view) {
        Intent numbers = new Intent(this,NumbersActivity.class);
        startActivity(numbers);
    }

    public void openFamilyList(View view) {
        Intent family = new Intent(this,FamillyActivity.class);
        startActivity(family);
    }


    public void openPhrasesList(View view) {
        Intent phrases = new Intent(this,PhrasesActivity.class);
        startActivity(phrases);
    }
}