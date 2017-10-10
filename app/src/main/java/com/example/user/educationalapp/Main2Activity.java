package com.example.user.educationalapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.duration;
import static android.R.id.text1;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    /**
     *
     * This exits the second activity class for first activity class
     */

    public void Back_Button(View view)

    {
        finish();
    }

    /**
     * This method generates toast for Option1 of Question1
     */

    private void First_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text1 = "Your option of choice is correct";
        int duration = Toast.LENGTH_SHORT;
        Toast toast1 = Toast.makeText(context, text1, duration);
        toast1.show();
    }

    /**
     * This method generates toast for Option2 of Question1
     */

    private void Second_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text2 = "Spatial Information is the answer";
        int duration = Toast.LENGTH_SHORT;
        Toast toast2 = Toast.makeText(context, text2, duration);
        toast2.show();
    }

    /**
     * This method generates toast for Option1 of Question2
     */

    private void Third_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text3 = "Your answer is correct";
        int duration = Toast.LENGTH_SHORT;
        Toast toast3 = Toast.makeText(context, text3, duration);
        toast3.show();
    }

    /**
     * This method generates toast for Option2 of Question2
     */

    private void Fourth_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text4 = "A surveyor is also a geodesist is the correct answer";
        int duration = Toast.LENGTH_SHORT;
        Toast toast4 = Toast.makeText(context, text4, duration);
        toast4.show();
    }

    /**
     * This method generates toast for Option1 of Question3
     */

    private void Fifth_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text5 = "Your selected option is correct";
        int duration = Toast.LENGTH_SHORT;
        Toast toast5 = Toast.makeText(context, text5, duration);
        toast5.show();
    }

    /**
     * This method generates toast for Option2 of Question3
     */

    private void Sixth_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text6 = "Photogrammetry is also a branch of surveying is the right option";
        int duration = Toast.LENGTH_SHORT;
        Toast toast6 = Toast.makeText(context, text6, duration);
        toast6.show();
    }

    /**
     * This method generates toast for Option1 of Question4
     */

    private void Seventh_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text7 = "Your answer is correct";
        int duration = Toast.LENGTH_SHORT;
        Toast toast7 = Toast.makeText(context, text7, duration);
        toast7.show();
    }

    /**
     * This method generates toast for Option2 of Question4
     */

    private void Eight_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text8 = "The Geoid is the correct option";
        int duration = Toast.LENGTH_SHORT;
        Toast toast8 = Toast.makeText(context, text8, duration);
        toast8.show();
    }

    /**
     * This method generates toast for Option1 of Question5
     */

    private void Ninth_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text9 = "Random errors are inevitable in survey measurements";
        int duration = Toast.LENGTH_SHORT;
        Toast toast9 = Toast.makeText(context, text9, duration);
        toast9.show();
    }

    /**
     * This method generates toast for Option2 of Question5
     */

    private void Tenth_Toast()

    {
        Context context = getApplicationContext();
        CharSequence text10 = "Your option of choice is the right answer";
        int duration = Toast.LENGTH_SHORT;
        Toast toast10 = Toast.makeText(context, text10, duration);
        toast10.show();
    }

    /**
     *
     * This method displays quiz result in a toast message for Question1
     */

    public void Question_One(View view)

    {
        boolean Checked1 = ((RadioButton) view).isChecked();

        switch (view.getId())

        {
            case R.id.R_button1:

                if (Checked1)

                    First_Toast();

                break;

            case R.id.R_button2:

                if (Checked1)

                    Second_Toast();

                break;

        }

    }

    /**
     *
     * This method displays quiz result in a toast message for Question2
     */

    public void Question_Two(View view)

    {

        boolean Checked2 = ((RadioButton) view).isChecked();

        switch (view.getId())

        {
            case R.id.R_button3:

                if (Checked2)

                    Third_Toast();

                break;

            case R.id.R_button4:

                if (Checked2)

                    Fourth_Toast();

                break;


        }
    }

    /**
     *
     * This method displays quiz result in a toast message for Question3
     */

    public void Question_Three(View view)

    {

        boolean Checked3 = ((RadioButton) view).isChecked();

        switch (view.getId())

        {
            case R.id.R_button5:

                if (Checked3)

                    Fifth_Toast();

                break;

            case R.id.R_button6:

                if (Checked3)

                    Sixth_Toast();

                break;

        }


    }

    /**
     *
     * This method displays quiz result in a toast message for Question4
     */

    public void Question_Four(View view)

    {

        boolean Checked4 = ((RadioButton) view).isChecked();

        switch (view.getId())

        {
            case R.id.R_button7:

                if (Checked4)

                    Seventh_Toast();

                break;

            case R.id.R_button8:

                if (Checked4)

                    Eight_Toast();

                break;
        }


    }

    /**
     *
     * This method displays quiz result in a toast message for Question5
     */

    public void Question_Five(View view)

    {

        boolean Checked5 = ((RadioButton) view).isChecked();

        switch (view.getId())

        {
            case R.id.R_button9:

                if (Checked5)

                    Ninth_Toast();

                break;

            case R.id.R_button10:

                if (Checked5)

                    Tenth_Toast();

                break;


        }
    }
}