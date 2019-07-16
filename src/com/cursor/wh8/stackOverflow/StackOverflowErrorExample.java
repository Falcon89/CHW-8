package com.cursor.wh8.stackOverflow;
/**
 * Created by Vasyl Kachala on 14.07.2019.
 */
public  class StackOverflowErrorExample {
    public static class StackOError {
        StackOError stack = new StackOError();
        public static void main(String[] args) {
            System.out.println("Test StackOverflowError1");
            StackOError stack2 = new StackOError();
            System.out.println("Test StackOverflowError1");
        }
    }
}
