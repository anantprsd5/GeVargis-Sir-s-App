package com.application.gevargissirsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText collectorDepthEditText;
    private EditText collectorLengthEditText;
    private EditText horizontalVelocityEditText;
    private EditText gasDensityEditText;
    private float collectorDepth;
    private float collectorLength;
    private float horizontalVelocity;
    private float gasDensity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collectorDepthEditText = findViewById(R.id.editText);
        collectorLengthEditText = findViewById(R.id.editText2);
        horizontalVelocityEditText = findViewById(R.id.editText3);
        gasDensityEditText = findViewById(R.id.editText4);

        collectorDepth = Float.parseFloat(collectorDepthEditText.getText().toString());
        collectorLength = Float.parseFloat(collectorLengthEditText.getText().toString());
        horizontalVelocity = Float.parseFloat(horizontalVelocityEditText.getText().toString());
        gasDensity = Float.parseFloat(gasDensityEditText.getText().toString());

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateParams();
            }
        });

    }

    private void calculateParams() {

    }
}
