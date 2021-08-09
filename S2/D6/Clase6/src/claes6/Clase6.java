/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claes6;

/**
 *
 * @author carlostorres
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro firulay = new Perro("firulay","Pastor Ovejero","Blanco",(byte)4,(float)0.55);
        Perro lucas = new Perro();
        Perro lassie = new Perro("Lassie");
        firulay.comer("Concentrado");
        lucas.ladrar();
        System.out.println("El color del "+firulay.getNombre() +" es "+firulay.getColor());
        System.out.println("El nombre de lucas "+lucas.getNombre());
        lucas.setNombre("LuCaS");
        System.out.println("El nombre de lucas "+lucas.getNombre());
        lucas.conocer(lassie);
        
    }
    
}
