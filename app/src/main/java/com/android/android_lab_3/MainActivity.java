package com.android.android_lab_3;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button switchToGreen;
    private Button switchToRed;
    private Button switchToBlue;
    private Button switchToYellow;
    private Button switchCat;
    private Button switchDev;
    private ConstraintLayout screenLayout;
    private Toast informationToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchToBlue = (Button) findViewById(R.id.switchBlue);
        switchToGreen = (Button) findViewById(R.id.switchGreen);
        switchToRed = (Button) findViewById(R.id.switchRed);
        switchToYellow = (Button) findViewById(R.id.switchYellow);
        switchCat = (Button) findViewById(R.id.switchCat);
        switchDev = (Button) findViewById(R.id.switchDev);
        screenLayout = (ConstraintLayout) findViewById(R.id.screenLayout);

        switchToBlue.setOnClickListener(this);
        switchToRed.setOnClickListener(this);
        switchToGreen.setOnClickListener(this);
        switchToYellow.setOnClickListener(this);
        switchCat.setOnClickListener(this);
        switchDev.setOnClickListener(this);
        informationToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
    }

    @Override
    public void onClick(View view) {
        if (switchToBlue.equals(view)) {
            screenLayout.setBackgroundColor(Color.BLUE);
            showToast("Hello blue");
        } else if (switchToRed.equals(view)) {
            screenLayout.setBackgroundColor(Color.RED);
            showToast("Hello red");
        } else if (switchToGreen.equals(view)) {
            screenLayout.setBackgroundColor(Color.GREEN);
            showToast("Hello green");
        } else if (switchToYellow.equals(view)) {
            screenLayout.setBackgroundColor(Color.YELLOW);
            showToast("Hello yellow");
        } else if (switchCat.equals(view)) {
            screenLayout.setBackground(getDrawable(R.drawable.cat));
        } else if (switchDev.equals(view)) {
            showToast("Алевтина Юревич");
        }
    }

    private void showToast(String text) {
   //     informationToast.cancel();
        informationToast.setText(text);
        informationToast.show();
    }
}
