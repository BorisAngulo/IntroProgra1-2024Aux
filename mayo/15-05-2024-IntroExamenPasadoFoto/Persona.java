
/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona{
    protected String nombre;
    protected int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String presentarse(){
        return "Hola soy " + nombre + " y tengo " + edad + " anios";
    }
}
