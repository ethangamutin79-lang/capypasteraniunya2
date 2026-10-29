/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author GAMUTIN_CPE113
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Odd or Even");
        System.out.println("2. Triangle");
        System.out.println("Choice: ");
        int choice = input.nextInt();
       
        if (choice == 1) {
            System.out.println("Odd or Even");
        System.out.println("Enter a number");
        int Aylabyolab = OddorEven(input.nextInt(1));
          System.out.println("Result: " + Aylabyolab);
       } else     
        } 
    }
     static int OddorEven(int num){
        if (num % 2 == 0) {
        return 1;
        } else {
        return 0;    
        }
     }
    
    static int classifyTriangle(int z, int x, int c){
        if (z <= 0 || z + c <= x ||x + c <=z ){
        return 0;
        {else if (z == x && x == c){
        return 1;
        }else if (z == x || z == c || x == c){
         return 2;
                } else {        
                }        
    }
