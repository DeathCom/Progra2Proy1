package Clases;
/*También se debe implementar una clase LIBRO que permita tener el registro de 
los libros que posee la biblioteca.
debe tener los datos nombre, autor, año de publicación, editorial y 
cantidad de libros que tiene la universidad y cantidad de libros que están disponibles. 
Se debe implementar métodos que nos permitan ingresar usuarios de todos los tipos, 
que nos permitan crear libros y que nos permitan el préstamo y devolución de libros.*/
public class Libro {
    private String nombreLibro;
    private String autor;
    private String fechaPublicacion;
    private String editorial;
    private String cantidadLibrosDisponibles;
    private Libro siguente;
    private Libro anterior;

    /*public Libro(String nombreLibro, String autor, String fechaPublicacion, String editorial, String cantidadLibrosDisponibles) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
        this.cantidadLibrosDisponibles = cantidadLibrosDisponibles;
    }*/

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCantidadLibrosDisponibles() {
        return cantidadLibrosDisponibles;
    }

    public void setCantidadLibrosDisponibles(String cantidadLibrosDisponibles) {
        this.cantidadLibrosDisponibles = cantidadLibrosDisponibles;
    }

    public Libro getSiguente() {
        return siguente;
    }

    public void setSiguente(Libro siguente) {
        this.siguente = siguente;
    }

    public Libro getAnterior() {
        return anterior;
    }

    public void setAnterior(Libro anterior) {
        this.anterior = anterior;
    }
}
