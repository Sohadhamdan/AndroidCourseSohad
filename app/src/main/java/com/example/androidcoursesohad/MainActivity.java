package com.example.androidcoursesohad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText fname , lname , date ;
Button btn_regester ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = (EditText) findViewById(R.id.FName);
        lname = (EditText) findViewById(R.id.LName) ;
        date = (EditText) findViewById(R.id.Date);
        btn_regester = (Button) findViewById(R.id.Register);
        btn_regester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent welcome = new Intent (getBaseContext(), welcome.class);

                String fnamevalue = fname.getText().toString();
                String lnamevalue = lname.getText().toString();
                String datevalue = date.getText().toString();

                welcome.putExtra( "your Name : ",fnamevalue);
                welcome.putExtra( "your Name : ",lnamevalue);
                welcome.putExtra( "your Name : ",datevalue);
                startActivity(welcome);

            }
        });





    }
}
