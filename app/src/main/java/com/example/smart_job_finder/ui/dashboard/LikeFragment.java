package com.example.smart_job_finder.ui.dashboard;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.smart_job_finder.R;
import com.example.smart_job_finder.databinding.FragmentDashboardBinding;
import com.example.smart_job_finder.ui.home.ListItem;

import java.util.ArrayList;
import java.util.List;

public class LikeFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private RecyclerView recyclerView;
    private LikeListAdapter adapter;
    private static List<ListItem> likeList = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = root.findViewById(R.id.likeList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new LikeListAdapter(getActivity(), likeList);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void addToLikedItemList(ListItem item) {
        likeList.add(item);
        adapter.notifyDataSetChanged();
    }
}