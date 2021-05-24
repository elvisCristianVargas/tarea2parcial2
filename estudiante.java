
/**
 * Write a description of class estudainte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class estudiante
{
    private String nombre;
    private int nota;
    
    public estudiante() {
        nombre = "";
        nota = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
