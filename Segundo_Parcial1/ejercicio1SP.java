//
public class ejercicio1SP
{
    public MergeSort mergeSort;
    
    public static String[][] ordenar(String args[]){
        //String aux[] = {"a","b","c","a","c","a","b"};
        
        String arr[] = args;
        mostrarInput(arr);
        
        // Primero ordenar la lista en orden descendente
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);
        
        // Inicializas la lista de muniecas
        ListaSE<Doll> listaDolls = new ListaSE();
        
        // Iterar sobre cada elemento del array de entrada y crear muniecas en base a eso
        for (int i = 0; i < arr.length; i++) {
            int dollIndex = 0;
            boolean shouldCreateDoll = true;
            while (dollIndex < listaDolls.longitud()) {
                Doll doll = listaDolls.acceder(dollIndex);
                if (doll.canIInsert(arr[i])) {
                    doll.insertDollPart(arr[i]);
                    shouldCreateDoll = false;
                    break;
                }
                dollIndex++;
            }
            if (shouldCreateDoll == true) {
                Doll newDoll = new Doll();
                newDoll.insertDollPart(arr[i]);
                listaDolls.insertar(newDoll);
            }
        }
        
        // Al final tengo mi array de muniecas que van a ser pilas cada una.
        String[][] resultadoConvertido = convertirMuniecas(listaDolls);
        mostrarResultado(resultadoConvertido);
        return resultadoConvertido;
    }
    
    public static String[][] convertirMuniecas(ListaSE<Doll> muniecas) {
        String result[][] = new String[muniecas.longitud()][];
        for(int i = 0; i < muniecas.longitud(); i++) {
            Doll munieca = muniecas.acceder(i);
            int muniecaLength = munieca.dollParts.getLength();
            String parts[] = new String[muniecaLength];
            for (int j = 0 ; j < muniecaLength; j++) {
                parts[j] = munieca.dollParts.pop();
            }
            result[i] = parts;
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
    
    
    public static void mostrarResultado(String[][] arr) {
        System.out.println("\n RESULTADO FINAL: ");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr[i].length; j++) {
                if (j == 0) {
                    System.out.print("[ ");
                }
                System.out.print(arr[i][j] + " ");
                if (j == arr[i].length - 1) {
                    System.out.print("]");
                }
            }
        }
    }
}
