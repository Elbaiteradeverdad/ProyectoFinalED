package proyectofinaled;

public class Nodo_ES {
    private Object dato;
    private Nodo_ES siguiente;

    public Nodo_ES(Object dato, Nodo_ES siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo_ES(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo_ES getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_ES siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo_ES{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }

   
    
    
}
