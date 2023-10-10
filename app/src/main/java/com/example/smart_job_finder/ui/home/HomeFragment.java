package com.example.smart_job_finder.ui.home;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smart_job_finder.R;
import com.example.smart_job_finder.databinding.FragmentHomeBinding;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private RecyclerView recyclerView;
    private JobListAdapter adapter;
    private static List<ListItem> itemList = new ArrayList<>();

    static{
        for (int i = 0; i < 15; i++) {
            itemList.add(new ListItem(R.drawable.ic_launcher_foreground, "Title "+i, "Description "+i, "Date "+i));
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = root.findViewById(R.id.jobList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new JobListAdapter(getActivity(), itemList);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}