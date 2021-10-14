package com.example.belajarintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        TextView tvdata = findViewById(R.id.tv_data);

        Intent dataintent = getIntent();

        String data = dataintent.getStringExtra("data");

        if (data.equals("")) {
            data = "tidak ada data yang dikirimkan";
        }
        tvdata.setText(data);

        }
    }
