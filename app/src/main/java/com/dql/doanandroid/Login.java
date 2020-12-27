package com.dql.doanandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dql.doanandroid.data.DatabaseHelper;
import com.dql.doanandroid.model.User;

public class Login extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    TextView lblRegister;
    Button btnLoginGoogle, btnLoginFacebook, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getViewById();
        addEvent();
    }

    private void addEvent() {
        btnLoginGoogle.setOnClickListener(btnGoogle_click);
        btnLoginFacebook.setOnClickListener(btnGoogle_click);
        lblRegister.setOnClickListener(btnGoogle_click);

        btnLogin.setOnClickListener(btnLogin_click);
    }

    private OnClickListener btnLogin_click = new OnClickListener() {
        @Override
        public void onClick(View v) {
            DatabaseHelper db = new DatabaseHelper(Login.this);

            User u = db.login(String.valueOf(txtUsername.getText()), String.valueOf(txtPassword.getText()));
                
            if(u!=null){
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(Login.this, "Thông tin đăng nhập sai.", Toast.LENGTH_SHORT).show();
                txtPassword.setText("");
                txtUsername.setText("");
                txtUsername.requestFocus();
            }

        }
    };
    private OnClickListener btnGoogle_click = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(Login.this, "Chức năng đang phát triển", Toast.LENGTH_SHORT).show();
        }
    };

    private void getViewById() {
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLoginGoogle = findViewById(R.id.btnLoginGoogle);
        btnLoginFacebook = findViewById(R.id.btnLoginFacebook);
        btnLogin = findViewById(R.id.btnLogin);
        lblRegister = findViewById(R.id.lblRegister);
    }
    private void saveToSharedPreferences(User user) {
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("loginInfo", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("usrUsr", user.getUsrUsr());
        editor.putString("usrName", user.getUsrName());
        editor.apply();
    }
}