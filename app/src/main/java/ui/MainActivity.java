package ui;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;


import butterknife.ButterKnife;


public class MainActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, MainActivity.class);
    }
    public void requestRegister(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
    public void railwayStation(View view){
        Intent intent = new Intent(this, TransportActivity.class);
        startActivity(intent);
    }
    public void bookingSeats(View view){
        Intent intent = new Intent(this,BookingActivity.class);
        startActivity(intent);
    }
}

