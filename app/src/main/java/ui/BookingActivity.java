package ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;

import butterknife.BindView;

public class BookingActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    Button buttonSubmit;

    @BindView(R.id.etName)
    EditText metName;
    @BindView(R.id.etPassword)
    EditText metPasssword;
    @BindView(R.id.appNameTextView)
    TextView mappNameTextView;
    @BindView(R.id.btnLogin)
    Button mbtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookingactivity);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        radioGroup = (RadioGroup) findViewById(R.id.rGroup);

        /*
            Submit Button
        */
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // get the selected RadioButton of the group
                selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                //get RadioButton text
                String yourSeat = selectedRadioButton.getText().toString();
                // display it as Toast to the user
                Toast.makeText(BookingActivity.this, "Selected Radio Button is:" + yourSeat, Toast.LENGTH_LONG).show();
            }
        });
    }
}
