
package proyectofinaled;


public class Empleado {
    private String nombre;
    private long ventas;

    public Empleado(String nombre, long ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }
public Empleado(String nombre) {
        this.nombre = nombre;
        this.ventas = 0;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getVentas() {
        return ventas;
    }

    public void setVentas(long ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", ventas=" + ventas + '}';
    }
    
}
