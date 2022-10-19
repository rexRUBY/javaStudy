package com.example.middleexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {
    Button retBtn, celBtn;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        setTitle("WidgetGraphicActivity");

        retBtn=findViewById(R.id.button2);
        celBtn=findViewById(R.id.button3);
        text=findViewById(R.id.editTextTextPersonName4);

        Intent intent = getIntent();
        text.setText(""+intent.getIntExtra("number1",0)+" + "+intent.getIntExtra("number2",0));

        retBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = intent.getIntExtra("number1",0)+intent.getIntExtra("number2",0);
                Intent intent1 = new Intent();
                intent1.putExtra("RESULT",res);
                setResult(RESULT_OK,intent1);
                finish();
            }
        });

        celBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}