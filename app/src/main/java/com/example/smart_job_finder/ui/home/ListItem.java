package com.example.smart_job_finder.ui.home;

public class ListItem {
    private int imageResource;
    private String title;

    private String location;
    private String description;
    private int likeImgResource;

    public ListItem(int imageResource, String title, String description, String location, int likeImgResource) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.location = location;
        this.likeImgResource = likeImgResource;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getLikeImgResource() {
        return likeImgResource;
    }

    public String getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setLikeImgResource(int likeImgResource) {
        this.likeImgResource = likeImgResource;
    }
}
