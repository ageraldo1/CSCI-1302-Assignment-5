/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Alexandre
 */
public class BracesBalancer {
    
    public static boolean isBalanced(String expression) {
        Stack <Character> s = new Stack <Character> ();

        for(int i = 0; i < expression.length(); i++) {
            char x = expression.charAt(i);

            if(x == '(' || x == '[' || x == '{' ) {
                s.push(x);
                
            } else if(x == ')' || x == ']' || x == '}' ) {
                if(s.empty()) {
                   return false;
                } 
                
                if(x == ')' && s.peek() == '(')
                    s.pop();
                
                else if(x == ']' && s.peek() == '[')
                    s.pop();
                
                else if(x == '}' && s.peek() == '{')
                    s.pop();
                
                else if(x == '>' && s.peek() == '<')
                    s.pop();
                
                else {
                    return false;
                }   
            }
        }

        if(s.empty()) {
            return true;
            
        } else {
          return false;
        }
}
    
    public static void main(String[] args) {
        
        System.out.println ("+---------------------------------------+");               
        System.out.println ("Example of BracesBalancer class");
        System.out.println ("+---------------------------------------+");
        
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Enter the expression...: ");
  
        String expression = in.next();
        
        
        if(isBalanced(expression)) {
            System.out.println("The expression " + expression  + " is balanced.");
            
        } else {
            System.out.println("The expression " + expression  + " is unbalanced.");
        }
    }
    
}
