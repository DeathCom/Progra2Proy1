package Clases;
public class Solicitudes {
    private String nombSolicitante;
    private String nombLibro;
    private String libAsignados;
    private Solicitudes anterior;
    private Solicitudes siguente;

    public String getNombSolicitante() {
        return nombSolicitante;
    }

    public void setNombSolicitante(String nombSolicitante) {
        this.nombSolicitante = nombSolicitante;
    }

    public String getNombLibro() {
        return nombLibro;
    }

    public void setNombLibro(String nombLibro) {
        this.nombLibro = nombLibro;
    }

    public String getLibAsignados() {
        return libAsignados;
    }

    public void setLibAsignados(String libAsignados) {
        this.libAsignados = libAsignados;
    }

    public Solicitudes getAnterior() {
        return anterior;
    }

    public void setAnterior(Solicitudes anterior) {
        this.anterior = anterior;
    }

    public Solicitudes getSiguente() {
        return siguente;
    }

    public void setSiguente(Solicitudes siguente) {
        this.siguente = siguente;
    }
}
