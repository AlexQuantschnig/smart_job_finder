package com.example.smart_job_finder.ui.home;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.smart_job_finder.R;
import java.util.List;


public class JobListAdapter extends RecyclerView.Adapter<JobListAdapter.ViewHolder> {
    private List<ListItem> itemList;
    private Context context;

    public JobListAdapter(Context context, List<ListItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false); // Replace with your item layout name
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListItem item = itemList.get(position);
        holder.jobImg.setImageResource(item.getImageResource());
        holder.likeImg.setImageResource(item.getLikeImgResource());
        holder.jobTitle.setText(item.getTitle());
        holder.jobDes.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView jobImg, likeImg;
        TextView jobTitle, jobDes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobImg = itemView.findViewById(R.id.jobImg);
            likeImg = itemView.findViewById(R.id.likeIcon);
            jobTitle = itemView.findViewById(R.id.jobTitel);
            jobDes = itemView.findViewById(R.id.jobDes);

        }
    }
}
