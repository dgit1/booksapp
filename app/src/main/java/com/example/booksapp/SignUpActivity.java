package com.example.booksapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booksapp.databaseHelper.DataBaseHelper;

public class SignUpActivity extends Activity {

    EditText editTextEmail,editTextPassword;
    Button continue_btn;
    TextView already_acc_tv;
    DataBaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        myDb = new DataBaseHelper(SignUpActivity.this);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        continue_btn = findViewById(R.id.continue_btn);
        continue_btn.setOnClickListener(view -> {

            if(editTextEmail.getText().toString().isEmpty()) {
                editTextEmail.setError("Email cannot be empty");
                return;
            }

            if(editTextPassword.getText().toString().isEmpty()) {
                editTextPassword.setError("Password cannot be empty");
                return;
            }

            boolean isSuccess = myDb.insertUserData(editTextEmail.getText().toString().trim(),
                    editTextPassword.getText().toString().trim());
            if(isSuccess) {
                Toast.makeText(SignUpActivity.this, "Account Created", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUpActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }else
                Toast.makeText(SignUpActivity.this, "Cannot create account", Toast.LENGTH_SHORT).show();
        });
        already_acc_tv = findViewById(R.id.already_acc_tv);
        already_acc_tv.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
            startActivity(intent);
        });
    }

}
