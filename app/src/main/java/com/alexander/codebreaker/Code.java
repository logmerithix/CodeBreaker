package com.alexander.codebreaker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Code extends AppCompatActivity {

    private RadioButton rdobtn11;
    private RadioButton rdobtn12;
    private RadioButton rdobtn21;
    private RadioButton rdobtn22;
    private RadioButton rdobtn23;
    private RadioButton rdobtn31;
    private RadioButton rdobtn32;
    private RadioButton rdobtn33;
    private RadioButton rdobtn34;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_code);

        rdobtn11 = (RadioButton)findViewById(R.id.rdobtn11);
        rdobtn12 = (RadioButton)findViewById(R.id.rdobtn12);
        rdobtn21 = (RadioButton)findViewById(R.id.rdobtn21);
        rdobtn22 = (RadioButton)findViewById(R.id.rdobtn22);
        rdobtn23 = (RadioButton)findViewById(R.id.rdobtn23);
        rdobtn31 = (RadioButton)findViewById(R.id.rdobtn31);
        rdobtn32 = (RadioButton)findViewById(R.id.rdobtn32);
        rdobtn33 = (RadioButton)findViewById(R.id.rdobtn33);
        rdobtn34 = (RadioButton)findViewById(R.id.rdobtn34);


    }
public void codeCheck (View vw)  {
        Intent checkTheCode = new Intent(this, codeCheck.class);


    if (rdobtn11.isChecked()) {
        checkTheCode.putExtra("LINE_ONE", "11");
    } else {
        checkTheCode.putExtra("LINE_ONE", "12");
    }

    if (rdobtn21.isChecked()) {
        checkTheCode.putExtra("LINE_TWO", "21");
    } else if (rdobtn22.isChecked()) {
        checkTheCode.putExtra ("LINE_TWO", "22");
    } else {
        checkTheCode.putExtra ("LINE_TWO", "23");
    }

    if (rdobtn31.isChecked()) {
        checkTheCode.putExtra("LINE_THREE", "31");
    } else if (rdobtn32.isChecked()) {
        checkTheCode.putExtra("LINE_THREE", "32");
    } else if (rdobtn33.isChecked()) {
        checkTheCode.putExtra("LINE_THREE", "33");
    } else {
        checkTheCode.putExtra("LINE_THREE", "34");
    }


}

    protected void activityResult (int requestCode, int resultCode, Intent data){
        rdobtn11.setChecked(false);
        rdobtn12.setChecked(false);
        rdobtn21.setChecked(false);
        rdobtn22.setChecked(false);
        rdobtn23.setChecked(false);
        rdobtn31.setChecked(false);
        rdobtn32.setChecked(false);
        rdobtn33.setChecked(false);
        rdobtn34.setChecked(false);
    }


}
