package com.vikrant.tour_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ItalyTextView;
    private TextView FranceTextView;
    private TextView SpainTextView;
    private TextView RussiaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setConstants();
        ItalyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto_1 = new Intent(MainActivity.this, Italy.class);
                startActivity(goto_1);
            }
        });
        FranceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto_2 = new Intent(MainActivity.this, France.class);
                startActivity(goto_2);
            }
        });
        SpainTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto_3 = new Intent(MainActivity.this, Spain.class);
                startActivity(goto_3);
            }
        });
        RussiaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto_4 = new Intent(MainActivity.this, Russia.class);
                startActivity(goto_4);
            }
        });

    }

    public void setConstants() {
        ItalyTextView = findViewById(R.id.ItalyText);
        FranceTextView = findViewById(R.id.FranceText);
        SpainTextView = findViewById(R.id.SpainText);
        RussiaTextView = findViewById(R.id.RussiaText);
    }

}
