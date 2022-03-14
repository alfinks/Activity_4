package com.example.activity_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_2 extends AppCompatActivity {
    TextView tdEmail, tdPassword;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tdEmail =findViewById(R.id.tvEmail);
        tdPassword =findViewById(R.id.tvPassword);

        Bundle bundle =getIntent().getExtras();

        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        tdEmail.setText(email);
        tdPassword.setText(pass);
    }
}