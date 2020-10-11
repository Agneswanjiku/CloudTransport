package com.moringaschool.mycloudtransports;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SelectionSeatsActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    private Object v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectionseatsactivity);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.text_view_selected);
        Button buttonApply = findViewById(R.id.button_apply);


        public void onClick(View v);{
            int radioId = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(radioId);

            textView.setText("Your choice" + radioButton.getText());
        }
    )};


public  void checkedButton(View view){
    int radioId = radioGroup.getCheckedRadioButtonId();
    radioButton = findViewById(radioId);

    Toast.makeText(this, "Selected Radio Button" + radioButton.getText(), Toast.LENGTH_SHORT).show();
}
}