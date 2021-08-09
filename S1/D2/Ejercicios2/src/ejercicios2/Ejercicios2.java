/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author carlostorres
 */
public class Ejercicios2 {

    /**
     * @param args the command line arguments
     */
    
    public static int coordenadas(int x, int y){
        int resultado=0;
        if (x>=0){
            if (y>=0){
                resultado=1;
            }else{
                resultado=4;
            }
        }else{
            if (y>=0){
                resultado=2;
            }else{
                resultado=3;
            }
        }
        return resultado;
    }
    
    public static void imprimirMayor(int a, int b, int c){
        if((a>b)&&(a>c)){
            System.out.println("El valor mayor es "+a);
        }else{
            if ((b>a)&&(b>c)){
                System.out.println("El valor mayor es "+b);
            }else{
                if ((c>a)&&(c>b)){
                    System.out.println("El valor mayor es "+c);
                }
            }
        }
    }
    
    public static boolean esDivisorLaDiferencia(int a, int b){
        boolean respuesta = false;
        if((a%(a-b)==0)&&(b%(a-b)==0)){
            respuesta=true;
        }
        return respuesta;
    }
    //Escribe un programa que pida al usuario un número y muestre por pantalla 
    //si es negativo y múltiplo de 3 o si no lo es.
    public static void negativoMultiplo3(int numero){
        if (numero<0){
            System.out.println("El número "+numero+" es negativo");
        }
        if (numero%3==0){
            System.out.println("El número es multiplo de 3");
        }else{
            System.out.println("El número no es multiplo de 3");
        }
         //Alternativa2 segun respuesta de github
//        if (numero<0){
//            System.out.println("El número "+numero+" es negativo");
//        }else{
//            System.out.println("El número "+numero+" No es negativo");
//        }
//        if (numero%3==0){
//            System.out.println("El número es multiplo de 3");
//        }else{
//            System.out.println("El número no es multiplo de 3");
//        }
          //Alternativa3
//        if ((numero<0)&&(numero%3==0)){
//            System.out.println("El número "+numero+" es negativo");
//            System.out.println("El número es multiplo de 3");
//            }else{
//                System.out.println("El número no es multiplo de 3 o no es negativo");
//            }
//        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number =Integer.parseInt(leer.nextLine());
        negativoMultiplo3(number);
    }
    
}
