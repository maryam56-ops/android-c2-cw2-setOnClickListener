package com.example.firstprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText first_number = findViewById(R.id.firstnumber);
        EditText second_number = findViewById(R.id.secondnumber);
        Button calculate = findViewById(R.id.calculate);
        TextView total = findViewById(R.id.total);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.parseInt(first_number.getText().toString());
                int n2 = Integer.parseInt(second_number.getText().toString());
                total.setText(Integer.toString(n1 + n2 ));
            }
        });
    }
}