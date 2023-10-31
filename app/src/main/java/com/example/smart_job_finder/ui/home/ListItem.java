package com.example.smart_job_finder.ui.home;

public class ListItem {
    private int imageResource;
    private String title;
    private String description;
    private int likeImgResource;

    public ListItem(int imageResource, String title, String description, int likeImgResource) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
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

}
