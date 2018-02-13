package Clases;
import javax.swing.JOptionPane;
/*Almacena y maneja el comportamiento de las otras clases*/
public class MasterClass {
    private Estudiante obInicialEstud;
    private Estudiante obColaEstud;
    private Estudiante obTmpEstud;
    
    private Funcionario obInicialFun;
    private Funcionario obColaFun;
    private Funcionario obTmpFun;
    
    private Profesor obInicialProf;
    private Profesor obColaProf;
    private Profesor obTmpProf;
    
    private Autor obInicialAut;
    private Autor obColaAut;
    private Autor obTmpAut;
    
    private Libro obInicialLib;
    private Libro obColaLib;
    private Libro obTmpLib;
    
    //Inicio metodos para Clase Estudiante
    //##########################################################################
    public Estudiante llenarE(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String numeroCarnet, String carreraCursando, 
               String estatus, Estudiante anterior, Estudiante siguente){
        Estudiante Temp = new Estudiante();
        Temp.setNombre(nombre);
        Temp.setApellido(apellido);
        Temp.setDireccionCorreo(direccionCorreo);
        Temp.setTelefono(telefono);
        Temp.setSede(sede);
        
        Temp.setNumeroCarnet(numeroCarnet);
        Temp.setCarreraCursando(carreraCursando);
        Temp.setEstatus(estatus);
        Temp.setAnterior(anterior);
        Temp.setSiguente(siguente);
        return Temp;
    }
    public void guardarE(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String numeroCarnet, String carreraCursando, 
               String estatus){
        if(obInicialEstud==null){
            obInicialEstud = llenarE(nombre,apellido,direccionCorreo,telefono,
                    sede,numeroCarnet,carreraCursando,estatus, null, null);
            obColaEstud = obInicialEstud;
            obTmpEstud = obInicialEstud;
        }else{
            obColaEstud.setSiguente(llenarE(nombre,apellido,direccionCorreo,telefono,
                    sede,numeroCarnet,carreraCursando,estatus,obColaEstud, obInicialEstud));
            obColaEstud = obColaEstud.getSiguente();
            obInicialEstud.setAnterior(obColaEstud);
        }
    }
    public Estudiante siguenteE(){
        if(obTmpEstud.getSiguente()==null){
            return obTmpEstud;
        }else{
            obTmpEstud = obTmpEstud.getSiguente();
            return obTmpEstud;
        }
    }
    public Estudiante anteriorE(){
        if(obTmpEstud.getAnterior()==null){
            return obTmpEstud;
        }else{
            obTmpEstud = obTmpEstud.getAnterior();
            return obTmpEstud;
        }
    }
    public Estudiante primeroE(){
        return obInicialEstud;
    }
    public Estudiante ultimoE(){
        return obColaEstud;
    }
    public void eliminarE(String nombre){
        if(obInicialEstud==null){
            JOptionPane.showMessageDialog(null, "Primero debe cargar datos");
        }else{
            if(obInicialEstud==obColaEstud && nombre.equalsIgnoreCase(obInicialEstud.getNombre())){
                obInicialEstud=null;
                obColaEstud=null;
            }else if(nombre.equalsIgnoreCase(obInicialEstud.getNombre())){
                Estudiante tempAnterior = new Estudiante();
                tempAnterior=obTmpEstud.getAnterior();
                obTmpEstud=obTmpEstud.getSiguente();
                obInicialEstud=obTmpEstud;
                obTmpEstud.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpEstud);
            }else if(nombre.equalsIgnoreCase(obColaEstud.getNombre())){
                Estudiante tempAnterior = new Estudiante();
                tempAnterior=obColaEstud.getAnterior();
                obTmpEstud=obColaEstud.getSiguente();
                obColaEstud=tempAnterior;
                obTmpEstud.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpEstud);
            }else{
                Estudiante tempAnterior = new Estudiante();
                obTmpEstud=obInicialEstud;
                
                while(obTmpEstud.getSiguente() != obInicialEstud){
                    if(nombre.equalsIgnoreCase(obTmpEstud.getNombre())){
                       tempAnterior=obTmpEstud.getAnterior();
                       obTmpEstud=obTmpEstud.getSiguente();
                       obTmpEstud.setAnterior(tempAnterior);
                       tempAnterior.setSiguente(obTmpEstud);
                    }else{
                        obTmpEstud=obTmpEstud.getSiguente();
                    }
                }
            }
        }
    }
    public void modificarE(String nombre,String apellido, String direccionCorreo,String telefono, 
            String sede, String numeroCarnet, String carreraCursando, String estatus){
        obTmpEstud=obInicialEstud;
        do{
            if(nombre.equalsIgnoreCase(obTmpEstud.getNombre())){
                obTmpEstud.setApellido(apellido);
                obTmpEstud.setDireccionCorreo(direccionCorreo);
                obTmpEstud.setTelefono(telefono);
                obTmpEstud.setSede(sede);
                obTmpEstud.setNumeroCarnet(numeroCarnet);
                obTmpEstud.setCarreraCursando(carreraCursando);
                obTmpEstud.setEstatus(estatus);
                break;
            }
            obTmpEstud=obTmpEstud.getSiguente();
        }while(obTmpEstud != obInicialEstud);
    }
    public Estudiante buscarE(String buscar){
        obTmpEstud=obInicialEstud;
        Estudiante ob = new Estudiante();
        do{
            if(obTmpEstud.getNombre().equalsIgnoreCase(buscar)){
                ob = obTmpEstud;
            }
            obTmpEstud=obTmpEstud.getSiguente();
        }while(obTmpEstud != obInicialEstud);
        return ob;
    }
    //Inicio metodos para Clase Funcionario
    //##########################################################################
    public Funcionario llenarF(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String numeroEmpleado, String puesto, 
               String departamento, Funcionario anterior, Funcionario siguente){
        Funcionario Temp = new Funcionario();
        Temp.setNombre(nombre);
        Temp.setApellido(apellido);
        Temp.setDireccionCorreo(direccionCorreo);
        Temp.setTelefono(telefono);
        Temp.setSede(sede);
        
        Temp.setNumeroEmpleado(numeroEmpleado);
        Temp.setPuesto(puesto);
        Temp.setDepartamento(departamento);
        Temp.setAnterior(anterior);
        Temp.setSiguente(siguente);
        return Temp;
    }
    public void guardarF(String nombre, String apellido, String direccionCorreo, 
            String telefono, String sede, String numeroEmpleado, String puesto, 
               String departamento){
        if(obInicialFun==null){
            obInicialFun = llenarF(nombre, apellido, direccionCorreo,telefono, 
                    sede, numeroEmpleado, puesto,departamento, null, null);
            obColaFun = obInicialFun;
            obTmpFun = obInicialFun;
        }else{
            obColaFun.setSiguente(llenarF(nombre, apellido, direccionCorreo,telefono, 
                    sede, numeroEmpleado, puesto,departamento,obColaFun, obInicialFun));
            obColaFun = obColaFun.getSiguente();
            obInicialFun.setAnterior(obColaFun);
        }
    }
    public Funcionario siguenteF(){
        if(obTmpFun.getSiguente()==null){
            return obTmpFun;
        }else{
            obTmpFun = obTmpFun.getSiguente();
            return obTmpFun;
        }
    }
    public Funcionario anteriorF(){
        if(obTmpFun.getAnterior()==null){
            return obTmpFun;
        }else{
            obTmpFun = obTmpFun.getAnterior();
            return obTmpFun;
        }
    }
    public Funcionario primeroF(){
        return obInicialFun;
    }
    public Funcionario ultimoF(){
        return obColaFun;
    }
    public void eliminarF(String nombre){
        if(obInicialFun==null){
            JOptionPane.showMessageDialog(null, "Primero debe cargar datos");
        }else{
            if(obInicialFun==obColaFun && nombre.equalsIgnoreCase(obInicialFun.getNombre())){
                obInicialFun=null;
                obColaFun=null;
            }else if(nombre.equalsIgnoreCase(obInicialFun.getNombre())){
                Funcionario tempAnterior = new Funcionario();
                tempAnterior=obTmpFun.getAnterior();
                obTmpFun=obTmpFun.getSiguente();
                obInicialFun=obTmpFun;
                obTmpFun.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpFun);
            }else if(nombre.equalsIgnoreCase(obColaFun.getNombre())){
                Funcionario tempAnterior = new Funcionario();
                tempAnterior=obColaFun.getAnterior();
                obTmpFun=obColaFun.getSiguente();
                obColaFun=tempAnterior;
                obTmpFun.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpFun);
            }else{
                Funcionario tempAnterior = new Funcionario();
                obTmpFun=obInicialFun;
                
                while(obTmpFun.getSiguente() != obInicialFun){
                    if(nombre.equalsIgnoreCase(obTmpFun.getNombre())){
                       tempAnterior=obTmpFun.getAnterior();
                       obTmpFun=obTmpFun.getSiguente();
                       obTmpFun.setAnterior(tempAnterior);
                       tempAnterior.setSiguente(obTmpFun);
                    }else{
                        obTmpFun=obTmpFun.getSiguente();
                    }
                }
            }
        }
    }
    public void modificarF(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String numeroEmpleado, String puesto, 
               String departamentos){
        obTmpFun=obInicialFun;
        do{
            if(nombre.equalsIgnoreCase(obTmpFun.getNombre())){
                obTmpFun.setApellido(apellido);
                obTmpFun.setDireccionCorreo(direccionCorreo);
                obTmpFun.setTelefono(telefono);
                obTmpFun.setSede(sede);
                obTmpFun.setNumeroEmpleado(numeroEmpleado);
                obTmpFun.setPuesto(puesto);
                obTmpFun.setDepartamento(departamentos);
                break;
            }
            obTmpFun=obTmpFun.getSiguente();
        }while(obTmpFun != obInicialFun);
    }
    public Funcionario buscarF(String buscar){
        obTmpFun=obInicialFun;
        Funcionario ob = new Funcionario();
        do{
            if(obTmpFun.getNombre().equalsIgnoreCase(buscar)){
                ob = obTmpFun;
            }
            obTmpFun=obTmpFun.getSiguente();
        }while(obTmpFun != obInicialFun);
        return ob;
    }
    //Inicio metodos para Clase Profesor
    //##########################################################################
    public Profesor llenarP(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String codigoMarca, 
               String cantidadCursosqueImparte, Profesor anterior, Profesor siguente){
        Profesor Temp = new Profesor();
        Temp.setNombre(nombre);
        Temp.setApellido(apellido);
        Temp.setDireccionCorreo(direccionCorreo);
        Temp.setTelefono(telefono);
        Temp.setSede(sede);
        
        Temp.setCodigoMarca(codigoMarca);
        Temp.setCantidadCursosqueImparte(cantidadCursosqueImparte);
        Temp.setAnterior(anterior);
        Temp.setSiguente(siguente);
        return Temp;
    }
    public void guardarP(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String codigoMarca, String cantidadCursosqueImparte){
        if(obInicialProf==null){
            obInicialProf = llenarP(nombre, apellido, direccionCorreo,telefono, 
                    sede,codigoMarca,cantidadCursosqueImparte, null, null);
            obColaProf = obInicialProf;
            obTmpProf = obInicialProf;
        }else{
            obColaProf.setSiguente(llenarP(nombre, apellido, direccionCorreo,telefono, 
                    sede,codigoMarca,cantidadCursosqueImparte,obColaProf, obInicialProf));
            obColaProf = obColaProf.getSiguente();
            obInicialProf.setAnterior(obColaProf);
        }
    }
    public Profesor siguenteP(){
        if(obTmpProf.getSiguente()==null){
            return obTmpProf;
        }else{
            obTmpProf = obTmpProf.getSiguente();
            return obTmpProf;
        }
    }
    public Profesor anteriorP(){
        if(obTmpProf.getAnterior()==null){
            return obTmpProf;
        }else{
            obTmpProf = obTmpProf.getAnterior();
            return obTmpProf;
        }
    }
    public Profesor primeroP(){
        return obInicialProf;
    }
    public Profesor ultimoP(){
        return obColaProf;
    }
    public void eliminarP(String nombre){
        if(obInicialProf==null){
            JOptionPane.showMessageDialog(null, "Primero debe cargar datos");
        }else{
            if(obInicialProf==obColaProf && nombre.equalsIgnoreCase(obInicialProf.getNombre())){
                obInicialProf=null;
                obColaProf=null;
            }else if(nombre.equalsIgnoreCase(obInicialProf.getNombre())){
                Profesor tempAnterior = new Profesor();
                tempAnterior=obTmpProf.getAnterior();
                obTmpProf=obTmpProf.getSiguente();
                obInicialProf=obTmpProf;
                obTmpProf.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpProf);
            }else if(nombre.equalsIgnoreCase(obColaProf.getNombre())){
                Profesor tempAnterior = new Profesor();
                tempAnterior=obColaProf.getAnterior();
                obTmpProf=obColaProf.getSiguente();
                obColaProf=tempAnterior;
                obTmpProf.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpProf);
            }else{
                Profesor tempAnterior = new Profesor();
                obTmpProf=obInicialProf;
                
                while(obTmpProf.getSiguente() != obInicialProf){
                    if(nombre.equalsIgnoreCase(obTmpProf.getNombre())){
                       tempAnterior=obTmpProf.getAnterior();
                       obTmpProf=obTmpProf.getSiguente();
                       obTmpProf.setAnterior(tempAnterior);
                       tempAnterior.setSiguente(obTmpProf);
                    }else{
                        obTmpProf=obTmpProf.getSiguente();
                    }
                }
            }
        }
    }
    public void modificarP(String nombre, String apellido, String direccionCorreo, 
               String telefono, String sede, String codigoMarca, 
               String cantidadCursosqueImparte){
        obTmpProf=obInicialProf;
        do{
            if(nombre.equalsIgnoreCase(obTmpProf.getNombre())){
                obTmpProf.setApellido(apellido);
                obTmpProf.setDireccionCorreo(direccionCorreo);
                obTmpProf.setTelefono(telefono);
                obTmpProf.setSede(sede);
                obTmpProf.setCodigoMarca(codigoMarca);
                obTmpProf.setCantidadCursosqueImparte(cantidadCursosqueImparte);
                break;
            }
            obTmpProf=obTmpProf.getSiguente();
        }while(obTmpProf != obInicialProf);
    }
    public Profesor buscarP(String buscar){
        obTmpProf=obInicialProf;
        Profesor ob = new Profesor();
        do{
            if(obTmpProf.getNombre().equalsIgnoreCase(buscar)){
                ob = obTmpProf;
            }
            obTmpProf=obTmpProf.getSiguente();
        }while(obTmpProf != obInicialProf);
        return ob;
    }
     //Inicio metodos para Clase Autor
    //##########################################################################
    public Autor llenarA(String nombre, String apellido, String direccionCorreo, 
            String telefono, String sede, String nacionalidad, String autorEstaVivo, 
            String cantidadLibrosPublicados, Autor anterior, Autor siguente){
        Autor Temp = new Autor();
        Temp.setNombre(nombre);
        Temp.setApellido(apellido);
        Temp.setDireccionCorreo(direccionCorreo);
        Temp.setTelefono(telefono);
        Temp.setSede(sede);
        
        Temp.setNacionalidad(nacionalidad);
        Temp.setAutorEstaVivo(autorEstaVivo);
        Temp.setCantidadLibrosPublicados(cantidadLibrosPublicados);
        Temp.setAnterior(anterior);
        Temp.setSiguente(siguente);
        return Temp;
    }
    public void guardarA(String nombre, String apellido, String direccionCorreo, 
            String telefono, String sede, String nacionalidad, String autorEstaVivo, 
            String cantidadLibrosPublicados){
        if(obInicialAut==null){
            obInicialAut = llenarA(nombre, apellido, direccionCorreo,telefono, 
                    sede, nacionalidad, autorEstaVivo, cantidadLibrosPublicados, null, null);
            obColaAut = obInicialAut;
            obTmpAut = obInicialAut;
        }else{
            obColaAut.setSiguente(llenarA(nombre, apellido, direccionCorreo,telefono, 
                    sede, nacionalidad, autorEstaVivo, cantidadLibrosPublicados,obColaAut, obInicialAut));
            obColaAut = obColaAut.getSiguente();
            obInicialAut.setAnterior(obColaAut);
        }
    }
    public Autor siguenteA(){
        if(obTmpAut.getSiguente()==null){
            return obTmpAut;
        }else{
            obTmpAut = obTmpAut.getSiguente();
            return obTmpAut;
        }
    }
    public Autor anteriorA(){
        if(obTmpAut.getAnterior()==null){
            return obTmpAut;
        }else{
            obTmpAut = obTmpAut.getAnterior();
            return obTmpAut;
        }
    }
    public Autor primeroA(){
        return obInicialAut;
    }
    public Autor ultimoA(){
        return obColaAut;
    }
    public void eliminarA(String nombre){
        if(obInicialAut==null){
            JOptionPane.showMessageDialog(null, "Primero debe cargar datos");
        }else{
            if(obInicialAut==obColaAut && nombre.equalsIgnoreCase(obInicialAut.getNombre())){
                obInicialAut=null;
                obColaAut=null;
            }else if(nombre.equalsIgnoreCase(obInicialAut.getNombre())){
                Autor tempAnterior = new Autor();
                tempAnterior=obTmpAut.getAnterior();
                obTmpAut=obTmpAut.getSiguente();
                obInicialAut=obTmpAut;
                obTmpAut.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpAut);
            }else if(nombre.equalsIgnoreCase(obColaAut.getNombre())){
                Autor tempAnterior = new Autor();
                tempAnterior=obColaAut.getAnterior();
                obTmpAut=obColaAut.getSiguente();
                obColaAut=tempAnterior;
                obTmpAut.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpAut);
            }else{
                Autor tempAnterior = new Autor();
                obTmpAut=obInicialAut;
                
                while(obTmpAut.getSiguente() != obInicialAut){
                    if(nombre.equalsIgnoreCase(obTmpAut.getNombre())){
                       tempAnterior=obTmpAut.getAnterior();
                       obTmpAut=obTmpAut.getSiguente();
                       obTmpAut.setAnterior(tempAnterior);
                       tempAnterior.setSiguente(obTmpAut);
                    }else{
                        obTmpAut=obTmpAut.getSiguente();
                    }
                }
            }
        }
    }
    public void modificarA(String nombre, String apellido, String direccionCorreo, 
            String telefono, String sede, String nacionalidad, String autorEstaVivo, 
            String cantidadLibrosPublicados){
        obTmpAut=obInicialAut;
        do{
            if(nombre.equalsIgnoreCase(obTmpAut.getNombre())){
                obTmpAut.setApellido(apellido);
                obTmpAut.setDireccionCorreo(direccionCorreo);
                obTmpAut.setTelefono(telefono);
                obTmpAut.setSede(sede);
                obTmpAut.setNacionalidad(nacionalidad);
                obTmpAut.setAutorEstaVivo(autorEstaVivo);
                obTmpAut.setCantidadLibrosPublicados(cantidadLibrosPublicados);
                break;
            }
            obTmpAut=obTmpAut.getSiguente();
        }while(obTmpAut != obInicialAut);
    }
    public Autor buscarA(String buscar){
        obTmpAut=obInicialAut;
        Autor ob = new Autor();
        do{
            if(obTmpAut.getNombre().equalsIgnoreCase(buscar)){
                ob = obTmpAut;
            }
            obTmpAut=obTmpAut.getSiguente();
        }while(obTmpAut != obInicialAut);
        return ob;
    }
    //Inicio metodos para Clase Libro
    //##########################################################################
    public Libro llenarL(String nombreLibro, String autor, String fechaPublicacion, 
            String editorial, String cantidadLibrosDisponibles, Libro anterior, Libro siguente){
        Libro Temp = new Libro();
        Temp.setNombreLibro(nombreLibro);
        Temp.setAutor(autor);
        Temp.setFechaPublicacion(fechaPublicacion);
        Temp.setEditorial(editorial);
        Temp.setCantidadLibrosDisponibles(cantidadLibrosDisponibles);
        Temp.setAnterior(anterior);
        Temp.setSiguente(siguente);
        return Temp;
    }
    public void guardarL(String nombreLibro, String autor, String fechaPublicacion, 
            String editorial, String cantidadLibrosDisponibles){
        if(obInicialLib==null){
            obInicialLib = llenarL(nombreLibro, autor, fechaPublicacion, editorial, 
                    cantidadLibrosDisponibles, null, null);
            obColaLib = obInicialLib;
            obTmpLib = obInicialLib;
        }else{
            obColaLib.setSiguente(llenarL(nombreLibro, autor, fechaPublicacion, editorial, 
                    cantidadLibrosDisponibles,obColaLib, obInicialLib));
            obColaLib = obColaLib.getSiguente();
            obInicialLib.setAnterior(obColaLib);
        }
    }
    public Libro siguenteL(){
        if(obTmpLib.getSiguente()==null){
            return obTmpLib;
        }else{
            obTmpLib = obTmpLib.getSiguente();
            return obTmpLib;
        }
    }
    public Libro anteriorL(){
        if(obTmpLib.getAnterior()==null){
            return obTmpLib;
        }else{
            obTmpLib = obTmpLib.getAnterior();
            return obTmpLib;
        }
    }
    public Libro primeroL(){
        return obInicialLib;
    }
    public Libro ultimoL(){
        return obColaLib;
    }
    public void eliminarL(String nombreLibro){
        if(obInicialLib==null){
            JOptionPane.showMessageDialog(null, "Primero debe cargar datos");
        }else{
            if(obInicialLib==obColaLib && nombreLibro.equalsIgnoreCase(obInicialLib.getNombreLibro())){
                obInicialLib=null;
                obColaLib=null;
            }else if(nombreLibro.equalsIgnoreCase(obInicialLib.getNombreLibro())){
                Libro tempAnterior = new Libro();
                tempAnterior=obTmpLib.getAnterior();
                obTmpLib=obTmpLib.getSiguente();
                obInicialLib=obTmpLib;
                obTmpLib.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpLib);
            }else if(nombreLibro.equalsIgnoreCase(obColaLib.getNombreLibro())){
                Libro tempAnterior = new Libro();
                tempAnterior=obColaLib.getAnterior();
                obTmpLib=obColaLib.getSiguente();
                obColaLib=tempAnterior;
                obTmpLib.setAnterior(tempAnterior);
                tempAnterior.setSiguente(obTmpLib);
            }else{
                Libro tempAnterior = new Libro();
                obTmpLib=obInicialLib;
                
                while(obTmpLib.getSiguente() != obInicialLib){
                    if(nombreLibro.equalsIgnoreCase(obTmpLib.getNombreLibro())){
                       tempAnterior=obTmpLib.getAnterior();
                       obTmpLib=obTmpLib.getSiguente();
                       obTmpLib.setAnterior(tempAnterior);
                       tempAnterior.setSiguente(obTmpLib);
                    }else{
                        obTmpLib=obTmpLib.getSiguente();
                    }
                }
            }
        }
    }
    public void modificarL(String nombreLibro, String autor, String fechaPublicacion, 
            String editorial, String cantidadLibrosDisponibles){
        obTmpLib=obInicialLib;
        do{
            if(nombreLibro.equalsIgnoreCase(obTmpLib.getNombreLibro())){
                obTmpLib.setAutor(autor);
                obTmpLib.setFechaPublicacion(fechaPublicacion);
                obTmpLib.setEditorial(editorial);
                obTmpLib.setCantidadLibrosDisponibles(cantidadLibrosDisponibles);
                break;
            }
            obTmpLib=obTmpLib.getSiguente();
        }while(obTmpLib != obInicialLib);
    }
    public Libro buscarL(String buscar){
        obTmpLib=obInicialLib;
        Libro ob = new Libro();
        do{
            if(obTmpLib.getNombreLibro().equalsIgnoreCase(buscar)){
                ob = obTmpLib;
            }
            obTmpLib=obTmpLib.getSiguente();
        }while(obTmpLib != obInicialLib);
        return ob;
    }
    
 //Fin de MasterClass
}
