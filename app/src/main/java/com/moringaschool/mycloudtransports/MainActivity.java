package com.moringaschool.mycloudtransports;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.concurrent.atomic.AtomicMarkableReference;

public class MainActivity<options> extends AppCompatActivity {

    private RecyclerView recyclerView;
    personalAdapter
            adapter; // Create Object of the Adapter class
    Object mbase; // Create object of the
    // Firebase Realtime Database


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a instance of the database and get
        // its reference
        mbase
                = FirebaseDatabase.getInstance().getReference();

        recyclerView = findViewById(R.id.recycler1);

        // To display the Recycler view linearly
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));

        // It is a class provide by the FirebaseUI to make a
        // query in the database to fetch appropriate data
//        FirebaseRecyclerOptions<personal> options = new FirebaseRecyclerOptions.Builder<personalHolderAdapter>()
//                .setQuery(mbase, personal.class)
//                .build();
        // Connecting object of required Adapter class to
        // the Adapter class itself
//        adapter = new personalAdapter(options);
        // Connecting Adapter class with the Recycler view*/
//        recyclerView.setAdapter(adapter);
    }

    // Function to tell the app to start getting
    // data from database on starting of the activity

    // Function to tell the app to stop getting
    // data from database on stoping of the activity
    @Override protected void onStop()
    {
        super.onStop();
        adapter.stopListening();
    }

    private class DatabaseReference {
    }

    private static class FirebaseDatabase {
        public static AtomicMarkableReference<Object> getInstance() {
            return null;
        }
    }

    private class FirebaseRecyclerOptions<T> {
        public class Builder<T> {

        }
    }
}