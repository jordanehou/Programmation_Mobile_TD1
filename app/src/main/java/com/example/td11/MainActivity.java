package com.example.td11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private TextView message;
    private Button setting, test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.textMessages);
        setting = findViewById(R.id.main_button_setting);
        test = findViewById(R.id.test_part);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message.setText("Settings selected");

            }

        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setText("Test selected");
            }
        });

    }

    public  void onBoutonClic(View v){
        message.setText("Test selected");
        updateMessage();
    }

    private void updateMessage(){
        message.setText("Test selected");
    }
}