/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author carlostorres
 */
public class Calculadora {
    private int num1;
    private int num2;
    private int suma;
    private int resta;
    private int multiplicacion;
    private int division;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public Calculadora() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSuma() {
        return suma;
    }

    public int getResta() {
        return resta;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public int getDivision() {
        return division;
    }
    
    public int sumar(){
        this.suma = this.num1+this.num2;
        return this.suma;
    }
    
    public int restar(){
        this.resta = this.num1-this.num2;
        return this.resta;
    }
    
    public int multiplicar(){
        this.multiplicacion = this.num1*this.num2;
        return this.multiplicacion;
    }
    
    
    public int dividir(){
        this.division = this.num1/this.num2;
        return this.division;
    }
    
    
}
