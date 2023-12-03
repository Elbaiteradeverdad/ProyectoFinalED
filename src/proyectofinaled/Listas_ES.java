package proyectofinaled;

public class Listas_ES {

    private Nodo_ES primero;
    private Nodo_ES ultimo;
    private int tamanio;

    public Listas_ES() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public Nodo_ES getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo_ES primero) {
        this.primero = primero;
    }

    public Nodo_ES getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo_ES ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean Vacio() {
        return primero == null && ultimo == null;
    }

    public void Insertar_Primero(Object dato) {
        Nodo_ES nuevo = new Nodo_ES(dato);
        if (Vacio()) {
            primero = ultimo = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        }
        tamanio++;
    }

    public void Insertar_Ultimo(Object dato) {
        Nodo_ES nuevo = new Nodo_ES(dato, null);
        if (Vacio()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public String Mostrar() {
        String m = "";
        Nodo_ES aux = primero;
        for (int i = 1; i <= tamanio; i++) {
            m += aux.getDato() + " ";
            aux = aux.getSiguiente();
        }
        return m;
    }

    public void Eliminar_Primero() {
        if (primero == ultimo) {
            primero = ultimo = null;
        } else {
            primero = primero.getSiguiente();
        }
        tamanio--;
    }

    public void Eliminar_Ultimo() {
        Nodo_ES aux = primero;
        while (aux.getSiguiente() != ultimo) {
            aux = aux.getSiguiente();
        }
        ultimo = aux;
        ultimo.setSiguiente(null);
        tamanio--;
    }


}

