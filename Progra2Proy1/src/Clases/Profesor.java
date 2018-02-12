package Clases;
/*La clase PROFESOR debe contener los datos de código de marca, 
cantidad de cursos que imparte.*/
public class Profesor extends Persona{
    private String codigoMarca; 
    private String cantidadCursosqueImparte;
    private Profesor siguente;
    private Profesor anterior;

    /*public Profesor(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String codigoMarca, 
               String cantidadCursosqueImparte) {
        super(nombre, apellido, direccionCorreo, telefono, sede);
        this.codigoMarca = codigoMarca;
        this.cantidadCursosqueImparte = cantidadCursosqueImparte;
    }*/

    public String getCodigoMarca() {
        return codigoMarca;
    }
    
    public void cantidadLibrosPrestados(){
        //Codigo pendiente.
    }

    public void setCodigoMarca(String codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getCantidadCursosqueImparte() {
        return cantidadCursosqueImparte;
    }

    public void setCantidadCursosqueImparte(String cantidadCursosqueImparte) {
        this.cantidadCursosqueImparte = cantidadCursosqueImparte;
    }

    public Profesor getSiguente() {
        return siguente;
    }

    public void setSiguente(Profesor siguente) {
        this.siguente = siguente;
    }

    public Profesor getAnterior() {
        return anterior;
    }

    public void setAnterior(Profesor anterior) {
        this.anterior = anterior;
    }
    
}
