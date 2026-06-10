package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Channel {

   private String channelName;
   private VideoList video_list;




    public Channel(String channelName) {
        this.channelName = channelName;

    }

    public  abstract   void   addVideo(String name,double duration);
//    {
//        video_list.addVideo(name,duration);
//    }

    public  abstract void   addToPlayList(String videoName, LinkedList play_list);
//    {
//        video_list.addToPlayList(videoName,play_list);
//    }

    public abstract void deleteVideo(int location);
//    {
//        video_list.deleteVideo(location);
//    }




//..................................................
static class  VideoList extends Channel {
            private ArrayList <Video> video_lisst;

    public VideoList(String channelName) {
        super(channelName);
        this.video_lisst = new ArrayList<>();
    }



    public     void   addVideo(String name, double duration){
        Video video =    new Video(name,duration);
        if (findVideo(video.getVideoName())==null)
            video_lisst.add(video);
    }

    public   void   addToPlayList(String videoName, LinkedList play_list){
        Video video = findVideo(videoName);
        play_list.add(video);

    }





    public void deleteVideo(int location){
        int index = location -1;
        video_lisst.remove(index);
    }




    public  Video findVideo(String title){

        for (Video inListSong : this.video_lisst){
            if (inListSong.getVideoName().equals(title)){
                return inListSong;
            }

        }

        return null;
    }

    }





        }




