package com.uy.quizdec7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {

    TextView tvDisplayUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvDisplayUser = (TextView)findViewById(R.id.tvShowUser);
        tvDisplayUser.setText(getIntent().getStringExtra("record.txt"));
    }

    public void buttonLogout (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}





/**
    Intent intent;
    EditText userInfo, userPassword;
    Button btnLogin, btnRememberme, btnLogut;
    TextView tvDisplayUser;
    FileOutputStream fos;
    FileInputStream fis;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        btnLogut = (Button) findViewById(R.id.buttonLogout);
        btnRememberme = (Button) findViewById(R.id.buttonRememberMe);
        userInfo = (EditText) findViewById(R.id.etUser);
        userPassword = (EditText) findViewB yId(R.id.etPassword);
        tvDisplayUser = (TextView) findViewById(R.id.tvShowUser);
    }

    public void buttonLogin (View view) {
        StringBuffer buffer = new StringBuffer();
        int read = 0;
        try {
            fis = openFileInput("record.txt");
            while ((read = fis.read()) != -1) {
                buffer.append((char) read);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        tvDisplayUser.setText(buffer.toString());
    }
}

 */
