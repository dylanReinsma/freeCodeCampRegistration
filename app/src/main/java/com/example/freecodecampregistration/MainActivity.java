package com.example.freecodecampregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerOnClick(View view) {
        TextView firstName = findViewById(R.id.textViewFirstName);
        TextView lastName = findViewById(R.id.textViewLastName);
        TextView email = findViewById(R.id.textViewEmail);

        EditText editFirstName = findViewById(R.id.editTextFirstName);
        EditText editLastName = findViewById(R.id.editTextLastName);
        EditText editEmail = findViewById(R.id.editTextEmail);

        firstName.setText("First Name: " + editFirstName.getText().toString());
        lastName.setText("Last Name: " + editLastName.getText().toString());
        email.setText("Email: " + editEmail.getText().toString());

    }
}