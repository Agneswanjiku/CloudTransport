package firebase;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.moringaschool.mycloudtransports.R;
import com.moringaschool.mycloudtransports.RecyclerViews.Transports;

import org.json.JSONException;
import org.json.JSONObject;

import ui.Transport;
import ui.TransportsViewHolder;

public class transportfirebase {
    private static final String TAG = "MainActivity";
    private int seatId;
    private DatabaseReference mDatabase;
    private FirebaseRecyclerAdapter adapter;
private  RecyclerView recyclerView;

    protected void onCreate(Bundle savedInstanceState) {
        onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("transports");
        recyclerView.setLayoutManager(transports LinearLayoutManager(this));
        recyclerView.hasFixedSize();
        createTransport("hgh", "title","body");
        createTransport("jgjhg", "title", "body");
        createTransport("3fffj", "title", "body");
        createTransport("4kjlk", "title", "body");
        createTransport("5nnm", "title", "body");
        fetch();
    }

    private Object LinearLayoutManager(transportfirebase transportfirebase) {
        return null;
    }

    private void setContentView(int activity_main) {

    }

    private RecyclerView findViewById(int recyclerview) {
    }

    private void createTransport(String userId, String title, String body) {
        Transport transport = new Transport( seatId, title, body);
        mDatabase.child(userId).setValue(transport);
    }

    protected void onStart() {
        onStart();

    }

    public void fetch() {
        Log.i(TAG, "fetch: ");
        FirebaseRecyclerOptions.Builder<transports> transportsBuilder = new FirebaseRecyclerOptions.Builder<transports>();
//        FirebaseRecyclerOptions.Builder<transports> transportsBuilder1 = transportsBuilder.setQuery(Transports.class, mDatabase);
        FirebaseRecyclerOptions<transports> options = transportsBuilder.build();
        final FirebaseRecyclerAdapter<Transport, NewsViewHolder> firabaseAdapter= new FirebaseRecyclerAdapter<Transports, TransportsViewHolder>(options) {
            class model {
            }

            @Override
            protected void onBindViewHolder(@NonNull TransportsViewHolder holder, int position, @NonNull Transports model) {

            }


            @NonNull
            @Override
            public TransportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
                return new TransportsViewHolder(view);
            }


            protected void onBindViewHolder(@NonNull NewsViewHolder holder, int position, @NonNull model model, int transportsTitle, int transportsBody, String transportsId) {
                Log.i(TAG, "onBindViewHolder: ");
                final String newsId = getRef(position).getKey();
                mDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.hasChildren()) {
                            String data = snapshot.getValue().toString();
                            Log.i(TAG, "onDataChange: " + data);
                            try {
                                JSONObject newsJSONObject = new JSONObject(data);
                                String newsTitle = newsJSONObject.getJSONObject(transportsId).getString("se");
                                String newsBody = newsJSONObject.getJSONObject(transportsId).getString("body");
                                holder.textView2.setText(transportsTitle);
                                holder.textView.setText(transportsBody);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Log.e(TAG, "onCancelled: ", error.toException());
                    }
                });
            }
        };
        recyclerView.setAdapter(firabaseAdapter);
        firabaseAdapter.startListening();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public TextView textView2;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
        }
        public void setTextView(String string) {
            textView.setText(string);
        }
        public void setTextView2(String string) {
            textView2.setText(string);
        }
    }

    private class transports {
    }
}
