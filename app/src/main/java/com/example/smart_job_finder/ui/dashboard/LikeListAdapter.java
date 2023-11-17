package com.example.smart_job_finder.ui.dashboard;
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
import com.example.smart_job_finder.ui.home.ListItem;

import java.util.List;

public class LikeListAdapter extends RecyclerView.Adapter<LikeListAdapter.ViewHolderLikes>{
    private List<ListItem> likeList;
    private Context context;

    public LikeListAdapter(Context context, List<ListItem> likeList) {
        this.context = context;
        this.likeList = likeList;
    }

    @NonNull
    @Override
    public ViewHolderLikes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolderLikes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLikes holder, int position) {
        ListItem item = likeList.get(position);
        holder.jobImg.setImageResource(item.getImageResource());
        holder.likeImg.setImageResource(item.getLikeImgResource());
        holder.jobTitle.setText(item.getTitle());
        holder.jobLocation.setText(item.getLocation());
        holder.jobDes.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return likeList.size();
    }

    public class ViewHolderLikes extends RecyclerView.ViewHolder {
        ImageView jobImg;

        ImageButton likeImg;
        TextView jobTitle, jobDes, jobLocation;

        public ViewHolderLikes(@NonNull View itemView) {
            super(itemView);
            jobImg = itemView.findViewById(R.id.jobImg);
            likeImg = itemView.findViewById(R.id.likeIcon);
            jobTitle = itemView.findViewById(R.id.jobTitel);
            jobLocation = itemView.findViewById(R.id.jobLocation);
            jobDes = itemView.findViewById(R.id.jobDes);
        }
    }
}
