package Clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*La clase ESTUDIANTE debe tener los daos de número de carnet, carrera que está cursando 
y un estatus que indique si es estudiante activo (SI/NO).*/
public class Estudiante extends Persona{
    private String numeroCarnet;
    private String carreraCursando;
    private String estatus;
    private Estudiante siguente;
    private Estudiante anterior;
    
    public int librosprestado, resultado;
    private String accion;

    /*public Estudiante(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String numeroCarnet, String carreraCursando, 
               String estatus) {
        super(nombre, apellido, direccionCorreo, telefono, sede);
        this.numeroCarnet = numeroCarnet;
        this.carreraCursando = carreraCursando;
        this.estatus = estatus;
    }*/
    
    @Override
    public String cantidadLibrosPrestados(String buscar){
        String busqueda=buscar, listo="";
        DataSolicitudes data = new DataSolicitudes(); 
        Solicitudes solicitud = new Solicitudes();
        String lineas;FileReader file = null;
        try {
            file = new FileReader("Reservaciones.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedReader b = new BufferedReader(file)) {
            while ((lineas = b.readLine()) != null) {
                String orden[] = lineas.split(",");
                solicitud.setNombSolicitante(orden[0]);
                solicitud.setNombLibro(orden[1]);
                solicitud.setLibAsignados(orden[2]);

                data.guardar(solicitud.getNombSolicitante(), solicitud.getNombLibro(),
                    solicitud.getLibAsignados());
                if(solicitud.getNombSolicitante().equalsIgnoreCase(busqueda)){
                    listo = solicitud.getLibAsignados();
                }                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listo;       
    }
    
    public String getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(String numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public String getCarreraCursando() {
        return carreraCursando;
    }

    public void setCarreraCursando(String carreraCursando) {
        this.carreraCursando = carreraCursando;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Estudiante getSiguente() {
        return siguente;
    }

    public void setSiguente(Estudiante siguente) {
        this.siguente = siguente;
    }

    public Estudiante getAnterior() {
        return anterior;
    }

    public void setAnterior(Estudiante anterior) {
        this.anterior = anterior;
    }
}
