package com.example.smart_job_finder.ui.details;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import com.example.smart_job_finder.R;

public class SentDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Are you sure you want to send your application?")
                .setPositiveButton("sent", (dialog, id) -> {
                   //Todo: send the application
                })
                .setNegativeButton("cancel", (dialog, id) -> {
                    //Todo: cancel the application
                });

        return builder.create();
    }
}