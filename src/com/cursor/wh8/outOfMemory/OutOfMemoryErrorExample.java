package com.cursor.wh8.outOfMemory;
/**
 * Created by Vasyl Kachala on 14.07.2019.
 */
public class OutOfMemoryErrorExample {
        public static void main(String[] args){
            long[] outMemory = new long[Integer.MAX_VALUE];
            System.out.println(outMemory);
    }

}
