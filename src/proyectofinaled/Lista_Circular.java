package proyectofinaled;


public class Lista_Circular {

    private Nodo_C primero;
    private Nodo_C ultimo;
    private int tamanio;

    public Lista_Circular() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public Nodo_C getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo_C primero) {
        this.primero = primero;
    }

    public Nodo_C getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo_C ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean Vacia() {
        return primero == null && ultimo == null;
    }

    public void Insertar_Primero(Object dato) {
        if (Vacia()) {
            primero = ultimo = new Nodo_C(dato, primero);
        } else {
            primero = new Nodo_C(dato, primero);
        }
        ultimo.setSiguiente(primero);
        tamanio++;
    }

    public void Insertar_Ultimo(Object dato) {
        if (Vacia()) {
            primero = ultimo = new Nodo_C(dato, primero);
        } else {
            Nodo_C nuevo = new Nodo_C(dato, primero);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamanio++;
    }


    public void Eliminar_Primero() {
        if (!Vacia()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                primero = primero.getSiguiente();
                ultimo.setSiguiente(primero);
            }
            tamanio--;
        }
    }

    public void Eliminar_Ultimo() {
        if (!Vacia()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                Nodo_C aux = primero;
                while (aux.getSiguiente() != ultimo) {
                    aux = aux.getSiguiente();
                }
                ultimo = aux;
                ultimo.setSiguiente(primero);
            }
            tamanio--;
        }
    }

    public String Mostrar() {
        String lista = "";
        if (!Vacia()) {
            Nodo_C aux = primero;
            do {
                lista += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            } while (aux != primero);
        }
        return lista;
    }

}
