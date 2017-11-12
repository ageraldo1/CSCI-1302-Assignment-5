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

import java.util.Stack;

public class CompareStack {
    
    public static void main (String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        System.out.println ("+---------------------------------------+");               
        System.out.println ("Example of CompareStack class");
        System.out.println ("+---------------------------------------+");
        
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.push(5);
        
        System.out.println ("First Stack....:" + s1);
        System.out.println ("Second Stack...:" + s2);
        System.out.println ("Are Equal......:" + areEquals(s1,s2));        
        
    }
    
    public static boolean areEquals(Stack<Integer> s1, Stack<Integer> s2) {
        
        boolean areEqual = true;
        
        if ( s1.size() != s2.size() ) {
            return false;
        }
                            
        Stack<Integer> s3 = new Stack<>();
        
        while(!s1.isEmpty() && !s2.isEmpty()) {
            int n1 = s1.pop();
            int n2 = s2.pop();
        
            s3.push(n1);
            s3.push(n2);
        
            if(n1 != n2) {
                areEqual = false;
                //break;
            }
        }
    
        while(!s3.isEmpty()) {
            s2.push(s3.pop());
            s1.push(s3.pop());
        }
    
        return areEqual;
    }
    
   

    
}

