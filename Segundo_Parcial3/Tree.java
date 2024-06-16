import java.util.List;
import java.util.ArrayList;

public class Tree<T> {
    private List<Tree<T>> childs;
    private T data;
    private boolean isLastChild = false;
    
    public T getData() {
        return data;
    }
    
    public List<Tree<T>> getChilds() {
        return childs;
    }
    
    public void setIsLastChild(boolean value) {
        isLastChild = value;
    }
    
    public boolean getIsLastChild() {
        return isLastChild;
    }
    
    public Tree(T data) {
        this.data = data;
        this.childs = new ArrayList<>();
    }

    public Tree<T> addChild(T data) {
        Tree<T> newChild = new Tree<>(data);
        childs.add(newChild);
        return newChild;
    }
    
    public void mostrar() {
        System.out.println("xxxx El arbol es el siguiente: ");
        Cola<Tree<T>> colaAuxiliar = new Cola<Tree<T>>();
        System.out.println(data);
        
        for (int i = 0; i < childs.size(); i++) {
            if (i == childs.size() - 1) {
                childs.get(i).setIsLastChild(true);
            }
            colaAuxiliar.encolar(childs.get(i));
        }
        
        
        while(colaAuxiliar.obtenerLongitud() > 0) {
            Tree<T> frenteCola = colaAuxiliar.decolar();
            if (frenteCola == null) {
                break;
            }
            System.out.print(frenteCola.getData() + " ");
            
            for (int i = 0; i < frenteCola.getChilds().size(); i++) {
                if ((i == frenteCola.getChilds().size() - 1) && frenteCola.getIsLastChild() == true) {
                    frenteCola.getChilds().get(i).setIsLastChild(true);
                }
                colaAuxiliar.encolar(frenteCola.getChilds().get(i));
            }
            
            if (frenteCola.getIsLastChild()) {
                System.out.print("\n");
            }
        }
        
    }
}