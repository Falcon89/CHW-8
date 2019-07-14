package com.cursor.wh7;

public class OutOfMemoryErrorExample {
    public static void outOfMemoryError(){
        long[] outMemory = new long[Integer.MAX_VALUE];
        System.out.println(outMemory);
    }

}
