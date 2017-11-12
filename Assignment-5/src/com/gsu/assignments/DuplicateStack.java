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
import java.util.Queue;
import java.util.LinkedList;


public class DuplicateStack {
    
    public static void main (String[] args) {
        Stack<String> stack = new Stack<>();
        
        System.out.println ("+---------------------------------------+");               
        System.out.println ("Example of CompareStack class");
        System.out.println ("+---------------------------------------+");
        
        stack.add("Stack Item 1");
        stack.add("Stack Item 2");
        stack.add("Stack Item 3");
        
        System.out.println("Original stack..........................: " + stack);
        System.out.println("Duplicated stack........................: " + duplicateStack(stack));
        System.out.println("Original stack after duplicate method...: " + stack);
    }
    
    
    public static Stack<String> duplicateStack(Stack<String> stack){
         Stack<String> dstack = new Stack<>(); 
         Queue<String> queue = new LinkedList<>();
         
         if( stack == null || stack.size()==0 ) {             
             return null;
         }
      
         int size = stack.size(); 
      
         while(size > 0) {
             queue.add(stack.pop());
             
             
             dstack.add(0, queue.peek());
             stack.add(0, queue.remove());
           
             size--;
         }
      
         return dstack; 
    }
    
}
