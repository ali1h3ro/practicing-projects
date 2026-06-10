package com.company;

public class Video {
    private String videoName;
    private double videoDuration;


    public Video(String videoName, double videoDuration) {
        this.videoName = videoName;
        this.videoDuration = videoDuration;
    }



    public String getVideoName() {
        return videoName;
    }

    public double getVideoDuration() {
        return videoDuration;
    }

    @Override
    public String toString() {
        return this.videoName + " " + this.videoDuration;
    }
}
