package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView ans;
    private EditText value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        ans = findViewById(R.id.ans);
        value = findViewById(R.id.value);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Please enter weight in KG", Toast.LENGTH_SHORT).show();
                String s = value.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                ans.setText("The corresponding weight in pound : " + pound);
            }
        });
    }
}