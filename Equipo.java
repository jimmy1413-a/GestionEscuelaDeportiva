
import java.util.ArrayList;
public class Equipo
{

    private String nombre,categoria;
    private ArrayList<Alumno> alumnos;
    public Entrenador entrenador;
    public Equipo(String nombre,String categoria,Entrenador entrenador)
    {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }
    
    
    public String getCategoria(){
        return categoria;
    }
    
    public Entrenador getEntrenador(){
        return entrenador;
    }
    
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    
    public int cantidadAlumnos(){
       return alumnos.size();
    }
}
