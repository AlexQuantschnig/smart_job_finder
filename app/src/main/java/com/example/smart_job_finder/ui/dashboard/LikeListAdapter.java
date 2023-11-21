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
import com.example.smart_job_finder.JobList;
import com.example.smart_job_finder.R;
import com.example.smart_job_finder.Job;
import java.util.List;

public class LikeListAdapter extends RecyclerView.Adapter<LikeListAdapter.ViewHolderLikes>{
    private final List<Job> jobs;


    public LikeListAdapter(Context context, List<Job> likeList ) {
        this.jobs = likeList;

    }

    @NonNull
    @Override
    public ViewHolderLikes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.job_item, parent, false);
        return new ViewHolderLikes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLikes holder, int position) {
        Job job = jobs.get(position);
        holder.jobImg.setImageResource(job.getImageResource());
        holder.likeImg.setImageResource(job.getLikeImgResource());
        holder.jobTitle.setText(job.getTitle());
        holder.jobLocation.setText(job.getLocation());

        holder.likeImg.setOnClickListener(v -> {
            if (job.getLikeImgResource() == R.drawable.ic_heart) {
                job.setLikeImgResource(R.drawable.ic_heart_filled_foreground);
                holder.likeImg.setImageResource(R.drawable.ic_heart_filled_foreground);
                job.setLiked(true);
                JobList.setJobList(jobs);


            } else {
                job.setLikeImgResource(R.drawable.ic_heart);
                holder.likeImg.setImageResource(R.drawable.ic_heart);
                job.setLiked(false);
                Log.d("JobList", jobs.toString());
                jobs.remove(position);
                Log.d("JobList",  jobs.toString());
                notifyItemChanged(holder.getAdapterPosition());
                notifyItemRangeChanged(position+1, jobs.size());

            }
        });

    }
    @Override
    public int getItemCount() {
        return jobs.size();
    }

    public static class ViewHolderLikes extends RecyclerView.ViewHolder {
        ImageView jobImg;

        ImageButton likeImg;
        TextView jobTitle, jobLocation;

        public ViewHolderLikes(@NonNull View itemView) {
            super(itemView);
            jobImg = itemView.findViewById(R.id.jobImg);
            likeImg = itemView.findViewById(R.id.likeIcon);
            jobTitle = itemView.findViewById(R.id.jobTitel);
            jobLocation = itemView.findViewById(R.id.jobLocation);
        }
    }
}
