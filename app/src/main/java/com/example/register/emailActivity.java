package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class emailActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_MAINACTIVITY =102 ;
    private EditText mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        mail = findViewById(R.id.email_fill);
        final Intent emailintent = getIntent();
        final Intent passwordintent = getIntent();
        final Button endbutton = findViewById(R.id.goback);
        endbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivityintent = new Intent(emailActivity.this,MainActivity.class);
                MainActivityintent.putExtra("user",passwordintent.getStringExtra("user"))
                        .putExtra("password",emailintent.getStringExtra("password"))
                        .putExtra("email",mail.getText().toString());

                MainActivityintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                setResult(RESULT_OK,emailintent);
                startActivity(MainActivityintent);
                Log.d("emailActivity","d:"+mail.getText().toString());
                Log.d("emailActivity","d:"+passwordintent.getStringExtra("user"));
                Log.d("emailActivity","d:"+emailintent.getStringExtra("password"));
            }
        });

    }
}
