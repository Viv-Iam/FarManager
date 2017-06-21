package com.innovach.farmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;

import com.innovach.farmanager.R;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.produce_btn) Button mProduce_btn;
    @Bind(R.id.disease_btn) Button mDisease_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mProduce_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProduceActivity.class);
                startActivity(intent);
            }
        });
        mDisease_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiseaseActivity.class);
                startActivity(intent);
            }
        });

    }
}