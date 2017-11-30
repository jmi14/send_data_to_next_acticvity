package com.example.hpfolio.myapplicationsenddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvData = (TextView)findViewById(R.id.tvdata);

        Bundle bundle = getIntent().getExtras();
        String myData = bundle.getString("data");

        tvData.setText(myData);



    }
}
