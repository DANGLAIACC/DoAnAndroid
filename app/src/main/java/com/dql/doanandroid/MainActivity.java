package com.dql.doanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dql.doanandroid.data.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            db = new DatabaseHelper(this);
        }catch(Exception e){
            System.err.println("line MainActivity.java:20 - e.getMessage() :"+e.getMessage());
        }
    }
}