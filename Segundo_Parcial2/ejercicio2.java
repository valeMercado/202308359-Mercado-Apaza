public class ejercicio2
{
    public static ListaCSE<Integer> listaCSE;
    
    public static ListaCSE<Integer> setList(int[] lista){
        listaCSE = new ListaCSE<Integer>();
        for(int i = 0; i < lista.length;i++){
            listaCSE.insertar(lista[i]);
        }
        return listaCSE;
    }
    
    public static ListaCSE<Integer> swap (int[] lista, int firstIndex,int secondIndex) {
        ListaCSE<Integer> listaCSE = setList(lista);
        listaCSE.swap(firstIndex,secondIndex);
        return listaCSE;
    }
    
    public static String[] print() {
        System.out.println(listaCSE);
        String[] result = convertirLista(listaCSE);
        mostrarInput(result);
        return result;
    }
    
    public static String[] convertirLista(ListaCSE<Integer> lista) {
        int size = lista.longitud();
        String[] result = new String[size];
         for(int i = 0; i < size ; i++){
            result[i] = lista.acceder(i).toString();
        }
        return result;
    }
    
    public static void mostrarInput(String[] arr) {
        System.out.println("\n ENTRADA: ");
        for(int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[ ");
            }
            System.out.print(arr[i] + " ");
            if (i == arr.length - 1) {
                System.out.print("]");
            }
        }
    }
}
