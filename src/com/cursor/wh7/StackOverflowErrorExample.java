package com.cursor.wh7;

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
