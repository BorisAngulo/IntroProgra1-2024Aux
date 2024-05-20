
/**
 * Write a description of class EstudianteSanSimon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EstudianteSanSimon extends Estudiante
{
    private String codSis;
    /**
     * Constructor for objects of class EstudianteSanSimon
     */
    public EstudianteSanSimon(String codSis, int promedio, String nombre, int edad){
        
        super(promedio, nombre,edad);
        this.codSis = codSis;
    }
}
