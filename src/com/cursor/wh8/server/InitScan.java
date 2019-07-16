package com.cursor.wh8.server;

import java.util.Scanner;
/**
 * Created by Vasyl Kachala on 14.07.2019.
 */
public class InitScan {
    private static java.lang.Object Object;
    /**
     * Create method myScan add words, add number
     */
    public static void myScan() {
        System.out.println("Checked Palindrome\nEnter a Word:");
        Scanner scanWords = new Scanner(System.in);
        String words = scanWords.nextLine();
        System.out.println("Checked  number \nEnter a Number:");
        Scanner scanNumber = new Scanner(System.in);
        int number = scanNumber.nextInt();
        ServerException serverException = new ServerException();
        serverException.checkThereIsPalindrome(words);
        serverException.checkPairNumber(number);
        serverException.checkObjectNull(Object);
    }
}
