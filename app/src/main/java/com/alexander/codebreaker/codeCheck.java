package com.alexander.codebreaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class codeCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_check);

        String lineOne = getIntent().getStringExtra("LINE_ONE");
        String lineTwo = getIntent().getStringExtra("LINE_TWO");
        String lineThree = getIntent().getStringExtra("LINE_THREE");

        final double BUTTON_11 = 1.00;
        final double BUTTON_12 = 2.00;
        final double BUTTON_21 = 1.00;
        final double BUTTON_22 = 2.00;
        final double BUTTON_23 = 3.00;
        final double BUTTON_31 = 1.00;
        final double BUTTON_32 = 2.00;
        final double BUTTON_33 = 3.00;
        final double BUTTON_34 = 4.00;

        double codeAnswer = 0.0;
        double line_One = 0.0;
        double line_Two = 0.0;
        double line_Three = 0.0;


        TextView txtvwAnswer = (TextView) findViewById(R.id.txtvwAnswer);

        if (lineOne.equals("11")){
            line_One = BUTTON_11;
            chkboxOne.setChecked(true);
        } else {
            line_One = BUTTON_12;
        }



        if (lineTwo.equals("21")) {
            line_Two = BUTTON_21;
        } else if (lineTwo.equals("22")) {
            line_Two = BUTTON_22;
        } else {
            line_Two = BUTTON_23;
            chkboxTwo.setChecked(false);
        }

        if (lineThree.equals("31")) {
            line_Three = BUTTON_31;
        } else if (lineThree.equals("32")) {
            line_Three = BUTTON_32;
        } else if (lineThree.equals("33")) {
            line_Three = BUTTON_33;
            chkboxThree.setChecked(true);
        } else {
            line_Three = BUTTON_34;
        }

        codeAnswer = line_One+line_Two+line_Three;

        String textAnswer = String.format("%d", codeAnswer);

        txtvwAnswer.setText(textAnswer);

    }

    public void backToCode (View vw) {
        Intent redoCode = new Intent();
        chkboxOne.setChecked(false);
        chkboxTwo.setChecked(false);
        chkboxThree.setChecked(false);
    }

}
