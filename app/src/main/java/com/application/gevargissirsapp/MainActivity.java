package com.application.gevargissirsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText collectorDepthEditText;
    private EditText collectorLengthEditText;
    private EditText horizontalVelocityEditText;
    private EditText gasDensityEditText;
    private EditText particleDensityEditText;
    private TextView textView;
    private float collectorDepth;
    private float collectorLength;
    private float horizontalVelocity;
    private float gasDensity;
    private float particleDensity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collectorDepthEditText = findViewById(R.id.editText);
        collectorLengthEditText = findViewById(R.id.editText2);
        horizontalVelocityEditText = findViewById(R.id.editText3);
        gasDensityEditText = findViewById(R.id.editText4);
        particleDensityEditText = findViewById(R.id.editText5);
        textView = findViewById(R.id.textView3);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                collectorDepth = Float.parseFloat(collectorDepthEditText.getText().toString());
                collectorLength = Float.parseFloat(collectorLengthEditText.getText().toString());
                horizontalVelocity = Float.parseFloat(horizontalVelocityEditText.getText().toString());
                gasDensity = Float.parseFloat(gasDensityEditText.getText().toString());
                particleDensity = Float.parseFloat(particleDensityEditText.getText().toString());
                calculateParams();
            }
        });

    }

    private void calculateParams() {
        double t = -9.8*particleDensity*particleDensity*gasDensity*collectorLength;
        double f = t/(18*(2.17*0.00001)*horizontalVelocity*collectorDepth);
        double a = Math.pow(2.7, f);
        double e = 1-a;
        textView.setVisibility(View.VISIBLE);
        textView.setText("The Efficiency of Chamber is = "+ e);

    }
}
