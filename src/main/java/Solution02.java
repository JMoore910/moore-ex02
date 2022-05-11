import java.util.Scanner;
/*
 *    UCF  COP3330 Fall 2021 Assignment 1 Solution02
 *    Copyright 2021 Sean Moore
 */


public class Solution02 {
    /*
    Create an application that prompts a string input
    it will then return "<string> has x characters."
     */
    public static void main(String[] args){
        //  Use scanner for input
        Scanner input = new Scanner(System.in);
        
        //  prompt user to input a string
        System.out.printf("What is the input string? ");
        String str = input.nextLine();
        
        //  Error handling method: while the input string is empty ask the user for input
        while (str == ""){
            System.out.println("Please enter something ");
            str = input.nextLine();
        }

        //  Print out the string and the number of characters
        System.out.println(str + " has " + str.length() + " characters.");
    }
}
