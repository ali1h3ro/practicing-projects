package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
        private static ArrayList<Album> albums = new ArrayList();
    public static void main(String[] args) {

               Album album = new Album("ali","PEPE");
        album.addSong("sasa",2.3);
        album.addSong("dawd",1.1);
        album.addSong("khj",3.3);
        album.addSong("zxc",4.5);
        album.addSong("bvc",6.10);
                albums.add(album);
        album = new Album("mohamed","tete");
        album.addSong("123",5.1);
        album.addSong("321",0.9);
        album.addSong("231",6.7);
        album.addSong("312",9.1);
        album.addSong("213",4.3);
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("khj",playList);
        albums.get(0).addToPlayList("zxc",playList);
        albums.get(0).addToPlayList(9,playList);

        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList("213",playList);

         play(playList);



    }



    public static void play (LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size()==0){
                System.out.println("Empty");
            }

            else {
            System.out.println("Now playing  " + listIterator.next().toString());

            }


    }




















}
