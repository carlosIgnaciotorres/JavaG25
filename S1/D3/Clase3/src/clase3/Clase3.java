/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author carlostorres
 */
public class Clase3 {
    
    /*
     * Construya un programa que a partir de un arreglo de  N números  
     * determine qué porcentaje de los números son cero, qué porcentajes 
     * son positivos y qué porcentajes son negativos
     */
    public static void analisisArreglo(int[] numeros){
        int tamano = numeros.length;
        double ceros = 0;
        double positivos = 0;
        double negativos = 0;
        //for(valor inicial; Condicion de parada;incremento/decremento
        for (int i = 0; i<tamano; i++) {
            if (numeros[i]>0){
                positivos+=1;
            }else{
                if (numeros[i]<0){
                    negativos+=1;
                }else{
                    ceros+=1;
                }
            }
        }
        double ppositivos = 0;
        ppositivos = (positivos/tamano)*100;
        double pnegativos = (negativos/tamano)*100;
        double pceros = (ceros/tamano)*100;
        System.out.println("La cantidad de positivos es "+positivos+" el porcentaje total fue "+ppositivos);
        System.out.println("La cantidad de negativos es "+negativos+" el porcentaje total fue "+pnegativos);
        System.out.println("La cantidad de ceros es "+ceros+" el porcentaje total fue "+pceros);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {1,2,3,9,0,-1,-2,0,-2,8};
        analisisArreglo(datos);
    }
    
}
