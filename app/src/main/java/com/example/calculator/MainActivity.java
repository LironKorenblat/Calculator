package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button mul;
    Button dec;
    Button sub;
    Button div;
    Button eq;
    Button ac;
    TextView txt;
    EditText etn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        mul = findViewById(R.id.mul);
        dec = findViewById(R.id.dec);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        eq = findViewById(R.id.eq);
        ac = findViewById(R.id.ac);
        etn = findViewById(R.id.etn);

    }
    public int start(){
        String st1 = etn.getText().toString();
        int num1 = Integer.parseInt(etn.getText().toString());
        return num1;
    }
    public void restart(View view) {
        ac.setText("AC");
        txt.setText("start calculating");
    }
    public void divide(View view) {
    }

    public void multiply(View view) {
    }

    public void plus(View view) {
    }

    public void Subtraction(View view) {
    }

    public void equal(View view) {
    }
}