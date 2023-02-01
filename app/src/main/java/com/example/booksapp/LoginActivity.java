package com.example.booksapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booksapp.databaseHelper.DataBaseHelper;
import com.example.booksapp.models.UserModel;

public class LoginActivity extends Activity {


    EditText editTextEmail,editTextPassword;
    Button signin_btn,signup_btn;
    DataBaseHelper myDb;
    UserModel userModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myDb = new DataBaseHelper(LoginActivity.this);

        signup_btn = findViewById(R.id.signup_btn);
        signup_btn.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
            startActivity(intent);
        });
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        signin_btn = findViewById(R.id.signin_btn);
        signin_btn.setOnClickListener(view -> {

            if(editTextEmail.getText().toString().isEmpty()) {
                editTextEmail.setError("Email cannot be empty");
                return;
            }

            if(editTextPassword.getText().toString().isEmpty()) {
                editTextPassword.setError("Password cannot be empty");
                return;
            }

            userModel = myDb.getUserData(editTextEmail.getText().toString());
            if(userModel!=null){
                if(userModel.getUserPass().equals(editTextPassword.getText().toString())){
                    Toast.makeText(LoginActivity.this, "LoggedIn successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "Wrong email or password", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(LoginActivity.this, "No user found", Toast.LENGTH_SHORT).show();
            }

        });

    }
}
