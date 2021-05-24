
/**
 * Write a description of class curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class curso
{
    int siguientePosLibre;
    int cantAprobados;
    int cantReprobados;
    int notaMasAlta;
    estudiante [] estudiantes;
    public curso(int cant){
        siguientePosLibre=0;
        cantAprobados=0;
        cantReprobados=0;
        notaMasAlta=0;       
        
        estudiantes = new estudiante[cant];
        for(int i=0; i<cant;i++){
            estudiantes[i] = new estudiante();
        }
    }
    
    public void aniadirNotas(String nombre, int nota){
        if(siguientePosLibre < estudiantes.length){
            estudiantes[siguientePosLibre].setNombre(nombre);
            estudiantes[siguientePosLibre].setNota(nota);
            siguientePosLibre++;
        }
    }
    
    public void mostrarArreglo(){
        for(int i = 0; i<estudiantes.length; i++){
            System.out.println(i+".- Nombre: "+estudiantes[i].getNomnbre()+" - Nota:"+estudiantes[i].getNota());
        }
    }
}
