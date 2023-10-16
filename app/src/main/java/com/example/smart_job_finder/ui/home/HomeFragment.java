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

    static {

        itemList.add(new ListItem(R.drawable.amazon, "Amazon Backend Dev", "An Amazon backend developer is responsible for designing, developing, and maintaining the server-side systems and infrastructure that power Amazon's various services and applications. This role typically involves working with large-scale distributed systems, databases, and cloud technologies to ensure the reliability, scalability, and performance of Amazon's backend services. Amazon backend developers collaborate with cross-functional teams to create innovative solutions that enhance the customer experience and drive the success of Amazon's e-commerce, cloud computing, and other products and services. This role requires expertise in programming languages, such as Java, Python, or C++, and a deep understanding of backend technologies and best practices.", "15-10-2023",R.drawable.ic_heart));
        itemList.add(new ListItem(R.drawable.google_logo, "Data Science", "A Google data scientist is a professional who leverages data to extract insights, patterns, and meaningful information, contributing to data-driven decision-making at Google. They utilize statistical analysis, machine learning, and data mining techniques to analyze large datasets and solve complex problems. Google data scientists work on a variety of projects across the company, including improving search algorithms, enhancing advertising targeting, and optimizing user experiences. They also collaborate with cross-functional teams to develop data-driven solutions that enhance Google's products and services. This role demands strong analytical and programming skills, proficiency in data manipulation and visualization tools, and a deep understanding of statistical concepts and machine learning algorithms. ", "01-01-2023",R.drawable.ic_heart));
        itemList.add(new ListItem(R.drawable.microsoft, "Fullstack Dev .NET", "A Fullstack .NET Developer is a critical member of our software development team responsible for designing, developing, and maintaining end-to-end web applications and software solutions using Microsoft's .NET framework. As a Fullstack .NET Developer, you will work on both frontend and backend aspects of our projects to create high-quality, scalable, and user-friendly applications", "05-07-2023",R.drawable.ic_heart));
        itemList.add(new ListItem(R.drawable.facebook, "React Frontend Dev","A React Frontend Developer is responsible for creating responsive, visually appealing user interfaces using the React library. They collaborate with designers, integrate APIs, and ensure cross-browser compatibility and performance optimization. ", "12-05-2023",R.drawable.ic_heart));
        itemList.add(new ListItem(R.drawable.apple, "Swift Frontend Dev ", "An Apple Swift Developer is responsible for building software applications and solutions for Apple's platforms (iOS, macOS, watchOS, and tvOS) using the Swift programming language. They design and implement user-friendly, high-performance applications, ensuring a seamless user experience across Apple devices. ", "09-08-2023",R.drawable.ic_heart));
        itemList.add(new ListItem(R.drawable.linkedin, "Marketing and Management", "A LinkedIn Marketing and Management Specialist is responsible for optimizing LinkedIn profiles, developing content strategies, engaging with professional networks, managing advertising campaigns, and monitoring analytics to enhance brand visibility and professional networking. ", "10-10-2023",R.drawable.ic_heart));
        itemList.add(new ListItem(R.drawable.netflix, "Project Manager", "A Netflix Project Manager is responsible for overseeing and managing various projects within the company, ensuring they are completed on time and within budget. They coordinate cross-functional teams, set project goals, and deliver high-quality content or technical solutions for the streaming platform. ", "18-09-2023",R.drawable.ic_heart));
        itemList.add(new ListItem(R.drawable.x_logo, "Customer Service", "A Twitter Customer Service Representative is responsible for providing assistance and support to Twitter users, addressing their inquiries, issues, and concerns. They engage with users through various communication channels to ensure a positive experience, resolve problems, and uphold the platform's policies and standards. ", "20-11-2023",R.drawable.ic_heart));
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