public class Cola<T> implements Coleccion<T>{
    protected NodoDE<T> frente, fin;
    
    public Cola(){
        frente = fin = null;
    }
    
    public boolean vacia(){
        return frente == null;
    }
    
    public void encolar(T dato){
        NodoDE<T> p;
        p = new NodoDE<T>(dato);
        if(vacia()){
            frente = fin = p;
        }else{
            fin.setSuc(p);
            p.setAnt(fin);
            fin = p;
        }
    }
    
    public T decolar(){
        T dato;
        if(vacia()){
            dato = null;
        }else{
            dato = frente.getDato();
            frente = frente.getSuc();
            if(frente == null){
                fin = null;
            }else{
                frente.setAnt(null);
            }
        }
        return dato;
    }
    
    public T ver(){
        T dato;
        if(vacia()){
            dato = null;
        }else{
            dato = frente.getDato();
        }
        return dato;
    }
    
    public int obtenerLongitud() {
        int contador = 1;
        NodoDE<T> auxiliar = frente;
        while(fin != auxiliar) {
            auxiliar = auxiliar.getSuc();
            contador = contador + 1;
        }
        return contador;
    }
}