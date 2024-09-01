public class Main {
    public static void main(String[] args) {

        // Declaración de variables
        int numero = 5;

        // Tipo de variables
        // boolean
        boolean verdadero = true;
        boolean falso = false;

        // int
        int numeroInt = 100;

        // long
        long numeroLong = 12566754L;

        // float
        float numeroFloat = 6.465F;

        // double
        double numeroDouble = 4343.3434343D;

        // byte;
        byte numeroByte = 127;

        // short
        short numeroShort = 32757;

        // char
        char leta = 'A';

        // String
        String saludo = "Hola mundo!";


        // Variables final
        final int edad = 21; // Declaramos la variable
        // edad = 18; Esto da error, ya que no se puede modificar una variable final

        // Podemos declarar una variable final
        final int diaSemana;
        // Luego le podemos asignar un valor
        diaSemana = 31;
        // Luego de asignarle un valor, esta variable final no se puede modificar
        // diaSemana = 20; Da error


        // Variables primitivas y objetos
        int numero1 = 10; // Esta es una variable primitiva
        String nombre = "Salvador"; // Este es un objeto


        // Variables nulas
        String a = null;
        Integer b = null;
        // int c = null; Da error, un tipo primitivo no puede ser un valor nulo
    }
}
