package com.moringaschool.mycloudtransports;

import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ArrayAdapter<S, MyAdapter, myAdapter> extends AppCompatActivity {
     ListView myListView = findViewById(R.id.Mylist);
     String items[] = new String[]{"Nissan", "Minbus", "Bus"};
     android.widget.ArrayAdapter<String> myAdapters = new ArrayAdapter<String>(ArrayAdapter.this, android.R.layout.activity_list_item, items);

     myListView.setAdapter(myAdapter);
}
