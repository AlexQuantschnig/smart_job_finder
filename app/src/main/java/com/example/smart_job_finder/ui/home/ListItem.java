package com.example.smart_job_finder.ui.home;

public class ListItem {
    private int imageResource;
    private String title;
    private String description;
    private String date;

    private int likeImgResource;

    public ListItem(int imageResource, String title, String description, String date, int likeImgResource) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.date = date;
        this.likeImgResource = likeImgResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getLikeImgResource() {
        return likeImgResource;
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
