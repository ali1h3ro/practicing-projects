package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Channel {

   private String channelName;
   private ArrayList <Video> video_list;

           Cloneable


    public Channel(String channelName) {
        this.video_list = new ArrayList<>();
    }

        public   void   addVideo(String name,double duration){
        Video video =    new Video(name,duration);
        if (findVideo(video.getVideoName())==null)
            video_list.add(video);
             }

    public  void   addToPlayList(String videoName, LinkedList play_list){
              Video video = findVideo(videoName);
                     play_list.add(video);

             }

    public  void  deleteVideo(String title){
        Video video =    findVideo(title);
        if (video!=null)
            video_list.remove(video);
    }





    public void deleteVideo(int location){
       int index = location -1;
             video_list.remove(index);
    }




    public  Video findVideo(String title){

           for (Video inListSong : this.video_list){
           if (inListSong.getVideoName().equals(title)){
               return inListSong;
           }

           }

              return null;
    }

}
