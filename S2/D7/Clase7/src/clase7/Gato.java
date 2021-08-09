/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author carlostorres
 */
public class Gato implements Animal{
    private String nombre;
    private String raza;
    private String dueno;

    public Gato(String nombre, String raza, String dueno) {
        this.nombre = nombre;
        this.raza = raza;
        this.dueno = dueno;
    }
    public Gato(){
        super();
        this.nombre = "";
        this.raza = "Por determinar";
        this.dueno = "Sin dueño";
    }
    
    public void maullar(){
        System.out.println("Miauuu Miauuu...");
    }

    @Override
    public void comer(String comida) {
        System.out.println("El Gato come "+comida);
    }

    @Override
    public void despertar() {
        System.out.println("El gato está despierto");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está dormido");
    }
    
    
}
