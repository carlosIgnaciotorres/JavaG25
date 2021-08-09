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
public class Cuadrado implements FigurasGeometricas {
    private String tipo ;
    private byte lados;
    private float lado;

    public Cuadrado( float lado) {
        this.tipo = "Cuadrado";
        this.lados = 4;
        this.lado = lado;
    }

    public String getTipo() {
        return tipo;
    }

    public byte getLados() {
        return lados;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public void pintar() {
        System.out.println("La figura es "+this.tipo+" y tiene "+Byte.toString(this.lados)+" lados");
    }

    @Override
    public float area() {
        return (float) Math.pow(this.lado, 2);
    }

    @Override
    public float perimetro() {
        return 4*this.lado;
    }
}
