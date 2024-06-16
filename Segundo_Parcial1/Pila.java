public class Pila<T> implements Coleccion<T>{
    private T       tope;
    private Pila<T> base;
    private int length;
    
    public Pila(){
        tope = null;
        base = null;
    }
    
    private Pila(T tope, Pila<T> base){
        this.tope = tope;
        this.base = base;
    }
    
    public boolean vacia(){
        return tope == null;
    }
    
    public void push(T dato){
        if(vacia()){
            tope = dato;
            base = new Pila<T>();
        }else{
            base = new Pila(tope, base);
            tope = dato;
        }
        length++;
    }
    
    public T pop(){
        T dato;
        if(vacia()){
            dato = null;
        }else{
            dato = tope;
            tope = base.tope;
            base = base.base;
        }
        length--;
        return dato;
    }
    
    public T top(){
        return tope;
    }
    
    public int getLength() {
        return length;
    }
}