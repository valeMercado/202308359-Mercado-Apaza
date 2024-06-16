 
public class ListaSE<T> implements Lista<T>
{
    private T          ini;
    private ListaSE<T> sig;
    
    public ListaSE(){
        ini = null;
        sig = null;
    }
    
    public boolean vacia(){
        return ini == null;
    }
    
    public void insertar(T dato){
        if(vacia()){
            ini = dato;
            sig = new ListaSE<T>();
        }else{
            sig.insertar(dato);
        }
    }
    
    public void insertar(T dato, int pos){
        if(vacia()){
            if(pos == 0){
                ini = dato;
                sig = new ListaSE<T>();
            }
        }else{
            if(pos == 0){
                sig.insertar(ini, 0);
                ini = dato;
            }else{
                sig.insertar(dato, pos-1);
            }
        }
    }
    
    public void eliminar(int pos){
        if(!vacia()){
            if(pos == 0){
                ini = sig.ini;
                sig = sig.sig;
            }else{
                sig.eliminar(pos - 1);
            }
        }
    }
    
    public void eliminar(T dato){
        if(!vacia()){
            if(ini.equals(dato)){
                ini = sig.ini;
                sig = sig.sig;
            }else{
                sig.eliminar(dato);
            }
        }
    }
    
    public T acceder(int pos){
        T dato;
        if(vacia()){
            dato = null;
        }else{
            if(pos == 0){
                dato = ini;
            }else{
                dato = sig.acceder(pos-1);
            }
        }
        return dato;
    }
    
    public T acceder(T dato){
        T datoR;
        if(vacia()){
            datoR = null;
        }else{
            if(ini.equals(dato)){
                datoR = ini;
            }else{
                datoR = sig.acceder(dato);
            }
        }
        return datoR;
    }
    
    public Lista<T> invertir(){
        Lista<T> listaI;
        listaI = new ListaSE<T>();
        if(!vacia()){
            listaI = sig.invertir();
            listaI.insertar(ini);
        }
        return listaI;
    }
    
    public int longitud(){
        int longitud;
        if(vacia()){
            longitud = 0;
        }else{
            longitud = 1 + sig.longitud();
        }
        return longitud;
    }
    
    public boolean buscar(T dato){
        boolean existe;
        if(vacia()){
            existe = false;
        }else{
            if(ini.equals(dato)){
                existe = true;
            }else{
                existe = sig.buscar(dato);
            }
        }
        return existe;
    }
    
    public void vaciar(){
        ini = null;
        sig = null;
    }
    
    public T antecesor(T dato){
        T ant;
        if(vacia()){
            ant = null;
        }else{
            if(sig.vacia()){
                ant = null;
            }else{
                if(sig.ini.equals(dato)){
                    ant = ini;
                }else{
                    ant = sig.antecesor(dato);
                }
            }
        }
        return ant;
    }
    
    public T sucesor(T dato){
        T suc;
        if(vacia()){
            suc = null;
        }else{
            if(ini.equals(dato)){
                suc = sig.ini;
            }else{
                suc =  sig.sucesor(dato);
            }
        }
        return suc;
    }
    
    public void reemplazar(int pos, T dato){
        if(!vacia()){
            if(pos == 0){
                ini = dato;
            }else{
                sig.reemplazar(pos-1, dato);
            }
        }
    }
    
    public int indiceDe(T dato){
        int pos;
        if(vacia()){
            pos = -1;
        }else{
            if(ini.equals(dato)){
                pos = 0;
            }else{
                pos = sig.indiceDe(dato);
                if(pos != -1){
                    pos++;
                }
            }
        }
        return pos;
    }
    
    public void insertar(Lista<T> otra){
    }
}
