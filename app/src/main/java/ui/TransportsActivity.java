//package ui;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.moringaschool.mycloudtransports.R;
//
//import java.util.List;
//
//import Adapters.TransportListAdapter;
//import butterknife.BindView;
//import butterknife.ButterKnife;
//import retrofit2.Call;
//import retrofit2.Response;
//
//public class TransportsActivity extends AppCompatActivity {
//
//    @BindView(R.id.recyclerView)
//    RecyclerView mRecyclerView;
//    @BindView(R.id.errorTextView)
//    TextView mErrorTextView;
//    @BindView(R.id.progressBar)
//    ProgressBar mProgressBar;
//
//    private TransportListAdapter mAdapter;
//
//    public List<TransportListAdapter.TransportViewHolder.Transport> trains;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_transport);
//        ButterKnife.bind(this);
//
//        Intent intent = getIntent();
//        String location = intent.getStringExtra("location");
//
//        TransportApi client = TransportClient.getClient();
//
//        Call<TransportBusinessesSearchResponse> call = client.getTransports(location, "trains");
//
//        call.enqueue(new Callback<TransportListAdapter.TransportViewHolder.TransportBusinessesSearchResponse>() {
//            class TransportBusinessesSearchResponse {
//            }
//
//
//
//            @Override
//            public void onResponse() {
//                onResponse(onResponse(onResponse();) ;
//            }
//
//            @Override
//            public void onResponse(Call<TransportBusinessesSearchResponse> call, Response<TransportBusinessesSearchResponse> response) {
//                hideProgressBar();
//
//                if (response.isSuccessful()) {
//                    trains = response.body().getTransports();
//                    mAdapter = new TransportListAdapter(TransportsActivity.this, trains) {
//                        @Override
//                        public void onBindViewHolder(@NonNull TransportViewHolder holder, int position) {
//
//                        }
//                    };
//                    mRecyclerView.setAdapter(mAdapter);
//                    RecyclerView.LayoutManager layoutManager =
//                            new LinearLayoutManager(TransportsActivity.this);
//                    mRecyclerView.setLayoutManager(layoutManager);
//                    mRecyclerView.setHasFixedSize(true);
//
//                    showRestaurants();
//                } else {
//                    showUnsuccessfulMessage();
//                }
//            }
//
//            @Override
//            public void onFailure() {
//                onFailure(, );
//            }
//
//            @Override
//            public void onFailure(Call<TransportBusinessesSearchResponse> call, Throwable t) {
//                hideProgressBar();
//                showFailureMessage();
//            }
//
//        });
//    }
//
//    private void showFailureMessage() {
//        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
//        mErrorTextView.setVisibility(View.VISIBLE);
//    }
//
//    private void showUnsuccessfulMessage() {
//        mErrorTextView.setText("Something went wrong. Please try again later");
//        mErrorTextView.setVisibility(View.VISIBLE);
//    }
//
//    private void showRestaurants() {
//        mRecyclerView.setVisibility(View.VISIBLE);
//    }
//
//    private void hideProgressBar() {
//        mProgressBar.setVisibility(View.GONE);
//    }
//
//    class TransportBusinessesSearchResponse {
//    }
//}
