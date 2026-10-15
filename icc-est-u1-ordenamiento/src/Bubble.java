public class Bubble {

    public int[] sort(int [] arreglo){
        for (int i=0; i<arreglo.length; i++){
            for (int j=1; j<arreglo.length; j++){
                //Ordenar
                if (arreglo[j-1] > arreglo[j]){
                    //Intercambio i-j
                    int aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return null;
    }
}
