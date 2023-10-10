package com.example.smart_job_finder.ui.home;

public class ListItem {
    private int imageResource;
    private String title;
    private String description;
    private String date;

    public ListItem(int imageResource, String title, String description, String date) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}
