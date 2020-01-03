package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UsernameActivity extends AppCompatActivity {

    private EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        user = findViewById(R.id.username_fill);
        setContentView(R.layout.activity_username);
        Intent usernameintent = getIntent();
        Button goPasswordbutton = findViewById(R.id.button2);
        goPasswordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passwordintent =new Intent(UsernameActivity.this,PasswordActivity.class);

                startActivity(passwordintent);
                setResult(RESULT_OK);
                String name = user.getText().toString();
                SharedPreferences pref = getSharedPreferences("test1", MODE_PRIVATE);
                pref.edit()
                        .putString("USER", name)
                        .commit();
            }
        });


    }
}
