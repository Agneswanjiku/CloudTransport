package com.moringaschool.mycloudtransports;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText password;
    private Button login;
    private int Counter;
    private TextView Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        password = (EditText) findViewById(R.id.etpassword);
        login = (Button) findViewById(R.id.btnlogin);
        Info=(TextView)findViewById(R.id.tvInfo);
        login.setOnClickListener(new View.OnClickListener);

        Info.SetText("No of attempts remaining:10");

        @Override
        public void Onclick (View v)
        validate (Name.getText().toString(), Password.getText().toString())
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        })
}