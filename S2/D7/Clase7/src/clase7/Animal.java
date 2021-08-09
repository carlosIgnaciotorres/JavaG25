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
interface Animal {
    String color="";
    byte edad=0;
    float altura=0.0f;
    boolean despierto = true;

    public void comer(String comida);
    public void despertar();
    public void dormir();
}
