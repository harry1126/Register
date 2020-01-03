package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasswordActivity extends AppCompatActivity {

    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        pass = findViewById(R.id.password_fill);
        Intent passwordintent = getIntent();
        Button goEmailbutton = findViewById(R.id.button3);
        goEmailbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailintent = new Intent(PasswordActivity.this, emailActivity.class);

                startActivity(emailintent);
                setResult(RESULT_OK);
                String password =pass.getTag().toString() ;
                SharedPreferences pref = getSharedPreferences("test2", MODE_PRIVATE);
                pref.edit()
                        .putString("Pass",password)
                        .commit();
            }

        });

    }
}
