package com.example.androidcoursesohad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class welcome extends AppCompatActivity {
    EditText name,Date ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc2);
        Intent s = getIntent();
        String name = s.getExtras().getString("Name" , " ");
        String date = s.getExtras().getString("Date" , " ");

        EditText fname = (EditText) findViewById(R.id.FName);
        EditText lname = (EditText) findViewById(R.id.LName);
        EditText Date = (EditText) findViewById(R.id.Date);

      fname.setText(name);
      Date.setText(date);



    }
}
