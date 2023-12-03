
package proyectofinaled;


public class ProyectoFinalED {

    public static void main(String[] args) {
       Empresa empresa=new Empresa();
       Pais aux=(Pais)empresa.getPaises().getPrimero().getDato();
       Sucursal aux2=(Sucursal)aux.getSucursales().getPrimero().getDato();
        System.out.println(aux2.getTrabajadores().Mostrar());
      
    }
    
}
