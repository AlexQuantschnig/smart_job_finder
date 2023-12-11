package com.example.smart_job_finder.ui.detail;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smart_job_finder.Job;
import com.example.smart_job_finder.R;
import com.example.smart_job_finder.ui.send.SendActivity;
import com.example.smart_job_finder.ui.send.SendDialog;

import java.util.Objects;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Job job = (Job) getIntent().getSerializableExtra("job");


        ImageView detailsImage = findViewById(R.id.detailsImg);
        TextView positionHeadline = findViewById(R.id.positionHeadlineTextView);
        TextView positionText = findViewById(R.id.positionTextView);
        TextView locationHeadlineText = findViewById(R.id.locationTextView);
        TextView locationText = findViewById(R.id.locationTextView);
        TextView descriptionHeadline = findViewById(R.id.descriptionHeadlineTextView);
        TextView descriptionText = findViewById(R.id.descriptionTextView);
        TextView contactHeadlineText = findViewById(R.id.contactHeadlineTextView);
        TextView contactText = findViewById(R.id.contactTextView);
        Button applyButton = findViewById(R.id.applyButton);

        detailsImage.setImageResource(job.getImageResource());
        positionText.setText(job.getTitle());
        locationText.setText(job.getLocation());
        descriptionText.setText(job.getDescription());
        contactText.setText(job.getEmail());


        applyButton.setOnClickListener(v -> {
            Intent intent = new Intent(DetailsActivity.this, SendActivity.class);
            intent.putExtra("job", job);
            startActivity(intent);
        });

    }
}
