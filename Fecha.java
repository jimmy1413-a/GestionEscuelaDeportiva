
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
     private int dia,mes,año;
     
     public Fecha(int dia,int mes,int año){
         this.dia = dia;
         this.mes = mes;
         this.año = año;
     }
     
     public int getDia(){
         return dia;
     }
     
     public int getMes(){
         return mes;
     }
     
     public int getAño(){
         return año;
     }
     
     @Override
     public String toString() {
         String date = "" + dia + "/" + mes + "/" + año ;
         return date;
    }
}