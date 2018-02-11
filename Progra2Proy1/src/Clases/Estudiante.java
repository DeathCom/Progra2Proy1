package Clases;
/*La clase ESTUDIANTE debe tener los daos de número de carnet, carrera que está cursando 
y un estatus que indique si es estudiante activo (SI/NO).*/
public class Estudiante extends Persona{
    private String numeroCarnet;
    private String carreraCursando;
    private String estatus;

    public Estudiante(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String numeroCarnet, String carreraCursando, 
               String estatus) {
        super(nombre, apellido, direccionCorreo, telefono, sede);
        this.numeroCarnet = numeroCarnet;
        this.carreraCursando = carreraCursando;
        this.estatus = estatus;
    }
    
    public void cantidadLibrosPrestados(){
        //Codigo pendiente.
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
}
