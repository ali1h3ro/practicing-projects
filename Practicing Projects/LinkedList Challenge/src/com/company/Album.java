package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;

    private String artist;

    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }




         public boolean addSong(String name, double duration){
           if (findSong(name)==null) {
               songs.add(new Song(name, duration));
               return true;
           }
           return false;
          }

    public Song findSong(String title){
//element "index is implicit" of    Array
        for (Song checkedSong : this.songs){

            if (checkedSong.getTitle().equals(title)){

                return checkedSong;
            }

        }
   return null;

    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song>playList){
        int index = trackNumber-1;
        if ((index >=0) && (index<=this.songs.size())){
            playList.add(this.songs.get(index));

            return true;
        }
        else
        System.out.println("this album doesn't have this track number : "+ trackNumber);
            return false;
          }



    public boolean addToPlayList(String title, LinkedList<Song>playList){

        Song CheckedSong = findSong(title);

       if (CheckedSong!=null){

           playList.add(CheckedSong);
                 return true;
        }
       else

        System.out.println("this album doesn't have this title : "+ title);

        return false;
    }
          }
