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
    int cheak = 0;
    int num =0;
    int num2 =0;
    String option= " ";
    int cheaker = 0;
    int reaseult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        int num1 = Integer.parseInt(st1);
        return num1;
    }
    public void restart(View view) {
        ac.setText("AC");
        num = 0;
        num2 = 0;
        option = "";
        cheak = 1;
        etn.setText("");
        etn.setHint("0");
    }

    public void plus(View view) {
        if (cheak == 1) {
            num = start();
            option = "+";
            etn.setText("");
        }
    }

    public void multiply(View view) {
        if (cheak == 1) {
            num = start();
            option = "*";
            etn.setText("");
        }
    }

    public void divide(View view) {
        if (cheak == 1) {
            num = start();
            option = "/";
            etn.setText("");
        }
    }

    public void Subtraction(View view) {
        if (cheak == 1) {
            num = start();
            option = "-";
            etn.setText("");
        }
    }

    public void equal(View view) {
        num2 = start();

        if (option == "+") {
            etn.setText("" + (num + num2));
        }
        if (option == "-") {
            etn.setText("" + (num - num2));
        }
        if (option == "*") {
            etn.setText("" + (num * num2));
        }
        if (option == "/") {
            if (num2 != 0) {
                etn.setText("" + (num / num2));
            } else {
                etn.setText("Error");
            }
        }
    }
}