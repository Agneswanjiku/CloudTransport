package com.moringaschool.mycloudtransports;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;
import java.text.StringCharacterIterator;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

import static com.moringaschool.mycloudtransports.R.id.mListview;
import static com.moringaschool.mycloudtransports.R.id.mlocationTextView;

public class TransportActivity  extends AppCompatActivity {

    private String[] vehicles = new String[]{"Nissan", "Bus", "Pro box", "Minibus"};

    private String [] seats = new String[] { "EconomicSeats", "MiddleSeats" , "Nobbleseats"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.array_adapter);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location;
        String Location = intent.getStringExtra(location);

        ArrayAdapter vehicles_ad = new ArrayAdapter(this, android.R.layout.activity_list_item, vehicles);
        AdapterView mListView = null;
        mListView.setAdapter(vehicles_ad);
        mListView.setOnClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View View, int i, long l) {
                String vehicles = ((TextView)View).getText.toString();
                Toast.makeText(TransportActivity.this, "", Toast.LENGTH_SHORT).show();

            }
        });


        StringCharacterIterator mLocationTextView = null;
        mLocationTextView.setText("Hey available transport" + Location );
    }
}

