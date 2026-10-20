public class App {
    public static void main(String[] args) throws Exception {
        int [] original = {5,6,4,1,2,3};
        int [] b= original.clone();
        int [] c= original;
    //Usar el metodo del archivo (clase) Bubble
    //Instanciar archivo Bubble
    //Voy a ijstanciar la clase bubble
    Bubble bubble = new Bubble();
    //Ejecutar codigo del archivo Bubble uso la instamcia 
    printArreglo(b);
    bubble.sort(b);
    printArreglo(b);

    //Instanciar selection
    System.out.println("");
    System.out.println("---Selection--");
    Selection selection = new Selection();
    printArreglo(c);
    selection.sort(c);
    printArreglo(c);

    }

    public static void printArreglo(int [] arr){
        for ( int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" - ");
        System.out.println();
    }
}
