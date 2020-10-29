package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;


public class MainActivity  extends AppCompatActivity {

    private Button logout;
    Bundle bundle;
    String value;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Initializing button XML button id. findViewById is a method which
         * helps to initialize with particular id. btn_go_to_another_activity is
         * a button name which I have given in XML file
         */
        logout = (Button) findViewById(R.id.logout);
        // Initializing EditText view
        textView = (TextView) findViewById(R.id.textView);

        // Bundle
        bundle = new Bundle();

        logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // Get value from EditText from main_activity layout
                value = textView.getText().toString();

                bundle.putString("value", value);

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent = new Intent(MainActivity.this,
                        RegisterActivity.class);
                // Pass data to AnotherActivity
                intent.putExtras(bundle);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}