    /**
        Esta Clase contiene el ejercicio 1 de Java Básico
        1- Crear un proyecto Java desde 0
        2- Dentro del proyecto crear un paquete. En el paquete hay que crear una clase.
        3- Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones
     */

public class Ejercicio1 {
    public static void main(String[] args) { //Aquí esta el método main

        //Datos númericos:

        int numero1 = 1;
        System.out.println("Esto es un número int: " + numero1);
        long numero2 = 999999999;
        System.out.println("Esto es un número long (cómo un número de teléfono): " + numero2);
        double numero3 = 2.5d;
        System.out.println("Esto es un un tipo de dato numérico double con 15 decimales de precisión: " + numero3);
        float numero4 = 2.5f;
        System.out.println("Esto es un tipo de dato numérico float con 7 decimales de precisión: " + numero4);

        //Datos Verdadero o Falso:

        boolean dato1 = true;
        System.out.println("Esto es un tipo de dato booleano que es verdadero: " + dato1);
        boolean dato2 = false;
        System.out.println("Esto es un tipo de dato booleano que es falso: " + dato2);

        //Datos de texto o caracteres:

        char dato3 = 'a';
        System.out.println("Esto es un tipo de dato que solo admite un carácter (char): " + dato3);
        String dato4 = "Hola Mundo";
        System.out.println("ESto es un tipo de dato que contiene una cadena de texto: " + dato4);

    }
}