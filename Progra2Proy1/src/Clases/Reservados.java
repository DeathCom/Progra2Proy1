package Clases;
public class Reservados {
    private String nombreLibro;
    private String disponibles;
    private Reservados anterior;
    private Reservados siguente;

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(String disponibles) {
        this.disponibles = disponibles;
    }

    public Reservados getAnterior() {
        return anterior;
    }

    public void setAnterior(Reservados anterior) {
        this.anterior = anterior;
    }

    public Reservados getSiguente() {
        return siguente;
    }

    public void setSiguente(Reservados siguente) {
        this.siguente = siguente;
    }
    
    
}
