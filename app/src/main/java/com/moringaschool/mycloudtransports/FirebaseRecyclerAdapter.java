package com.moringaschool.mycloudtransports;

import androidx.annotation.NonNull;

import com.moringaschool.mycloudtransports.RecyclerViews.personal;

public abstract class FirebaseRecyclerAdapter<T, T1> {
    public FirebaseRecyclerAdapter(personalAdapter.FirebaseRecyclerOptions<personal> requireNonNull) {
    }

    // Function to bind the view in Card view(here
    // "person.xml") iwth data in
    // model class(here "person.class")
    protected abstract void
    onBindViewHolder(@NonNull personalAdapter.personsViewholder holder,
                     int position, @NonNull personal model);
}
