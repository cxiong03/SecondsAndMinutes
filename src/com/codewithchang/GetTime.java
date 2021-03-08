package com.codewithchang;

public class GetTime {
    public static String getDurationString(long minutes, long seconds) {

        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

//    private static String getDurationString(int seconds) {
//        if(seconds >= 0) {
//        return "Invalid value";
//        }
//    }



}
