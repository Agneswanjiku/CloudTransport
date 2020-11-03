package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;

public class BookingActivity extends AppCompatActivity {


    private RadioButton rnobbles;
    private  RadioButton rEconomic;
    private RadioButton rmid;
    private TextView tBS;
    private Button SubmitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        SubmitButton = (Button) findViewById(R.id.buttonAcount);
        SubmitButton.setOnClickListener(this::onClick);
    }




        private void onClick(View view) {
            Toast.makeText(BookingActivity.this, "Warm yourSelf With A seat", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(BookingActivity.this, RegisterActivity.class);
            startActivity(intent);
        }
    }
