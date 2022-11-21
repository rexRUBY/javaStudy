package com.example.personalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView location, list, analysis;
    View locationLayout, listLayout, analysisLayout;

    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        location = findViewById(R.id.location);
        list = findViewById(R.id.addList);
        analysis = findViewById(R.id.analysis);

        locationLayout = findViewById(R.layout.location_view);
        listLayout = findViewById(R.layout.list_view);
        analysisLayout = findViewById(R.layout.analysis_view);


        FragmentManager fragManager = getFragmentManager();

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        analysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}