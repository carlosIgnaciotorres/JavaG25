
import clase9.Calculadora;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlostorres
 */
public class MyTest {
    
    @Test
    public void testSuma(){
        System.out.println("Test de Suma");
        int a = 8;
        int b = 5;
        int esperado = 13;
        Calculadora cal = new Calculadora(a,b);
        int resultado = cal.sumar();
        assertEquals(esperado, resultado);
        
        if (resultado != esperado){
        fail("Fallo el test en Sumar");
    }
    }
    
    @Test
    public void testSumaNegativos(){
        System.out.println("Test de Suma Negativos");
        int a = -8;
        int b = -5;
        int esperado = -13;
        Calculadora cal = new Calculadora(a,b);
        int resultado = cal.sumar();
        assertEquals(esperado, resultado);
        
        if (resultado != esperado){
        fail("Fallo el test en Sumar");
    }
    }
    @Test
    public void testSumaCero(){
        System.out.println("Test de Suma Cero");
        int a = 8;
        int b = -8;
        int esperado = 0;
        Calculadora cal = new Calculadora(a,b);
        int resultado = cal.sumar();
        assertEquals(esperado, resultado);
        System.out.printf("para la suma %d y %d el resultado fue %d y el esperado era %d\n",a,b,resultado, esperado);
        if (resultado != esperado){
        fail("Fallo el test en Sumar");
    }
    }
    
    
    @Test
    public void testResta(){
        System.out.println("Test de Resta");
        int a = 8;
        int b = 5;
        int esperado = 3;
        Calculadora cal = new Calculadora(a,b);
        int resultado = cal.restar();
        assertEquals(esperado, resultado);
        
        if (resultado != esperado){
        fail("Fallo el test en Restar");
    }
    }
    
    @Test
    public void testMultiplicacion(){
        System.out.println("Test de Multiplicación");
        int a = 8;
        int b = 5;
        int esperado = 40;
        Calculadora cal = new Calculadora(a,b);
        int resultado = cal.multiplicar();
        assertEquals(esperado, resultado);
        
        if (resultado != esperado){
        fail("Fallo el test en Multiplicar");
    }
    }
    
    @Test
    public void testDivision(){
        System.out.println("Test de Division");
        int a = 15;
        int b = 5;
        int esperado = 3;
        Calculadora cal = new Calculadora(a,b);
        int resultado = cal.dividir();
        assertEquals(esperado, resultado);
        
        if (resultado != esperado){
        fail("Fallo el test en Dividir");
    }
    }
}
