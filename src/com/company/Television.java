package com.company;

public class Television extends ServiceCommunicator {
   //constructor
    public Television(String tvShowName){
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);

    }
    public static void main(String[] argv) {
        System.out.println(new Television("Girlfriends").get());
        System.out.println(new Television("Manifest").get());
        System.out.println(new Television("NCIS").get());
    }
}

