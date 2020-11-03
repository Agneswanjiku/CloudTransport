package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.mycloudtransports.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class TransportListAdapter extends RecyclerView.Adapter<TransportListAdapter.TransportViewHolder> {
private List<TransportViewHolder.Transport> mVehicles;
private Context mContext;

public TransportListAdapter(Context context, List<TransportViewHolder.Transport> trains) {
        mContext = context;
    List<TransportViewHolder.Transport> mTrains = trains;
        }

@Override
public TransportListAdapter.TransportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transport_list_item, parent, false);
        TransportViewHolder viewHolder = new TransportViewHolder(view);
        return viewHolder;
        }


    @Override
    public int getItemCount() {
        return 0;
    }


    public static class TransportViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.TrainImageView)
    ImageView mTransportImageView;
    @BindView(R.id.NameTextView)
    TextView mNameTextView;
    @BindView(R.id.categoryTextView) TextView mCategoryTextView;
    @BindView(R.id.ratingTextView) TextView mRatingTextView;
    private Context mContext;

    public TransportViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mContext = itemView.getContext();
    }


    public void bindTransport(Transport Train) {
        mNameTextView.setText(Train.getName());
//        mCategoryTextView.setText(Train.getCategories().get(0).getTitle());
        mRatingTextView.setText("Rating: " + Train.getRating() + "/5");
    }

        public Transport get(TransportViewHolder transportViewHolder) {
            return null;
        }

        public class Transport {
        public int getName() {
            return Integer.parseInt(null);
        }

        public ThreadLocal getCategories() {
            return  null;
        }

        public String getRating() {
            return null;
        }
    }
}
}
