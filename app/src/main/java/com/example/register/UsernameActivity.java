package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UsernameActivity extends AppCompatActivity {

    private EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        user = findViewById(R.id.username_fill);
        Button goPasswordbutton = findViewById(R.id.gopassword);
        goPasswordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passwordintent =new Intent(UsernameActivity.this,PasswordActivity.class);
                passwordintent.putExtra("user",user.getText().toString());
                startActivity(passwordintent);
            }
        });
    }
}
