import java.util.Scanner;
/*
 *    UCF  COP3330 Fall 2021 Assignment 1 Solution02
 *    Copyright 2021 Sean Moore
 */


public class solution02 {
    /*
    Create an application that prompts a string input
    it will then return "<string> has x characters."
     */
    //challenge 1: If nothing is entered, prompt for input
    // until a valid string is input

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("What is the input string? ");
        String str = input.nextLine();

        //challenge 1: if nothing is entered ask for
        while (str == ""){
            System.out.println("Please enter something, hun: ");
            str = input.nextLine();
        }

        System.out.println(str + " has " + str.length() + " characters.");
    }
}
