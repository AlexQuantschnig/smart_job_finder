package com.example.smart_job_finder;

import androidx.annotation.NonNull;

public class Job {

    private final int imageResource;
    private final String title;
    private final String location;
    private final String description;
    private int likeImgResource;
    private boolean isLiked;

    public Job(int imageResource, String title, String description, String location, int likeImgResource) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.location = location;
        this.likeImgResource = likeImgResource;
        this.isLiked = false;
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

    public void setLikeImgResource(int likeImgResource) {
        this.likeImgResource = likeImgResource;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }


    @NonNull
    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", isLiked=" + isLiked +
                '}';
    }
}
