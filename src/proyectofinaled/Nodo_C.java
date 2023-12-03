package proyectofinaled;


public class Nodo_C {
    private Object dato;
    private Nodo_C siguiente;

    public Nodo_C(Object dato, Nodo_C siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo_C getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_C siguiente) {
        this.siguiente = siguiente;
    }
 
}
