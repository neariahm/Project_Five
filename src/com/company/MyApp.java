package com.company;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] argv) {

        java.util.Scanner userinput;
        java.util.Scanner userinput2;

        while (true) {
            System.out.println("What request would you like to search: Zipcode, Television or Music?");
            System.out.print("Command> ");
            userinput = new java.util.Scanner(System.in);
            String cmd = userinput.next();


            if (cmd.equals("Zipcode")) {
                System.out.println("You selected " + cmd + ".");
                System.out.println("Enter " + cmd + ":");
                userinput2 = new java.util.Scanner(System.in);
                String cmd2 = userinput.next();
                System.out.println(new Zipcode(cmd2).get());
            } else if (cmd.equals("Television") || cmd.equals("TV")) {
                System.out.println("You selected " + cmd + ".");
                System.out.println("Enter " + cmd + ":");
                userinput2 = new java.util.Scanner(System.in);
                String cmd2 = userinput.next();
                System.out.println(new Television(cmd2).get());
            } else if (cmd.equals("Music")) {
                System.out.println("You selected " + cmd + ".");
                System.out.println("Enter " + cmd + ":");
                userinput2 = new java.util.Scanner(System.in);
                String cmd2 = userinput.next();
                System.out.println(new Music(cmd2).get());
            } else {
                System.out.println("This is not a valid response. Please try again.");
            }
        }

    }

    public static String getRequest(String request) {
        System.out.println("What request would you like to search: Zipcode, com.company.Television or com.company.Music?");
        System.out.println("Command>");
        Scanner input = new Scanner(System.in);
        request = input.next();
        System.out.println("You requested " + request);
        return request;
    }
}

//        public static boolean validateRequest(String request) {
//            if (request.equalsIgnoreCase("zipcode")) {
//                return true;
//            } else if (request.equalsIgnoreCase("Televison")) {
//                return true;
//            } else if (request.equalsIgnoreCase("Music")) {
//                return true;
//            }
//            return false;
//        }
//            public static void doRequest (String request) {
//            if (request.equalsIgnoreCase("Zipcode")) {
//                System.out.println("Enter Zipcode: ");
//                Scanner scan = new Scanner(System.in);
//                String input = scan.next();
//
//            } else if((request.equalsIgnoreCase("Television"))){
//                System.out.println("Enter Television Show: ");
//                Scanner scan = new Scanner(System.in);
//                String input = scan.next();
//
//            } else if((request.equalsIgnoreCase("Music"))){
//                System.out.println("Enter Musical Artist: ");
//                Scanner scan = new Scanner(System.in);
//                String input = scan.next();
//
//            }
//            else {
//                System.out.println("This is not a valid response. Please try again.");
//            }
//
//        }
//    }







