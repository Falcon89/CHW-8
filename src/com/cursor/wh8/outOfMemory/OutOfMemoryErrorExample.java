package com.cursor.wh8.outOfMemory;

public class OutOfMemoryErrorExample {
//    public static void outOfMemoryError(){
        public static void main(String[] args){
            long[] outMemory = new long[Integer.MAX_VALUE];
            System.out.println(outMemory);
//        }
    }

}
