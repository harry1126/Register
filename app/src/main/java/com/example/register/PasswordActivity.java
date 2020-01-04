package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasswordActivity extends AppCompatActivity {

    private EditText pass;
    private int REQUEST_CODE_EMAILACTIVITY=101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        pass = findViewById(R.id.password_fill);
        final Intent passwordintent = getIntent();

//        setResult(RESULT_OK);
        Button goEmailbutton = findViewById(R.id.goemail);
        goEmailbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailintent = new Intent(PasswordActivity.this, emailActivity.class);
                emailintent.putExtra("password",pass.getText().toString())
                        .putExtra("user",passwordintent.getStringExtra("user"));
                startActivity(emailintent);
                Log.d("PasswordActivity","c:");
            }
        });

    }
}
