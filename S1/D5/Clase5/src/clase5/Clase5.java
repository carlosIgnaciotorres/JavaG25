/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author carlostorres
 */
public class Clase5 {

    /*
    Reto 4: Detectando copia en los exámenes de programación

Uno de los profesores de programación de la Universidad Sergio Arboleda 
está comenzando a perder su memoria. Hace algún tiempo, cuando comenzó a 
trabajar como docente, no únicamente conocía perfectamente todos los nombres 
y apellidos de sus estudiantes, sino que además contaba con una habilidad 
increíble para detectar copia en los exámenes de programación. Estaba tan 
seguro de sus capacidades que mientras los estudiantes se concentraban en 
analizar los problemas y diseñar algoritmos, él se sentaba en la última fila 
del salón a preparar futuras clases sin preocuparse por los intentos de 
algunos estudiantes por hacer trampa.

La habilidad del profesor se basa en su memoria fotográfica. Cuando el 
profesor calificaba era capaz de recordar a la perfección si había visto un 
examen con las mismas respuestas o no, y si las encontraba acusaba siempre 
al segundo estudiante de copiar. Lamentablemente, durante los últimos meses 
su memoria fotográfica ya no funciona como antes y ahora solo recuerda 
algunos de los últimos exámenes que ha calificado.

Debido a estas circunstancias, el profesor ha decidido solicitar su ayuda 
para construir un programa en Python que le permita comprobar si la perdida 
de su memoria fotográfica podría tener como consecuencia una disminución 
en la cantidad de copias que se detectan durante los exámenes.
Entradas:
    N Numero de examenes a calificar
    K Numero de examenes que recuerda el profesor
    Lista de los examenes números entre 1 y 100

Salidas
    El primero representará el número total de exámenes copiados.
    El segundo representará la cantidad de copias detectadas por el 
    profesor considerando que al calificar un examen solo es capaz 
    de recordar los K exámenes anteriores.

Proceso
    Leer N y K
    Leer la lista de examenes
    Buscar examenes repetidos en la lista
    Buscar examenes repetidos por el profesor recuerda (K)

BuscarRepetidos(Lista)---> cantidad de repetidos
    Entradas
        Lista de los examenes números entre 1 y 100
    Salidas
        El número total de exámenes copiados
    Proceso
        Longtotal = len(lista)
        listaUnicos = []
        para cada elemento en la lista:
            si el elemento no esta en listaUnicos:
                listaUnicos agregue elemento
        totalCopiados = Longtotal - len(listaUnicos)
        devolver totalCopiados

BuscarRepetidosProfesor(K, posicion, lista) --->la cantidad de copias detectadas
    K   valor   Posicion    Lista               K-anteriores    Hay
    3   1       0           [1, 2, 3, 1, 2]     []              No
    3   2       1           [1, 2, 3, 1, 2]     [1]             No
    3   3       2           [1, 2, 3, 1, 2]     [1, 2]          No
    3   1       3           [1, 2, 3, 1, 2]     [1, 2, 3]       Si
    3   2       4           [1, 2, 3, 1, 2]     [2, 3, 1]       Si

Prueba escritorio BuscarRepetidos([1, 2, 3, 1, 2])
    Longtotal = 5
    listaUnicos = []
        para cada elemento en la lista:
            1
            si el 1 no esta en listaUnicos:
                listaUnicos = [1]
            2
            si el 2 no esta en listaUnicos:
                listaUnicos = [1, 2]
            3
            si el 3 no esta en listaUnicos:
                listaUnicos = [1, 2, 3]
            1
            2
    totalCopiados = 5 - 3 = 2
    Devolver 2
     */
    private static int BuscarRepetidos(String[] lista) {   ////[1,2,3,4,5,1,2,3,2]
        int result;
        int longtotal = lista.length;
        String[] listaunicos = new String[longtotal];
        boolean existe;
        for (int i = 0; i < longtotal; i++) {
            listaunicos[i] = "";
        }
//        for (String examen : listaunicos ){
//            examen="";
//        }
        int insertados = 0;
        for (int j = 0; j < longtotal; j++) {
            existe = false;
            for (int k = 0; k < insertados; k++) {
                if (lista[j].equals(listaunicos[k])) {
                    existe = true;
                }
            }
            if (existe == false) {
                listaunicos[insertados] = lista[j];
                insertados++;
            }
        }
        result = longtotal - insertados;
        return result;
    }

    /**
     * Este debe ser el único objeto de tipo Scanner en el código
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Este método es usado para solicitar datos al usuario
     *
     * @return Lectura de la siguiente linea del teclado
     */
    public String read() {
        return this.scanner.nextLine();
    }

    public void run() {
        /*
        solución propuesta
         */
        Scanner leer = new Scanner(System.in);
        String lecturaNK = read();
        String[] datosNK = lecturaNK.split(" ");
        int N = Integer.parseInt(datosNK[0]);
        int K = Integer.parseInt(datosNK[1]);
        String examenes = read();
        String[] listaExam = examenes.split(" ");
        System.out.println(BuscarRepetidos(listaExam));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Leer N y K
            Leer la lista de examenes
         */
        Clase5 reto = new Clase5();
        reto.run();
    }

}
