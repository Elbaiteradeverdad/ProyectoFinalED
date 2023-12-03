
package proyectofinaled;

public class Pais {
    private String nombre;
    private Lista_Circular sucursales;

    public Pais(String nombre, Lista_Circular sucursales) {
        this.nombre = nombre;
        this.sucursales = sucursales;
    }
    public Pais(String nombre) {
        this.nombre = nombre;
        this.sucursales=new Lista_Circular();
        int ale=(int)(Math.random()*30+20);
        for (int i = 0; i < ale; i++) {
            Sucursal sucursal=new Sucursal("Lugar "+i);
        this.sucursales.Insertar_Ultimo(sucursal);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista_Circular getSucursales() {
        return sucursales;
    }

    public void setSucursales(Lista_Circular sucursales) {
        this.sucursales = sucursales;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", sucursales=" + sucursales + '}';
    }
    
    
}
