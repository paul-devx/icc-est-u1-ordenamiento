import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        //Clase sobre Arrays
        runEjemplosObjetos();
        runComparators();

    }

    private static void runComparators() {
        Integer [] original = { 5, 6, 4, 1, 2, 3 };
        Arrays.sort(original);
        for (int i=0; i<original.length; i++){
            System.out.println(original[i] );
        }

        Arrays.sort(original, Comparator.reverseOrder());

        System.out.println("-----------------------------");
        for (int i=0; i<original.length; i++){
            System.out.println(original[i] );
        }

        Arrays.sort(original, Comparator.reverseOrder());
    }


    private static void runEjemplosObjetos() { 
        Estudiante e1  = new Estudiante("Juan", 4.5);
        Estudiante [] estudiantes = {e1, 
                                    new Estudiante("Maria", 7),     
                                    new Estudiante("Maria", 3.5), 
                                    new Estudiante("Pedro", 6.8),};
        Bubble bubble = new Bubble();
        //printArregloEstudiantes(estudiantes, "Arreglo original");
        bubble.sortEstudiantesName(estudiantes);
        printArregloEstudiantes(estudiantes, "Arreglo ordenado");
    }
    
    public static void printArreglo(int [] arr, String tittle) {
        System.out.println(tittle);
        for ( int i=0; i<arr.length; i++)
            System.out.println(arr[i]+" - ");
    }


    public static void runEjemplosPrimitivos() {
        int [] original = {5, 6, 4, 1,2,3};
        int [] b= original.clone();
        int [] c= original;
        int [] nums = {5,6,4,1,2,3};
        //int [] nums= {5,6,4,1,2,3};
        //Usar el metodo del archivo (clase) Bubble
        //Instanciar archivo Bubble
        //Voy a ijstanciar la clase bubble
        System.out.println("---Bubble--");
        Bubble bubble = new Bubble();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);
        System.out.println("-----------------------------");

        //Instanciar selection
        System.out.println("");
        System.out.println("---Selection--");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);
        System.out.println("-----------------------------");

        //Instanciar insertion sort 
        System.out.println("");
        System.out.println("---Selection Insertion--");
        InsertionSort insertionSort = new InsertionSort();
        printArreglo(nums);
        insertionSort.sort(nums);
        printArreglo(nums);
        System.out.println("-----------------------------"); 
    }

    public static void printArreglo(int [] arr){
            for ( int i=0; i<arr.length; i++)
                System.out.print(arr[i]+" - ");
            System.out.println();
    }

    public static void printArregloEstudiantes(Estudiante[] estudiantes, String title) {
        System.out.println(title);
        for (Estudiante e : estudiantes) {
            System.out.print(e+ " " );
            //System.out.println();
        }
        System.out.println();
        System.out.println("-----------------------------");
    }
}