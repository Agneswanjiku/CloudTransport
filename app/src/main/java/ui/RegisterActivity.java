package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;

public class RegisterActivity extends AppCompatActivity {


    private EditText editName;
    private  EditText editEmail;
    private  EditText editpass;
    private Button  buttonAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        buttonAccount = (Button) findViewById(R.id.buttonAcount);
        buttonAccount.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        Toast.makeText(RegisterActivity.this, "WELCOME TO MY TRANSPORT APP", Toast.LENGTH_LONG).show();


        Intent intent = new Intent(RegisterActivity.this, BookingActivity.class);
        startActivity(intent);




    }
}

