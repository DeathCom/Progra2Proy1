package Clases;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
/**Manejo de los grabados en los archivos*/
public class MasterArchivos {
    public void GuardarArchivo(Estudiante estudiante){
        try {
            FileWriter file = new FileWriter("Estudiantes.txt", true);
            BufferedWriter buffer = new BufferedWriter(file);
            PrintWriter printer = new PrintWriter(buffer);
            printer.print(estudiante.getNombre());
            printer.print(","+estudiante.getApellido());
            printer.print(","+estudiante.getDireccionCorreo());
            printer.print(","+estudiante.getTelefono());
            printer.print(","+estudiante.getSede());
            printer.print(","+estudiante.getNumeroCarnet());
            printer.print(","+estudiante.getCarreraCursando());
            printer.print(","+estudiante.getEstatus()+"\r\n");
            printer.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
    public void GuardarArchivo(Funcionario funcionario){
       try {
            FileWriter file = new FileWriter("Funcionarios.txt", true);
            BufferedWriter buffer = new BufferedWriter(file);
            PrintWriter printer = new PrintWriter(buffer);
            printer.print(funcionario.getNombre());
            printer.print(","+funcionario.getApellido());
            printer.print(","+funcionario.getDireccionCorreo());
            printer.print(","+funcionario.getTelefono());
            printer.print(","+funcionario.getSede());
            printer.print(","+funcionario.getNumeroEmpleado());
            printer.print(","+funcionario.getPuesto());
            printer.print(","+funcionario.getDepartamento()+"\r\n");
            printer.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
    public void GuardarArchivo(Profesor profesor){
        try {
            FileWriter file = new FileWriter("profesores.txt", true);
            BufferedWriter buffer = new BufferedWriter(file);
            PrintWriter printer = new PrintWriter(buffer);
            printer.print(profesor.getNombre());
            printer.print(","+profesor.getApellido());
            printer.print(","+profesor.getDireccionCorreo());
            printer.print(","+profesor.getTelefono());
            printer.print(","+profesor.getSede());
            printer.print(","+profesor.getCodigoMarca());
            printer.print(","+profesor.getCantidadCursosqueImparte()+"\r\n");
            printer.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
    public void GuardarArchivo(Autor autor){
        try {
            FileWriter file = new FileWriter("Autores.txt", true);
            BufferedWriter buffer = new BufferedWriter(file);
            PrintWriter printer = new PrintWriter(buffer);
            printer.print(autor.getNombre());
            printer.print(","+autor.getApellido());
            printer.print(","+autor.getDireccionCorreo());
            printer.print(","+autor.getTelefono());
            printer.print(","+autor.getSede());
            printer.print(","+autor.getNacionalidad());
            printer.print(","+autor.getCantidadLibrosPublicados());
            printer.print(","+autor.getAutorEstaVivo()+"\r\n");
            printer.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
    public void GuardarArchivo(Libro libro){
        try {
            FileWriter file = new FileWriter("Libros.txt", true);
            BufferedWriter buffer = new BufferedWriter(file);
            PrintWriter printer = new PrintWriter(buffer);
            printer.print(libro.getNombreLibro());
            printer.print(","+libro.getAutor());
            printer.print(","+libro.getFechaPublicacion());
            printer.print(","+libro.getEditorial());
            printer.print(","+libro.getCantidadLibrosDisponibles()+"\r\n");
            printer.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
