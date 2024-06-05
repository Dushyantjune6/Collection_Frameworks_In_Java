package org.CollectionFrameworks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            System.out.println(i+" "+System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}