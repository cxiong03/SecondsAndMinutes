package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        System.out.println(GetTime.getDurationString(65, 45));
        System.out.println(GetTime.getDurationString(3945L));
        System.out.println(GetTime.getDurationString(-33));
        System.out.println(GetTime.getDurationString(45,7));
    }
}
