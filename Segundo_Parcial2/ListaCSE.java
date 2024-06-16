//
public class ListaCSE<T> implements Lista<T>
{
    private NodoSE<T> ini;

    public ListaCSE(){
        ini = null;
    }
    public boolean vacia(){
        return ini == null;
    }
     public void insertar(T dato){
        NodoSE<T> p,ult;
        p = new NodoSE<T>(dato);
        
        if(vacia()){
            ini = p;
            ini.setSuc(ini);
        }else{
            ult = getUlt(ini);
            ult.setSuc(p);
            p.setSuc(ini);
        }
    }
    private NodoSE<T> getUlt(NodoSE<T> a){
        NodoSE<T> res;
        if(a.getSuc() == ini){
            res = a;
        }else{
            res = getUlt(a.getSuc());
        }
        return res;
    }
    public NodoSE<T> buscar(NodoSE<T> q, int pos){
        NodoSE<T> nodo;
        if(pos == 0){
            nodo = q;
        }else{
            nodo = buscar(q.getSuc(), pos-1);
        }
        return nodo;
    } 
    public void reemplazar(int pos, T dato){
        NodoSE<T> q;
        if(!vacia()){
            q = buscar(ini, pos);
            q.setDato(dato);
        }
    }
    public void swap(int firstIndex, int secondIndex){
        int size = longitud();
        if(firstIndex >= size || secondIndex >= size || firstIndex < 0 || secondIndex < 0){
            return ;
        }
        if(vacia()){
            return;
        }
        NodoSE<T> firstNodo = buscar(ini, firstIndex);
        T firstNodoData = firstNodo.getDato();
        NodoSE<T> secondNodo = buscar(ini, secondIndex);
        T secondNodoData = secondNodo.getDato();
        reemplazar(firstIndex, secondNodoData);
        reemplazar(secondIndex, firstNodoData);
    }
     public int longitud(){
        int res;
        if(vacia()){
            res = 0;
        }else{
            res = contar(ini);
        }
        return res;
    }
    private int contar(NodoSE a){
        int res =0;
        if(a.getSuc()==ini){
            res = 1;
        }else{
            res = contar(a.getSuc()) +1;
        }
        return res;
    }
     public T acceder(int pos){
        NodoSE<T> aux;
        T res = null;
        if(!vacia()){
            aux = buscar(ini,pos);
            res = aux.getDato();
        }
        return res;
    }
    
    public String[] print() {
        String[] listaConvertida = convertirLista();
        mostrarInput(listaConvertida);
        return listaConvertida;
    }
    
    private String[] convertirLista() {
        int size = longitud();
        String[] result = new String[size];
         for(int i = 0; i < size ; i++){
            result[i] = acceder(i).toString();
        }
        return result;
    }
    
    private void mostrarInput(String[] arr) {
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
