/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author carlostorres
 */
class Reto2 {
    /*
    Analisis reto 2
    Reto 2: Inventario para un supermercado de víveres

    La tienda de Andrés vende diferentes productos, usualmente frutas, dulces y 
    algunos tipos de carne. Con el propósito de mejorar el control sobre las 
    ventas y el inventario de la tienda, Andrés decide construir una aplicación 
    que le permita almacenar la información de los productos y realizar algunos 
    cálculos sobre los datos. Luego de discutir por un tiempo sobre lo que 
    debería hacer la aplicación, logran construir el siguiente diagrama de casos
    de uso.

    Diagrama de casos de uso.


    Usted es contratado para desarrollar el sistema de inventario con las 
    funcionalidades presentadas en el diagrama de casos de uso en el lenguaje de
    programación Java. Debido a que esta es una etapa inicial en el desarrollo 
    de la aplicación, la base de datos será representada temporalmente mediante
    un HashMap llamado listaProductos que tendrá por llave el código del 
    producto y por valor una instancia de la clase Producto que tendrá como 
    atributos código, nombre, precio e inventario. La Tabla 1 presenta los 
    productos disponibles a la fecha en el almacén.



código	nombre          precio	inventario
1	Manzanas	6000.0	25
2	Limones         2500.0	15
3	Peras           2700.0	34
4	Arandanos	9300.0	34
5	Tomates         2100.0	42
6	Fresas          4100.0	10
7	Helado          4500.0	41
8	Galletas	500.0	8
9	Chocolates	4500.0	80
10	Jamon           15000.0	10

Tabla 1: Productos disponibles en la tienda.
    
    
    
    HashMap<Integer, Producto> llamado listaProductos llave el código del 
    producto y por valor una instancia de la clase Producto
    
    clase Producto
        codigo int (privado), 
        nombre String  (privado), 
        precio float (privado), 
        inventario int (privado).
    
        Producto(int codigo, String nombre, float precio, int inventario) (publico void)
            this.codigo = codigo
            this.nombre = nombre
            this.precio = precio
            this.inventario = inventario
    
        Getters y Setters
        getCodigo() (public int)
            devolver this.codigo
            
    
    clase BaseDatosProductos
        HashMap<Integer, Producto> listaProductos<Producto.getCodigo(), Producto>
   
        agregar(Producto nuevoProducto) (privado void)
            listaProductos.put(nuevoProducto.getCodigo() ,nuevoProducto)
        
        actualizar(Producto nuevoProducto) (privado void)
            listaProductos.replace(nuevoProducto.getCodigo() ,nuevoProducto)
    
        eliminar(Producto nuevoProducto) (privado void)
            listaProductos.remove(nuevoProducto.getCodigo())
    
        generarInforme() (privado void)
            idMenor--->int----> listaProductos.Llave1.getCodigo()
            idMayor--->int----> listaProductos.Llave1.getCodigo()
            precioMenor--->float----> listaProductos.Llave1.getPrecio()
            precioMayor--->float----> listaProductos.Llave1.getPrecio()
            promedio=0--->float
            valoracion=0--->float
            para cada producto en listaProductos
                si producto.getPrecio()>precioMayor entonces
                    precioMayor = producto.getPrecio()
                    idMayor = producto.getCodigo();
                si producto.getPrecio()<precioMenr entonces
                    precioMenr = producto.getPrecio()
                    idMenor = producto.getCodigo();
                promedio = promedio + producto.getPrecio()
                valoracion = valoracion + (producto.getPrecio() * producto.getInventario())
            promedio = promedio / listaProductos.size()
            imprimimos listaProductos.get(idMayor).getNombre() 
                       listaProductos.get(idMenor).getNombre() 
                       promedio valoracion
         
    
        verificarExistencia( (privado boolean)
            devolver listaProductos.containsKey(nuevoProducto.getCodigo())
    
        rellenarListaProductos()
            Producto p1 = new Producto(1,"Manzanas",6000,25)
    
            Producto p10 = new Producto(10,"Jamon",15000,10)
            listaProductos.put(p1.getCodigo(), p1)
    
            listaProductos.put(p10.getCodigo(), p10)
    
    
    clase Reto2
        run()
            accion = read()
            datos = read()
            listaDatos = datos.split(" ")
            nuevoProducto = Producto(listaDatos)
            BaseDatosProductos tiendaAndres = new BaseDatosProductos()
            tiendaAndres.rellenarListaProductos()
            Si accion = "AGREGAR"
                si (tiendaAndres.verificarExistencia()= verdadero)
                    imprima "ERROR"
                sino
                   tiendaAndres.agregar(nuevoProducto)
                   tiendaAndres.generarInforme()
            sino si accion = "ACTUALIZAR"
                si (tiendaAndres.verificarExistencia()= falso)
                    imprima "ERROR"
                sino
                   tiendaAndres.actualizar(nuevoProducto)
                   tiendaAndres.generarInforme()
            sino si accion = "ELIMINAR"
                si (tiendaAndres.verificarExistencia()= falso)
                    imprima "ERROR"
                sino
                   tiendaAndres.elimina(nuevoProducto)
                   tiendaAndres.generarInforme()

    
    */
    
    
    
    
    
    
    /**
    *  Este debe ser el único objeto de tipo Scanner en el código
    */
    private final Scanner scanner = new Scanner(System.in);

    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read(){
        return this.scanner.nextLine();
    }

    /**
    * método principal
    */
    public void run(){
        /*
        solución propuesta
        */
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reto2 r2 = new Reto2();
        r2.run();
        
    }
    
}
