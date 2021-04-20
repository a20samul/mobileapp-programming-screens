package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText myNewEdt = findViewById(R.id.myNewEdt);

        Button startButton = findViewById(R.id.start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myNewEdtText = myNewEdt.getText().toString();
                Log.d("TAG", "Start SecondActivity" + myNewEdtText);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", myNewEdtText);
                startActivity(intent);
            }
        });

    }
}
