/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3a;

import java.util.Scanner;




/**
 *
 * @author carlostorres
 */
public class Clase3a {
    /*Construya un programa que dado un número, diga si es o no un número de Armstrong. 
Un número de n dígitos es un número de Armstrong si la suma de las potencias n-ésimas de 
los dígitos que lo componen es igual al mismo número. Ejemplo: 1634 es un número de Armstrong
    256+81+1296+1
*/
    public static boolean armstrong(int numero){
        boolean resultado = false;
        String Snumero = Integer.toString(numero);
        int n = Snumero.length();
        double suma = 0;
        int Cnum;
        for (int i = 0; i<n ;i++ ){
            Cnum = Character.getNumericValue(Snumero.charAt(i));
            suma = suma + Math.pow(Cnum, n);
        }
        if (suma==numero){
            resultado = true;
        }
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num = Integer.parseInt(leer.nextLine());
        System.out.println(armstrong(num));
    }
    
}
