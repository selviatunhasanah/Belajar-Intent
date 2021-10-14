package com.example.belajarintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecondActivity = findViewById(R.id.btn_second_activity);
        EditText etInput = findViewById(R.id.et_input);

        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = etInput.getText().toString();

                Intent intent = new Intent(MainActivity.this, secondactivity.class);
                intent.putExtra("data", data);
                startActivity(intent);

            }
        });
    }
}