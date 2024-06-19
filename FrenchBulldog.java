/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.time.LocalTime;
import java.time.*;
import java.text.SimpleDateFormat;

public class FrenchBulldog {

    public void SieveOfEratoshenes(int number) {
        int factors[]=new int[number-1];
        int prime = 2,position=0,quantity=0;

        System.out.print("Factors of " + number + ": \n");
        for (int k = 2; k <= number; k++) {
            Array.set(factors, position, k);
            position++; 
        }
       
        for(int j: factors){
            if(j!=0)
                prime=j;
            if(Math.pow(prime,2)<number){
                for(int position2=0; position2<factors.length; position2++){
                    if(factors[position2]%prime==0 && factors[position2]!=prime){
                        factors[position2]=0;
                    }
                }
                        
            }
        }
        
        for(int j: factors){
            if(j!=0){
                System.out.println(j);
                quantity++; 
            
            }
        }
        
        System.out.println("Total Primes: "+quantity); 
    }

    public static void main(String args[]) {

        FrenchBulldog f = new FrenchBulldog();
        f.SieveOfEratoshenes(100);

    }
}
