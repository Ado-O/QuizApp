package com.example.android.a2quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    public RadioGroup g1, g2, g3, g4, g5;
    public RadioButton r1, r2, r3, r4, r5;
    public int score;
    public String tekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        score = 0;

        // pozivanje id
        r1 = (RadioButton) findViewById(R.id.radio11);
        r2 = (RadioButton) findViewById(R.id.radio12);
        r3 = (RadioButton) findViewById(R.id.radio13);
        r4 = (RadioButton) findViewById(R.id.radio14);
        r5 = (RadioButton) findViewById(R.id.radio15);

        g1 = (RadioGroup) findViewById(R.id.radioGroup);
        g2 = (RadioGroup) findViewById(R.id.radioGroup1);
        g3 = (RadioGroup) findViewById(R.id.radioGroup2);
        g4 = (RadioGroup) findViewById(R.id.radioGroup3);
        g5 = (RadioGroup) findViewById(R.id.radioGroup4);
    }

    //button za izracunavanje
    public void onRadioButtonClicked(View view) {
        if (r1.isChecked()) {
            score += 1;
        }
        if (r2.isChecked()) {
            score += 1;
        }
        if (r3.isChecked()) {
            score += 1;
        }
        if (r4.isChecked()) {
            score += 1;
        }
        if (r5.isChecked()) {
            score += 1;
        }

        // izracunava tekst score na izlazu
        if (score <= 2) {
            tekst = "Ti ces ostati uvijek gladan! :O";
        } else if (score == 3) {
            tekst = "Moze bolje! :(";
        } else if (score >= 4) {
            tekst = "Bravo!";
        }
        // izlaz na kraju
        String nesta = "Pogodio si " + score + "/5 " + tekst;
        if (score > 0) {
            Toast.makeText(Main2Activity.this, nesta, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(Main2Activity.this, "Moras odabrati barem jedno pitanje", Toast.LENGTH_LONG).show();
        }
    }

    //button restart
    public void reset(View view) {
        score = 0;
        g1.clearCheck();
        g2.clearCheck();
        g3.clearCheck();
        g4.clearCheck();
        g5.clearCheck();
    }
}
