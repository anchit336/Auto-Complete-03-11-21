package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView; 

public class MainActivity extends AppCompatActivity {

    String subject[] = {"Bengali", "English", "Physics", "Chemistry", "Mathematics", "Biology", "Polity", "History", "Geography", "Education", "Economy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, subject );

        autoCompleteTextView.setThreshold(1);

        autoCompleteTextView.setAdapter(arrayAdapter);

    }
}