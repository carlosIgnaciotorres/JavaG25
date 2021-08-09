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
public class Perro {
    private String nombre;
    private String raza;
    private String color;
    private byte edad; //byte -128 a 127
    private float altura;
    private String mejorAmigo;
    private Boolean vacunado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getMejorAmigo() {
        return mejorAmigo;
    }

    public void setMejorAmigo(String mejorAmigo) {
        this.mejorAmigo = mejorAmigo;
    }

    public Boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Perro(String nombre, String raza, String color, byte edad, float altura){
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.altura = altura;
        this.edad = edad;
    }

    public Perro(byte edad, String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public Perro(){
        this.nombre = "";
        this.raza = "Criollo";
        this.color = "";
        //this.altura = 0;
        //this.edad = 0;
    }

    public Perro(String nombre){
        this.nombre = nombre;
    }

    public void ladrar(){
        System.out.println("Guau... Guauuu...");
    }
    public void comer(String comida){
        System.out.println("El perro come "+comida);
    }
    
    public void conocer(Perro amigo) {
        this.mejorAmigo = amigo.nombre;
      }

   
    
    
    public static void main(String[] args) {
      Perro firulay = new Perro("firulay","Pastor Ovejero","Blanco",(byte)4,(float)0.55);
      Perro lucas = new Perro();
      Perro lassie = new Perro("Lassie");
      Perro Sanson = new Perro((byte)10,"Sanson","Pincher");
      firulay.comer("Concentrado");
      lucas.ladrar();
      System.out.println("El color del "+firulay.nombre +" es "+firulay.color);
      System.out.println("El nombre de lucas "+lucas.nombre);
      lucas.nombre="LuCaS";
      System.out.println("El nombre de lucas "+lucas.nombre);
      lucas.conocer(lassie);
    }
}
