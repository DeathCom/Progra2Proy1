package Clases;

import javax.swing.JOptionPane;

public class DataSolicitudes {
    private Solicitudes obInicial;
    private Solicitudes obCola;
    private Solicitudes obTmp;
    
    private Reservados obInicialReserva;
    private Reservados obColaReserva;
    private Reservados obTmpReserva;
    
    //Inicio metodos para Clase Estudiante
    //##########################################################################
    public Solicitudes llenar(String nombSolicitante, String nombLibro, String libAsignados,
            Solicitudes anterior, Solicitudes siguente){

        Solicitudes Temp = new Solicitudes();
        Temp.setNombSolicitante(nombSolicitante);
        Temp.setNombLibro(nombLibro);
        Temp.setLibAsignados(libAsignados);
        Temp.setAnterior(anterior);
        Temp.setSiguente(siguente);
        return Temp;
    }
    public void guardar(String nombSolicitante, String nombLibro, String libAsignados){
        if(obInicial==null){
            obInicial = llenar(nombSolicitante,nombLibro,libAsignados, null, null);
            obCola = obInicial;
            obTmp = obInicial;
        }else{
            obCola.setSiguente(llenar(nombSolicitante,nombLibro,libAsignados,
                    obCola, obInicial));
            obCola = obCola.getSiguente();
            obInicial.setAnterior(obCola);
        }
    }
    public Solicitudes siguente(){
        if(obTmp.getSiguente()==null){
            return obTmp;
        }else{
            obTmp = obTmp.getSiguente();
            return obTmp;
        }
    }
    public Solicitudes anterior(){
        if(obTmp.getAnterior()==null){
            return obTmp;
        }else{
            obTmp = obTmp.getAnterior();
            return obTmp;
        }
    }
    public Solicitudes primero(){
        return obInicial;
    }
    public Solicitudes ultimo(){
        return obCola;
    }
    public void eliminar(String nombre){
        if(obInicial==null){
            JOptionPane.showMessageDialog(null, "Primero debe cargar datos");
        }else{
            if(obInicial==obCola && nombre.equalsIgnoreCase(obInicial.getNombSolicitante())){
                obInicial=null;
                obCola=null;
            }else if(nombre.equalsIgnoreCase(obInicial.getNombSolicitante())){
                Solicitudes tempAnterior = new Solicitudes();
                tempAnterior=obTmp.getAnterior();
                obTmp=obTmp.getSiguente();
                obInicial=obTmp;
                obTmp.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmp);
            }else if(nombre.equalsIgnoreCase(obCola.getNombSolicitante())){
                Solicitudes tempAnterior = new Solicitudes();
                tempAnterior=obCola.getAnterior();
                obTmp=obCola.getSiguente();
                obCola=tempAnterior;
                obTmp.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmp);
            }else{
                Solicitudes tempAnterior = new Solicitudes();
                obTmp=obInicial;
                
                while(obTmp.getSiguente() != obInicial){
                    if(nombre.equalsIgnoreCase(obTmp.getNombSolicitante())){
                       tempAnterior=obTmp.getAnterior();
                       obTmp=obTmp.getSiguente();
                       obTmp.setAnterior(tempAnterior);
                       tempAnterior.setSiguente(obTmp);
                    }else{
                        obTmp=obTmp.getSiguente();
                    }
                }
            }
        }
    }
    public void modificar(String nombSolicitante, String nombLibro, String libAsignados){
        obTmp=obInicial;
        do{
            if(nombSolicitante.equalsIgnoreCase(obTmp.getNombSolicitante())){
                obTmp.setNombSolicitante(nombLibro);
                obTmp.setNombLibro(libAsignados);
                obTmp.setLibAsignados(libAsignados);
                break;
            }
            obTmp=obTmp.getSiguente();
        }while(obTmp != obInicial);
    }
    public Solicitudes buscar(String buscar){
        obTmp=obInicial;
        Solicitudes ob = new Solicitudes();
        do{
            if(obTmp.getNombSolicitante().equalsIgnoreCase(buscar)){
                ob = obTmp;
            }
            obTmp=obTmp.getSiguente();
        }while(obTmp != obInicial);
        return ob;
    }
    
    //Inicio metodos para Clase Reservados
    //##########################################################################
    public Reservados llenarR(String nombreLibro, String disponibles, Reservados anterior, Reservados siguente){

        Reservados Temp = new Reservados();
        Temp.setNombreLibro(nombreLibro);
        Temp.setDisponibles(disponibles);
        Temp.setAnterior(anterior);
        Temp.setSiguente(siguente);
        return Temp;
    }
    public void guardarR(String nombreLibro, String disponibles){
        if(obInicialReserva==null){
            obInicialReserva = llenarR(nombreLibro,disponibles, null, null);
            obColaReserva = obInicialReserva;
            obTmpReserva = obInicialReserva;
        }else{
            obColaReserva.setSiguente(llenarR(nombreLibro,disponibles,obColaReserva, obInicialReserva));
            obColaReserva = obColaReserva.getSiguente();
            obInicialReserva.setAnterior(obColaReserva);
        }
    }
    public Reservados siguenteR(){
        if(obTmpReserva.getSiguente()==null){
            return obTmpReserva;
        }else{
            obTmpReserva = obTmpReserva.getSiguente();
            return obTmpReserva;
        }
    }
    public Reservados anteriorR(){
        if(obTmpReserva.getAnterior()==null){
            return obTmpReserva;
        }else{
            obTmpReserva = obTmpReserva.getAnterior();
            return obTmpReserva;
        }
    }
    public Reservados primeroR(){
        return obInicialReserva;
    }
    public Reservados ultimoR(){
        return obColaReserva;
    }
    
    public void modificarR(String nombreLibro, String disponibles){
        Reservados obTmp = new Reservados();
        obTmpReserva=obInicialReserva;
        do{
            if(nombreLibro.equalsIgnoreCase(obTmpReserva.getNombreLibro())){
                obTmp.setNombreLibro(nombreLibro);
                obTmp.setDisponibles(disponibles);
                break;
            }
            obTmp=obTmp.getSiguente();
        }while(obTmp != obInicialReserva);
    }
    public Reservados buscarR(String buscar){
        obTmpReserva=obInicialReserva;
        Reservados ob = new Reservados();
        do{
            if(obTmpReserva.getNombreLibro().equalsIgnoreCase(buscar)){
                ob = obTmpReserva;
            }
            obTmpReserva=obTmpReserva.getSiguente();
        }while(obTmpReserva != obInicialReserva);
        return ob;
    }
    
}
