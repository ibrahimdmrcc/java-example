	/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;



/**
 *
 * @author b404-3
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("aışveriş miktarı giriniz");
     
        Scanner girdi = new Scanner(System.in);
        
        int sonuc=girdi.nextInt();
        
        
   if(sonuc<200)
            System.out.println(sonuc*(0.9));
   else if (sonuc<400)
            System.out.println(sonuc*(0.85));
   else 
            System.out.println(sonuc*0.8);
    }}