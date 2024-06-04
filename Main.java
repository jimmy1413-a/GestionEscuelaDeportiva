

public class Main
{
    public static void main (String [] args){
        Fecha fecha1 = new Fecha(1,4,2013);
        Competencia c1 = new Competencia("atletismo","choco",fecha1);
        
        //Alumno
        Alumno alum1 = new Alumno("juan",12,"masculino");
        Alumno alum2 = new Alumno("jose",16,"masculino");
        Alumno alum3 = new Alumno("alejandro",15,"masculino");
        Alumno alum4 = new Alumno("erica",13,"femenino");
        
        
        //deportes
        
        Deporte deport1 = new Deporte("tenis");
        Deporte deport2 = new Deporte("futbol");
        Deporte deport3 = new Deporte("cricket");
        
        //agregar deportes a alumnos
        
        alum1. agregarDeporte(deport1);
        alum1. agregarDeporte(deport2);
        alum1. agregarDeporte(deport3);
        alum2. agregarDeporte(deport1);
        alum2. agregarDeporte(deport2);
        alum3. agregarDeporte(deport3);
        alum4. agregarDeporte(deport3);
        
        //mostrar deportes
        System.out.println("los alumnos son: " + "\n");
        System.out.println(alum1.toString());
        
        System.out.println(alum2.toString());
        
        System.out.println(alum3.toString());
        
        System.out.println(alum4.toString());
        
        //Entrenadores
        
        Entrenador entrenador1 = new Entrenador("raul","cardio");
        Entrenador entrenador2 = new Entrenador("andres","gimnasia");
        Entrenador entrenador3 = new Entrenador("felipe","baile");
        
        //crear equipos
        
        Equipo equipo1 = new Equipo("LOS LOCOS","NOSE",entrenador1);
        Equipo equipo2 = new Equipo("AZULES","NOSE",entrenador1);
        Equipo equipo3 = new Equipo("INVALIDOS","NOSE",entrenador2);
        Equipo equipo4 = new Equipo("GENSHIN","NOSE",entrenador3);
        
        
        //agregar alumnos a equipos
        
        equipo1.agregarAlumno(alum1);
        equipo2.agregarAlumno(alum2);
        equipo3.agregarAlumno(alum1);
        equipo4.agregarAlumno(alum3);
        equipo4.agregarAlumno(alum4);
        
        
        //agregar equipos en una competencia
        
        
        c1. agregarEquipo(equipo1);
        c1. agregarEquipo(equipo2);
        c1. agregarEquipo(equipo4);
        //agregar equipo a entrenador
        
        entrenador1.agregarEquipo(equipo1);
        entrenador1.agregarEquipo(equipo2);
        entrenador2.agregarEquipo(equipo3);
        entrenador3.agregarEquipo(equipo4);
        //mostrar equipos en una competencia
        System.out.println("las competencias y sus equipos son: " + "\n");
        System.out.println(c1.toString());
         
        //mostrar info entrenador y relacion con equipos
        
        System.out.println("los entrenadores y sus equipos son: " + "\n");
        
         System.out.println(entrenador1.toString());
         System.out.println(entrenador2.toString());
         System.out.println(entrenador3.toString());
         
        
    }
}
