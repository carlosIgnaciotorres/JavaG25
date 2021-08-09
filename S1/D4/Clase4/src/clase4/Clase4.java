/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author carlostorres
 */
public class Clase4 {
    /*
    Construya un programa que solicite al usuario 10 números enteros positivos 
    los almacene en un arreglo e imprima, el promedio y la desviación estándar 
    del arreglo de números.
     */
    public static int[] crearArreglo(int size){
        int notas[] = new int[size];
        Scanner leer = new Scanner(System.in);
        for (int i=0; i<size;i++){
            System.out.println("Ingrese un número:");
            notas[i] =  Integer.parseInt(leer.nextLine());
        }
        return notas;
    }
    
    public static void imprimirArreglo(int[] Arreglo){
        for( int element : Arreglo){
            System.out.print(element+" ");
        }
        System.out.println("");
    }
    
    public static double promedioArreglo(int[] Arreglo){
        double result=0;
        double summ=0;
        for(int element : Arreglo ){
            summ += element;
        }
        result = summ / Arreglo.length;
        return result;
    }
    public static double desviacionArreglo(int[] Arreglo){
        double result=0;
        double dif = 0;
        double sum =0;
        double media = promedioArreglo(Arreglo);
        for(int element : Arreglo ){
            dif = element - media;
            sum += dif*dif;
        }
        sum /= Arreglo.length;
        result = Math.sqrt(sum);
        return result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] miArreglo = crearArreglo(10);
        imprimirArreglo(miArreglo);
        System.out.println(promedioArreglo(miArreglo));
        System.out.println(desviacionArreglo(miArreglo));
    }
    
}
