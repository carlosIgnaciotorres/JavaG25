import java.util.Scanner;
/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
Reto 1: Índice de masa corporal (IMC)

Camilo, un estudiante de tercer semestre de Enfermería quiere calcular el nivel 
de riesgo que tiene sus compañeros de la Universidad de sufrir problemas del 
corazón. Una persona puede estar en riesgo de sufrir estas enfermedades 
dependiendo de su edad y su índice de masa corporal (IMC). La siguiente tabla 
presenta los diferentes niveles de riesgo.


Edad < 45	Edad ≥ 45
IMC < 22	Bajo	Medio
IMC ≥ 22	Medio	Alto


Para calcular el índice de masa corporal (IMC) calculamos el cociente entre el 
peso del individuo en kilos y el cuadrado de su alturaen metros.
Los valores de masa permitidos están entre 0 y 130.
Los valores de altura permitidos están entre 0.5 y 2.5.
Los valores de años permitidos están entre 1 y 120.


Entradas: una línea formada por 3 valores separados por un espacio:
            La masa de la persona en kilogramos.---> double
            La altura de la persona en metros. ----> double
            La edad de la persona en Años.  ----> int
Salidas: una línea con dos valores:   ----> String
            El IMC calculado con un número decimal. ----> double
            El nivel de riesgo actual.  ----> String
            o "ERROR" si alguna entrada es incorrecta
Proceso:    Si masa>=0 && masa<=130 && altura>=0.5 && altura<=2.5 && edad>=1 && edad<=120
                IMC: masa/(altura*altura)
                si IMC <22 entonces
                    si edad<45 entonces
                        Riesgo="Bajo"
                    Sino
                        Riesgo="Medio"
                Sino
                    si edad<45 entonces
                        Riesgo="Medio"
                    Sino
                        Riesgo="Alto"
                Imprimo IMC y Riesgo
            Sino
                Imprimo "ERROR"

Prueba de escritorio
Entrada 73.1 1.65 35
    Si masa>=0 && masa<=130 && altura>=0.5 && altura<=2.5 && edad>=1 && edad<=120 <--- Verdadero
        IMC: 73.1/(1.65*1-65) = 26.8503213958
        si IMC <22 entonces   <---- Falso
        Sino
            si edad<45 entonces  <---- Verdadero
                Riesgo="Medio"
        Imprimo IMC y Riesgo "26.8503213958 Medio"
Entrada 190 1.60 100
    Si masa>=0 && masa<=130 && altura>=0.5 && altura<=2.5 && edad>=1 && edad<=120   <---- Falso
    Sino
        Imprimo "ERROR"

*/
class Reto1{

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
    
    public static boolean validardatos(double masa, double altura, int edad){
        boolean result = false;
        //si masa>=0 && masa<=130 && altura>=0.5 && altura<=2.5 && edad>=1 && edad<=120 
        //result = true
        
        return result;        
    }
    public static double CalcularIMC(double masa, double altura){
        double imc = masa/(altura*altura);
        return imc;
    }
    /**
    * método principal
    */
    public void run(){
        /*
        solución propuesta
        */
        if (validardatos(masa,altura,edad)){
            
        }else{
            System.out.println("ERROR");
        }
        
    }
}
