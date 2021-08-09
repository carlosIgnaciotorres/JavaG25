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
public class Triangulo implements FigurasGeometricas {
    private String tipo ;
    private byte lados;
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.tipo = "Triangulo";
        this.lados = 3;
        this.base = base;
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }


    public byte getLados() {
        return lados;
    }

    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    
    @Override
    public void pintar() {
        System.out.println("La figura es "+this.tipo+" y tiene "+Byte.toString(this.lados)+" lados");
    }

    @Override
    public float area() {
        return this.base*this.altura/2;
    }

    @Override
    public float perimetro() {
        float hipotenusa = (float)Math.sqrt(Math.pow(this.base, 2)+ this.altura*this.altura);
        return this.altura+this.base+hipotenusa;
    }
    
}
