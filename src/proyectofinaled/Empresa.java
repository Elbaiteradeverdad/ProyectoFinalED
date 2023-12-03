package proyectofinaled;

public class Empresa {

    private String nombre;
    private Lista_Doble Paises;

    public Empresa(String nombre, Lista_Doble Paises) {
        this.nombre = nombre;
        this.Paises = Paises;
    }

    public Empresa() {
        this.nombre = "Industrias Wayne";
        this.Paises=new Lista_Doble();
        String []paises={"Argentina", "Bahamas", "Barbados", "Belice", "Bolivia", "Brasil", "Colombia", "Costa Rica", "Cuba", "Chile", "Dominica", "Ecuador", "El Salvador", "Granada", "Guatemala", "Guyana", "Haití", "Honduras", "Jamaica", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "República Dominicana", "San Cristóbal"};
        for (int i = 0; i < paises.length; i++) {
            Pais pais=new Pais(paises[i]);
        this.Paises.InsertarUltimo(pais);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista_Doble getPaises() {
        return Paises;
    }

    public void setPaises(Lista_Doble Paises) {
        this.Paises = Paises;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", Paises=" + Paises + '}';
    }

}
