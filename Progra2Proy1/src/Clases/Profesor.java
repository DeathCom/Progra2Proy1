package Clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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

    public String getCodigoMarca() {
        return codigoMarca;
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
