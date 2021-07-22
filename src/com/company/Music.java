package com.company;

public class Music extends ServiceCommunicator {
    public Music (String artistName){
        super("https://itunes.apple.com/search?term=" + artistName + "&limit=1");
    }
    public static void main(String[] argv) {
        System.out.println(new Music("Megan-Thee-Stallion").get());
        System.out.println(new Music("Aretha-Franklin").get());
        System.out.println(new Music("Drake").get());
    }
}
