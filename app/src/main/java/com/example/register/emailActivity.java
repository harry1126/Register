package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class emailActivity extends AppCompatActivity {

    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        email = findViewById(R.id.email_fill);
        Intent MainAcxtivityintent = getIntent();
        final Button endbutton = findViewById(R.id.button4);
        endbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent endintent = new Intent(emailActivity.this,MainActivity.class);

                startActivity(endintent);
                setResult(RESULT_OK);
                String emailbox = email.getText().toString();
                SharedPreferences pref = getSharedPreferences("test3", MODE_PRIVATE);
                pref.edit()
                        .putString("Email",emailbox)
                        .commit();
            }
        });

    }
}
