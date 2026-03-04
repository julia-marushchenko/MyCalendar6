/**
 *  Java program to use abstract Calendar and GregorianCalendar objects.
 */

package com.mycallendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *  Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Creating calendar objects.
        Calendar calendar = Calendar.getInstance();

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        // Printing dates to console.
        System.out.println(calendar.getTime()); // Output: Wed Mar 04 04:53:25 CET 2026
        System.out.println(gregorianCalendar.getTime()); // Output: Wed Mar 04 04:53:25 CET 2026

    }
}