package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;


public class MainActivity  extends AppCompatActivity {

    private Button logout;

//    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        Toast.makeText(MainActivity.this, "WELCOME TO MY TRANSPORT APP", Toast.LENGTH_LONG).show();


        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);


    }
}
