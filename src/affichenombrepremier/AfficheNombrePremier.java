package affichenombrepremier;

import java.io.*;
import java.util.Scanner;
        

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package affichenombrepremier;

/**
 *
 * @author p1200475
 */
public class AfficheNombrePremier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Veuillez Saisir le nombre de Premiers recherch√©s");
       Scanner sc= new Scanner(System.in);
       int nbElem = sc.nextInt();
       int tabPremier []= new int[nbElem];
       int j = 2;
       for (int i=0;i<nbElem;i++)
       {
           while (estPremier(j)==false){
               j=j+1;
           }
           System.out.println(j);
           tabPremier[i]=j;
           j=j+1;
               }
    }
    public static boolean estPremier (int n){
        if (n==1)   {
                return false;
        }
        int racine = (int) Math.sqrt (n);
        for(int i=2; i<=racine; i++)    {
                if (n%i==0) {
                       return false;
                }
        }
        return true;
    }
} // BANDE pÈdÈ
