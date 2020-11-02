package com.moringaschool.mycloudtransports;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

public interface personalHolderAdapter {
    // Function to tell the class about the Card view (here
    // "person.xml")in
    // which the data will be shown
    @NonNull
    personalAdapter.personsViewholder
    onCreateViewHolder(@NonNull ViewGroup parent,
                       int viewType);

    void stopListening();

    public interface personalViewholder {
    }
}
