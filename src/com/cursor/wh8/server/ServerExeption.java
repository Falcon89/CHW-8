package com.cursor.wh8.server;

import java.util.Scanner;

public class ServerExeption {
    private static final int NUMBER = 100;
//
        public static void myScan(){
            System.out.println("Checked Palindrome\nEnter a Word or Numbers:");
            Scanner sc = new Scanner(System.in);
            sc.close();
    }

    public static String myClassExaption(Scanner sc){
        String words = sc.nextLine();
        StringBuilder sb = new StringBuilder((words));
        String reversedWord = new String(sb.reverse());
            if (words.equals(reversedWord.toLowerCase())) {
                System.out.println("The word is Palindrome");
            }
            return sc.nextLine();

//            else {
//                Exception e;
//                System.out.println("error Exception");
//            }


//        else if (NUMBER % 2 != 0) {
//            Exception e;
//            System.out.println("Error number%2");
//        } else if (NUMBER > 100) {
//            Exception e;
//            System.out.println("Error>100");
//        } else if (ob == null) {
//            Exception e;
//            System.out.println("Obj null");
//        }
//        }
//        catch ()
    }

    public static int myClassExaption2(Scanner nn){
        int words = nn.nextInt();
        if (words % 2 != 0) {
            System.out.println("good");
        }
        else {
            System.out.println("error");
        }
        return nn.nextInt();

//        else if (NUMBER > 100) {
//            Exception e;
//            System.out.println("Error>100");
//        } else if (ob == null) {
//            Exception e;
//            System.out.println("Obj null");
//        }
//        }
//        catch ()
    }
}
