
/**
 * Write a description of class Estudiante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    int promedio;
    public Estudiante(int promedio, String nombre, int edad){
        super(nombre, edad);
        this.promedio = promedio;
    }
    
    public String presentarse(){
        return "Hola soy " + nombre + " tengo " + edad + " anios y promedio de: " + promedio; 
    }
    
    
}
