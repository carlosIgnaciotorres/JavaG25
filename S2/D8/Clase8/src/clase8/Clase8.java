/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author carlostorres
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo tri1 = new Triangulo(3,4);
        Cuadrado cua1 = new Cuadrado(5);
        Rectangulo rec1 = new Rectangulo(3,4);
        Circulo cir1 = new Circulo(5);
        tri1.pintar();
        System.out.println("El area del "+tri1.getTipo()+" es "+tri1.area());
        System.out.println("El perimetro del "+tri1.getTipo()+" es "+tri1.perimetro());
        
        cua1.pintar();
        System.out.println("El area del "+cua1.getTipo()+" es "+cua1.area());
        System.out.println("El perimetro del "+cua1.getTipo()+" es "+cua1.perimetro());
        
        
        rec1.pintar();
        System.out.println("El area del "+rec1.getTipo()+" es "+rec1.area());
        System.out.println("El perimetro del "+rec1.getTipo()+" es "+rec1.perimetro());
        
        cir1.pintar();
        System.out.println("El area del "+cir1.getTipo()+" es "+cir1.area());
        System.out.println("El perimetro del "+cir1.getTipo()+" es "+cir1.perimetro());
        
        ArrayList<FigurasGeometricas> figs = new ArrayList<FigurasGeometricas>();
        figs.add(tri1);
        figs.add(cua1);
        figs.add(rec1);
        figs.add(cir1);
        int tam = figs.size();
        System.out.println("-----______-----_____-----");
        for (int i =0;i<tam;i++){
            figs.get(i).pintar();
            System.out.println("El area es "+figs.get(i).area());
            System.out.println("El perimetro es "+figs.get(i).perimetro());
            System.out.println("-----______-----_____-----");
        
        }
        figs.remove(2);
        figs.remove(2);
        tam = figs.size();
        System.out.println("-----______-----_____-----");
        for (int i =0;i<tam;i++){
            figs.get(i).pintar();
            System.out.println("El area es "+figs.get(i).area());
            System.out.println("El perimetro es "+figs.get(i).perimetro());
            System.out.println("-----______-----_____-----");
        
        }
            
        HashMap<String,FigurasGeometricas> figuras = new HashMap<String,FigurasGeometricas>();
        figuras.put("Fig1",tri1);
        figuras.put("Fig2",cua1);
        figuras.put("Fig3",rec1);
        figuras.put("Fig4",cir1);
        
    }
    
}
