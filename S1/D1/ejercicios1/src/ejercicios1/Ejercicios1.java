/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;
import java.util.Scanner;
import java.util.*;
        
/**
 *
 * @author carlostorres
 */
public class Ejercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Integer num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese otro numero: ");        
        Integer num2 = Integer.parseInt(sc.nextLine());
        Integer suma = num1 + num2;
        System.out.println("La suma de los dos numeros es "+suma.toString());
        System.out.println("Ingrese una distancia en km ");
        Double km = Double.parseDouble(sc.nextLine());
        Double mts = km*1000;
        Double cms = mts*100;
        System.out.println("los "+km+" en metros son "+mts+" y en centimetros "+cms);
        System.out.println("Ingrese las coordenasdas x1, y1");
        Float x1 = Float.parseFloat(sc.nextLine());
        Float y1 = Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese las coordenasdas x2, y2");
        Float x2 = Float.parseFloat(sc.nextLine());
        Float y2 = Float.parseFloat(sc.nextLine());   
        Double distancia = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("La distancia es "+distancia.toString());
    }
    
}
