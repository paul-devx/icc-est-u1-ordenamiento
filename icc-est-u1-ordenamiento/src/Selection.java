public class Selection {

    public void sort(int[] arreglo){
        int cambios = 0;
        int comparaciones = 0;
        for (int i =0; i<arreglo.length; i++){
           // System.out.println( + cambios );
            int min = i;
            for (int j=i+1; j<arreglo.length; j++)
                if (arreglo[j]<arreglo[min]){
                    min = j;
                    comparaciones++;
                }
            if (min != i){
                System.out.println("Pasada= " + i + " | " + "Cambio " +arreglo[i] + " <-> " + arreglo[min]);
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
                cambios++;
            }
        }
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Ordenado Asc: ");
    }
}

