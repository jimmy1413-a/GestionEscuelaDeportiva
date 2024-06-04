
import java.util.ArrayList;
public class Entrenador
{
    
    private String nombre,especialidad;
    private ArrayList<Equipo> equipos;
    
    public Entrenador(String nombre,String especialidad)
    {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.equipos = new ArrayList <> ();
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }
    
    
    @Override
     public String toString() {
        
        String resultado = "Nombre: " + nombre + "\n";
        resultado += "Especialidad: " + especialidad  + "\n";
        resultado += "Equipo al que esta acargo:\n";
        
        for (Equipo equipo : equipos) {
            resultado += "- " + equipo.getNombre() +"\n"+ "con una cantidad de alumnos de: " + equipo.cantidadAlumnos()+ "\n";
        }
        return resultado;
    }
}
