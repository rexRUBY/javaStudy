package com.example.middleexam;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.GenericArrayType;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2, num3;
    Button btn;

    static final int GET_RESULT = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setTitle("Activity");

        num1 = findViewById(R.id.editTextTextPersonName);
        num2 = findViewById(R.id.editTextTextPersonName2);
        num3 = findViewById(R.id.editTextTextPersonName3);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("number1", Integer.parseInt(num1.getText().toString()));
                intent.putExtra("number2", Integer.parseInt(num2.getText().toString()));
                startActivityForResult(intent, GET_RESULT); //서브 액티비티로 보내는것
            }
        });
    }

    @Override //서브 액티비티에서 결과값을 받기 위해
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GET_RESULT) {
            if (resultCode == RESULT_OK) {
                num3.setText("" + data.getIntExtra("RESULT", 0));
            }
        }
    }
}