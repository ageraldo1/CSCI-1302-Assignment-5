/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

/**
 *
 * @author Alexandre
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Palindrome {
    
    public static void main (String[] args) {

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        System.out.println ("+---------------------------------------+");               
        System.out.println ("Example of Palindrome class");
        System.out.println ("+---------------------------------------+");
        
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Enter the phrase...: ");
        
        String phrase = in.next();       
        
        char c;
        char value;
        
        
        for ( int i = 0; i < phrase.length(); i++) {
            c = phrase.charAt(i);
            
            if ( Character.isUpperCase(phrase.charAt(i)) ) {
                value = Character.toLowerCase(c);                
                
            } else { 
                value = c;
            }
            
            stack.push(Character.toString(value));
            queue.add(Character.toString(value));
        }
        
        System.out.println("Queue value........: " + queue);
        System.out.println("Stack value........: " + stack);
        System.out.println("Palindrome.........: " + isPalindrome(phrase));
    }
    
    public static boolean isPalindrome(String phrase) {
        String reverse="";
        
        for (int i = phrase.length() -1; i >=0; i--) {
             reverse = reverse + phrase.charAt(i);
        }
        
        if ( phrase.equals(reverse)) {
            return true;
            
        } else { 
            return false;
        }
    }
    
}
