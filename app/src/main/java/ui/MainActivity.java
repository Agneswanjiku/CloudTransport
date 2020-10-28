package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;


public class MainActivity  extends AppCompatActivity {
    private Button mlogout;
    private TextView mTextView2;
    private Object View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mlogout_Button = (Button) findViewById(R.id.logout);
        TextView mTextView = (TextView) findViewById(R.id.TextView2);

//        mlogout_Button.setOnClickListener((View) = new void[]{Toast.makeText(MainActivity.this, "loading transport RegisterActivity!", Toast.LENGTH_LONG).show()};

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

    private class LENGTH {

    }
}

