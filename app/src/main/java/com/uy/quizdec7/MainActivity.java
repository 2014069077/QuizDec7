package com.uy.quizdec7;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    EditText userInfo, userPassword;
    Button btnLogin, btnRememberme, btnLogut;
    TextView tvDisplayUser;
    FileOutputStream fos;
    FileInputStream fis;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        btnLogut = (Button) findViewById(R.id.buttonLogout);
        btnRememberme = (Button) findViewById(R.id.buttonRememberMe);
        userInfo = (EditText) findViewById(R.id.etUser);
        userPassword = (EditText) findViewById(R.id.etPassword);
        tvDisplayUser = (TextView) findViewById(R.id.tvShowUser);
    }

    public void buttonLogin(View view) {
        intent = new Intent(view.getContext(), Main2Activity.class);
        String message = userInfo.getText().toString();
        try {
            fos = openFileOutput("record.txt", Context.MODE_PRIVATE);
            fos.write(message.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}

    /**

    public void buttonLogin (View view) {
        String message = userInfo.getText().toString();

        try {
            fos = openFileOutput("record.txt", Context.MODE_PRIVATE);
            fos.write(message.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
    }
     */

