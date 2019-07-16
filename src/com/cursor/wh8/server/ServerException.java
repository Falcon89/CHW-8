package com.cursor.wh8.server;

/**
 * Created by Vasyl Kachala on 15.07.2019.
 */
public class ServerException {
    private static final int NUMBER = 100;

    /**
     * Create method checkThereIsPalindrome
     *
     * @param words
     * @return
     * @throws Exception
     */
    public String checkThereIsPalindrome(String words) {
        StringBuilder sb = new StringBuilder((words));
        String reversedWord = new String(sb.reverse());

        if (words.equals(reversedWord.toLowerCase())) {
            System.out.println("Word is Palindrome");
        } else {
            try {
                throw new Exception("Exception Palindrome");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return words;
    }

    /**
     * Create method checkPairNumber
     *
     * @param number
     * @return
     * @throws Exception
     */
    public int checkPairNumber(int number) {
        if (number % 2 != 0) {
            try {
                throw new Exception("Exception num");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (number > NUMBER) {
            try {
                throw new Exception("Exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Exception");
        } else
            System.out.println("The number " + number + " less than 100");
        return number;
    }

    /**
     * Create method checkObjectNull
     *
     * @param o
     * @return
     * @throws Exception
     */
    public void checkObjectNull(Object o) {
        if (o == null) {
            try {
                throw new Exception("Exception o");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Object in not null");
        }
        return;
    }
}
