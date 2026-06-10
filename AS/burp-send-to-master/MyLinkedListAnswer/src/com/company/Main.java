package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Channel> channels = new ArrayList<>();
    private static LinkedList<Video> play_list = new LinkedList<>();


    public static void main(String[] args) {


        Channel channel0 = new Channel("mohammed_gaming");
        channel0.addVideo("Road to global elite cs:go", 7.3);
        channel0.addVideo("Vlog in japan", 5.2);
        channel0.addVideo("Playing dark souls 3", 10);
        channels.add(channel0);
        channel0 = new Channel("Oussama_Hacker");
        channel0.addVideo("How to exploit sql", 3.2);
        channel0.addVideo("Uploading your shell", 6.2);
        channel0.addVideo("Kali Linux tools", 1.5);
        channels.add(channel0);

        channels.get(0).addToPlayList("Road to global elite cs:go", play_list);
        channels.get(0).addToPlayList("Vlog in japan", play_list);
        channels.get(0).addToPlayList("Playing dark souls 3", play_list);
        channels.get(1).addToPlayList("How to exploit sql", play_list);
        channels.get(1).addToPlayList("Uploading your shell", play_list);
        channels.get(1).addToPlayList("Kali Linux tools", play_list);

        play(play_list);
    }

    public static void play(LinkedList<Video> list) {

        ListIterator<Video> iterator = list.listIterator();
        boolean forward = true;
        boolean quite = false;
        int action = 0;
        while (!quite) {
            action = scanner.nextInt();
            switch (action) {

                case 0:
                    System.out.println("Playlist complete.");
                    quite = true;
                    break;

                case 1:
                    if (!forward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }

                    break;
                case 2:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if (iterator.hasPrevious()) {

                        System.out.println(iterator.previous().toString());

                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }


                    break;
            }

        }

    }

}