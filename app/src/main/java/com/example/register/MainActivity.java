package com.example.register;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {


    private TextView username;
    private TextView password;
    private TextView email;
    private int REQUEST_CODE =110;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent usernameintent = new Intent(MainActivity.this,UsernameActivity.class);
                startActivityForResult(usernameintent,REQUEST_CODE);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Intent endintent = getIntent();
        if( requestCode == REQUEST_CODE) {
            if (resultCode != RESULT_OK) {
                finish();
            } else {
                String userid = getSharedPreferences("test1", MODE_PRIVATE)
                        .getString("USER", "");
                String passid = getSharedPreferences("test2", MODE_PRIVATE)
                        .getString("Pass", "");
                String emailid = getSharedPreferences("test3", MODE_PRIVATE)
                        .getString("Email", " ");
            }
        }
    }
}
