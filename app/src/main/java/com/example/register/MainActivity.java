package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final int REQUEST_CODE_USERNAMEACTIVITY = 110;
    private TextView username;
    private TextView password;
    private TextView email;
    public Intent usernameintent;
    private float DEFULT=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);

        Button button = findViewById(R.id.into);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usernameintent = new Intent(MainActivity.this,UsernameActivity.class);
                startActivityForResult(usernameintent,REQUEST_CODE_USERNAMEACTIVITY);
            }
        });
        Log.d("MainActivity","");
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String name = intent.getStringExtra("user");
        String passid = intent.getStringExtra("password");
        String emailid =intent.getStringExtra("email");
        username.setText(name+"");
        password.setText(passid+"");
        email.setText(emailid+"");
        Log.d("MainActivity","a:"+emailid);

    }


}

