package Clases;
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
    
    public void cantidadLibrosPrestados(){
        //Codigo pendiente.
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
