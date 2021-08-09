/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

/**
 *
 * @author carlostorres
 */
public class Circulo implements FigurasGeometricas {
    private String tipo ;
    private byte lados;
    private float radio;

    public Circulo(float radio) {
        this.tipo = "Circulo";
        this.lados = 0;
        this.radio = radio;
    }
    
    @Override
    public void pintar() {
        System.out.println("La figura es "+this.tipo+" y tiene "+Byte.toString(this.lados)+" lados");
    }

    @Override
    public float area() {
        return (float) Math.PI*this.radio*this.radio;
    }

    @Override
    public float perimetro() {
        return (float) Math.PI*this.radio*2;
    }

    public String getTipo() {
        return tipo;
    }

    public byte getLados() {
        return lados;
    }

    

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
