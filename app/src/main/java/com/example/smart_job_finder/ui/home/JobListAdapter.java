package com.example.smart_job_finder.ui.home;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.smart_job_finder.R;
import com.example.smart_job_finder.ui.dashboard.DashboardFragment;

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
                .inflate(R.layout.recycler_view_item, parent, false);



        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListItem item = itemList.get(position);
        holder.jobImg.setImageResource(item.getImageResource());
        holder.likeImg.setImageResource(item.getLikeImgResource());
        holder.jobTitle.setText(item.getTitle());
        holder.jobLocation.setText(item.getLocation());
        holder.jobDes.setText(item.getDescription());

        holder.likeImg.setOnClickListener(v -> {
            Log.println(Log.INFO, "Like", "Like");
            if (item.getLikeImgResource() == R.drawable.ic_heart) {
                item.setLikeImgResource(R.drawable.ic_heart_filled_foreground);
                holder.likeImg.setImageResource(R.drawable.ic_heart_filled_foreground);
            }else{
                item.setLikeImgResource(R.drawable.ic_heart);
                holder.likeImg.setImageResource(R.drawable.ic_heart);
            }


        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView jobImg;

        ImageButton likeImg;
        TextView jobTitle, jobDes, jobLocation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobImg = itemView.findViewById(R.id.jobImg);
            likeImg = itemView.findViewById(R.id.likeIcon);
            jobTitle = itemView.findViewById(R.id.jobTitel);
            jobLocation = itemView.findViewById(R.id.jobLocation);
            jobDes = itemView.findViewById(R.id.jobDes);


        }
    }
}
