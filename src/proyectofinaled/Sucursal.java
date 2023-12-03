package proyectofinaled;

public class Sucursal {

    private String lugar;
    private Listas_ES trabajadores;

    public Sucursal(String lugar, Listas_ES trabajadores) {
        this.lugar = lugar;
        this.trabajadores = trabajadores;
    }

    public Sucursal(String lugar) {
        String[] nombres = {"Joseph", "Josephina", "Robert", "Roberta", "Kyle",
            "Kyla", "Antonio", "Antonia", "Louis", "Louisa", "Stephan",
            "Stephania", "Stephanie", "Brian", "Brianna", "George", "Georgia",
            "Felix", "Felicia", "Claude", "Claudia", "Alexander", "Alexandra",
            "Eric", "Erica", "Simon", "Simone", "Simona", "Andrew", "Andrea",
            "Carl", "Carla", "Philip", "Philippa"};
        this.lugar = lugar;
        int numeroTrabajadores = (int) (Math.random() * 50 + 30);
        for (int i = 0; i < numeroTrabajadores; i++) {
            int seleccionNombre = (int) (Math.random() * nombres.length);
            Empleado empleado = new Empleado(nombres[seleccionNombre]);
            this.trabajadores.Insertar_Primero(empleado);
        }
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Listas_ES getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Listas_ES trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "lugar=" + lugar + ", trabajadores=" + trabajadores + '}';
    }

}
