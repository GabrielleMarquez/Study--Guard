package com.example.studyguard;

import org.junit.Test;

public class Bautista_Minipeta1 {
    @Test
    public void printMyProfile() {

        /// --- 1. THE INPUT (Storing your personal details variables)---
        String myName = "Jaiden";
        String petName = "Whiskers";
        String favFood = "Sisig";
        int myAge = 18;

        // --- 2. THE OUTPUT (Printing to the console) ---
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is" + myName + "and I am" + myAge + "years old,");
        System.out.println("I have a wonderful pet named " + petName + ",");
        System.out.println("If I could, I would eat " + favFood + "every single day!");
    }
}