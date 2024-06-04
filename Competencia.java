
import java.util.ArrayList;

public class Competencia
{
    private String nombre,lugar;
    private Fecha fecha;
    private ArrayList<Equipo> equipos;
    
    public Competencia(String nombre,String lugar,Fecha fecha)
    {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.equipos = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        
        String resultado = "Nombre de la competencia: " + nombre + "\n";
        resultado += "Fecha: " + fecha.toString()  + "\n";
        resultado += "Equipos:\n";
        
        for (Equipo equipo : equipos) {
            resultado += "- " + equipo.getNombre() +"\n"+ "con una cantidad de alumnos de: " + equipo.cantidadAlumnos()+"\n";
        }
        return resultado;
    }
    
    
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    


    
}
