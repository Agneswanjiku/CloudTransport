package com.moringaschool.mycloudtransports;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.mycloudtransports.RecyclerViews.personal;
import com.moringaschool.mycloudtransports.personalHolderAdapter.personalViewholder;

import java.util.Objects;

public class personalAdapter extends FirebaseRecyclerAdapter<
        personal, personalViewholder> implements personalHolderAdapter {
    public personalAdapter(
            @NonNull FirebaseRecyclerOptions<personal> options)
    {
        super(Objects.<FirebaseRecyclerOptions<personal>>requireNonNull(options));
    }

    // Function to bind the view in Card view(here
    // "person.xml") iwth data in
    // model class(here "person.class")
    @Override
    protected void
    onBindViewHolder(@NonNull personsViewholder holder,
                     int position, @NonNull personal model)
    {

        // Add firstname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.firstname.setText(model.getFirstname());

        // Add lastname from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.lastname.setText(model.getLastname());

        // Add age from model class (here
        // "person.class")to appropriate view in Card
        // view (here "person.xml")
        holder.age.setText(model.getAge());
    }

    // Function to tell the class about the Card view (here
    // "person.xml")in
    // which the data will be shown
    @NonNull
    @Override
    public personsViewholder
    onCreateViewHolder(@NonNull ViewGroup parent,
                       int viewType)
    {
        View view
                = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.personal, parent, false);
        return new personalAdapter.personsViewholder(view);
    }

    @Override
    public void stopListening() {
    }

    // Sub Class to create references of the views in Crad
    // view (here "person.xml")
    class personsViewholder
            extends RecyclerView.ViewHolder {
        TextView firstname, lastname, age;
        public personsViewholder(@NonNull View itemView)
        {
            super(itemView);

            firstname
                    = itemView.findViewById(R.id.firstname);
            lastname = itemView.findViewById(R.id.lastname);
            age = itemView.findViewById(R.id.age);
        }
    }

    public class FirebaseRecyclerOptions<T> {
    }
}
