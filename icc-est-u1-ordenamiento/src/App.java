public class App {
    public static void main(String[] args) throws Exception {
        int [] original = {5,6,4,1,2,3};
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
}
