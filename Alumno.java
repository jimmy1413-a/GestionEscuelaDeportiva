import java.util.ArrayList;

public class Alumno
{
    private String nombre;
    private int edad;
    private String genero;
    private ArrayList<Deporte> deportes;
    
    public Alumno(String nombre,int edad,String genero)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.deportes = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setEdad(int edad){
        this.edad= edad;
    }
    
     public void agregarDeporte(Deporte deporte) {
        deportes.add(deporte);
    }
    
    
    
    @Override
    public String toString() {
        
        String resultado = "Nombre: " + nombre + "\n";
        resultado += "Edad: " + edad + "\n";
        resultado += "Género: " + genero + "\n";
        resultado += "Deportes:\n";
        
        for (Deporte deporte : deportes) {
            resultado += "- " + deporte.getNombre() + "\n";
        }
        return resultado;
    }
}
