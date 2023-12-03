package proyectofinaled;

public class Lista_Doble {

    private Nodo_Doble primero;
    private Nodo_Doble ultimo;
    private int tamanio;

    public Lista_Doble() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public Nodo_Doble getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo_Doble primero) {
        this.primero = primero;
    }

    public Nodo_Doble getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo_Doble ultimo) {
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

    public void InsertarPrimero(Object dato) {
        if (Vacia()) {
            primero = ultimo = new Nodo_Doble(dato);
        } else {
            Nodo_Doble nuevo = new Nodo_Doble(dato, primero, null);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
        tamanio++;
    }

    public void InsertarUltimo(Object dato) {
        if (Vacia()) {
            primero = ultimo = new Nodo_Doble(dato);
        } else {
            Nodo_Doble nuevo = new Nodo_Doble(dato, null, ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public String PrimeroUltimo() {
        String l = "";
        if (!Vacia()) {
            Nodo_Doble aux = primero;
            while (aux != null) {
                l += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return l;
    }

    public String UltimoPrimero() {
        String l = "";
        if (!Vacia()) {
            Nodo_Doble aux = ultimo;
            while (aux != null) {
                l += aux.getDato() + "\n";
                aux = aux.getAnterior();
            }
        }
        return l;
    }

    public void EliminarPrimero() {
        if (!Vacia()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                primero = primero.getSiguiente();
                primero.setAnterior(null);
            }
            tamanio--;
        }
    }

    public void EliminarUltimo() {
        if (!Vacia()) {
            if (primero == ultimo) {
                primero = ultimo = null;
            } else {
                ultimo = ultimo.getAnterior();
                ultimo.setSiguiente(null);
            }
            tamanio--;
        }
    }

    public boolean Buscar(Object dato) {
        if (!Vacia()) {
            Nodo_Doble aux = primero;
            while (aux != null) {
                if (dato.getClass().equals(aux.getDato().getClass())) {
                    if (dato.equals(aux.getDato())) {
                        return true;
                    }
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }
  

}
