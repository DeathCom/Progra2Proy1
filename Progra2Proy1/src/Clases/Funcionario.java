package Clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*La clase FUNCIONARIO debe contener los datos de número de empleado, 
puesto y departamento.*/
public class Funcionario extends Persona{
    private String numeroEmpleado;
    private String puesto; 
    private String departamento;
    private Funcionario siguente;
    private Funcionario anterior;

    /*public Funcionario(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String numeroEmpleado, String puesto, 
               String departamento) {
        super(nombre, apellido, direccionCorreo, telefono, sede);
        this.numeroEmpleado = numeroEmpleado;
        this.puesto = puesto;
        this.departamento = departamento;
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
    
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Funcionario getSiguente() {
        return siguente;
    }

    public void setSiguente(Funcionario siguente) {
        this.siguente = siguente;
    }

    public Funcionario getAnterior() {
        return anterior;
    }

    public void setAnterior(Funcionario anterior) {
        this.anterior = anterior;
    }
    
}
