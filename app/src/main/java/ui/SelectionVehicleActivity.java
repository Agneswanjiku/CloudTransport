package ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.moringaschool.mycloudtransports.R;

public class SelectionVehicleActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton selectedRadioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectionvehicleactivity);

        Button buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        /*
            Submit Button
        */
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // get the selected RadioButton of the group
                selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                //get RadioButton text
                String yourVote = selectedRadioButton.getText().toString();
                // display it as Toast to the user
                Toast.makeText(SelectionVehicleActivity.this, "Selected Radio Button is:" + yourVote, Toast.LENGTH_LONG).show();
            }
        });
    }
}
