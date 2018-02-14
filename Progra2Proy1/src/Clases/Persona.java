package Clases;
/*-Debe crear una clase PERSONA que debe tener los datos como nombre, apellido, 
dirección de correo, teléfono y sede. 
-En la super clase PERSONA se debe declarar un método abstracto que nos permita 
obtener la cantidad de libros prestados que tiene cada persona.*/
public abstract class Persona {
    private String nombre;
    private String apellido; 
    private String direccionCorreo;
    private String telefono;
    private String sede;

    /*public Persona(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccionCorreo = direccionCorreo;
        this.telefono = telefono;
        this.sede = sede;
    }*/
    
    public abstract int cantidadLibrosPrestados(int cantidadLibros, String accion);
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }    
}
