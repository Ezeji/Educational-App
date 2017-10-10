package com.example.user.educationalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * This method displays the second activity class by a button click
     */

    public void Forward_Button (View view)

    {
        launchActivity();
    }

    /**
     * This method contains code for viewing second activity class
     */

    private void launchActivity()

    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
