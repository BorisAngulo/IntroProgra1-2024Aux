
/**
 * Write a description of class Docente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Docente extends Persona
{
    String materia;
    public Docente(String materia, String nombre, int edad){
        super(nombre, edad);
        this.materia = materia;
        
        
    }
    
}
