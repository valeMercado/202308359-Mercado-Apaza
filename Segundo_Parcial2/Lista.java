public interface Lista<T> extends Coleccion<T>
{
    boolean vacia();
    void insertar(T dato);
    NodoSE<T> buscar(NodoSE<T> q, int pos);
    void reemplazar(int pos, T dato);
    void swap(int firstIndex, int secondIndex);
    int longitud();
    T acceder(int pos);
    String[] print();
}