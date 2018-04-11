package com.example.android.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AlphabetIndexer;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GamePad extends AppCompatActivity {



    String icon1 = "X";
    String icon2 = "O";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_pad);

    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    Toast.makeText(this, "Clicked X", Toast.LENGTH_SHORT).show();
                break;


            case R.id.radio_Button_two:
                if (checked)
                    Toast.makeText(this, "Clicked O", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    private void displayIconOne(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button1);
        buttonClickedTextView.setText(letter);
    }


    public void clickButton1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconOne(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconOne(icon2);
                break;
        }
    }


    private void displayIconTwo(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button2);
        buttonClickedTextView.setText(letter);
    }

    public void clickButton2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconTwo(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconTwo(icon2);
                break;
        }
    }

    private void displayIconThree(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button3);
        buttonClickedTextView.setText(letter);
    }

    public void clickButton3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconThree(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconThree(icon2);
                break;
        }
    }


    private void displayIconFour(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button4);
        buttonClickedTextView.setText(letter);
    }

    public void clickButton4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconFour(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconFour(icon2);
                break;
        }
    }


    private void displayIconFive(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button5);
        buttonClickedTextView.setText(letter);
    }

    public void clickButton5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconFive(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconFive(icon2);
                break;
        }
    }


    private void displayIconSix(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button6);
        buttonClickedTextView.setText(letter);
    }

    public void clickButton6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconSix(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconSix(icon2);
                break;
        }
    }


    private void displayIconSeven(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button7);
        buttonClickedTextView.setText(letter);
    }

    public void clickButton7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconSeven(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconSeven(icon2);
                break;
        }
    }


    private void displayIconEight(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button8);
        buttonClickedTextView.setText(letter);
    }

    public void clickButton8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconEight(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconEight(icon2);
                break;
        }
    }


    private void displayIconNine(String letter) {
        TextView buttonClickedTextView = (TextView) findViewById(R.id.button9);
        buttonClickedTextView.setText(letter);
    }

    public void clickButton9(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_Button_one:
                if (checked)
                    displayIconNine(icon1);
                break;


            case R.id.radio_Button_two:
                if (checked)
                    displayIconNine(icon2);
                break;
        }
    }


}


