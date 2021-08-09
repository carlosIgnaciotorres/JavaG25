/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author carlostorres
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A = Integer.parseInt(leer.nextLine());
        int B = Integer.parseInt(leer.nextLine());
        if (A>B){
            System.out.println("A es mayor que B"); 
        }else{
            System.out.println("B es mayor o igual a A");
        }
    }
    
}
