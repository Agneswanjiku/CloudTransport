package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;

public class registrationformActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrationform);
        TextView login = (TextView) findViewById(R.id.lnkLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registrationformActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}