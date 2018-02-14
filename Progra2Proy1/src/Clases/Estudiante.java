package Clases;
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
    public int cantidadLibrosPrestados(int cantidadLibros, String accion){
        
           resultado = librosprestado+cantidadLibros; 
           
           
          return resultado;   
        //cantidadLibrosalmacenada=cantidadLibrosalmacenada+cantidadLibros;
        /*if(accion.equalsIgnoreCase("Entregar Libro")){
            
            return librosprestado=librosprestado-cantidadLibros;
            
        }else if(accion.equalsIgnoreCase("Solicitar Libro")){
           return librosprestado=librosprestado+cantidadLibros;
        }else{
            return cantidadLibros;
        }*/

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
