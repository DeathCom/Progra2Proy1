package Clases;
/* La clase AUTOR debe contener los datos de nacionalidad, un estatus que nos 
indique si el autor esta vivo y la cantidad de libros publicados.*/
public class Autor extends Persona{
    private String nacionalidad;
    private String autorEstaVivo;
    private String cantidadLibrosPublicados;

    public Autor(String nacionalidad, String autorEstaVivo, 
            String cantidadLibrosPublicados, String nombre, String apellido, 
            String direccionCorreo, String telefono, String sede) {
        super(nombre, apellido, direccionCorreo, telefono, sede);
        this.nacionalidad = nacionalidad;
        this.autorEstaVivo = autorEstaVivo;
        this.cantidadLibrosPublicados = cantidadLibrosPublicados;
    }
    
    public void cantidadLibrosPrestados(){
        //Codigo pendiente.
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAutorEstaVivo() {
        return autorEstaVivo;
    }

    public void setAutorEstaVivo(String autorEstaVivo) {
        this.autorEstaVivo = autorEstaVivo;
    }

    public String getCantidadLibrosPublicados() {
        return cantidadLibrosPublicados;
    }

    public void setCantidadLibrosPublicados(String cantidadLibrosPublicados) {
        this.cantidadLibrosPublicados = cantidadLibrosPublicados;
    }
    
}
