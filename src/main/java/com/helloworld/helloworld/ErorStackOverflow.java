package com.helloworld.helloworld;

public class ErorStackOverflow {
    
        static void loop (int value){
            if (value == 0){
                System.out.println("Selesai") ;
            }else {
                System.out.println("Loop-" + value);
                loop(value - 1);
            }
        }
}
