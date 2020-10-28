package Adapters;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.mycloudtransports.R;

import java.text.BreakIterator;
import java.util.List;

public class MyTransportAdapter extends RecyclerView.Adapter<MyTransportAdapter.ViewHolder> {

    private List<LauncherActivity.ListItem> ListItems;
    private Context context;



    public MyTransportAdapter(Context context ) {
        this.context = context;
        this.ListItems = ListItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new  ViewHolder (v);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        ListItems ListItems = ListItems.get(position);

        holder.textviewHead.setText(listItem.getHead());
//        holder.textViewDesc.setText(listItem.getDesc());


    }


    @Override
    public int getItemCount() {
        return  ListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textviewHead;
        public  TextView textViewDescription;
        public BreakIterator textViewDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            textviewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDescription = (TextView) itemView.findViewById(R.id.textViewDescription);
        }
    }
}
