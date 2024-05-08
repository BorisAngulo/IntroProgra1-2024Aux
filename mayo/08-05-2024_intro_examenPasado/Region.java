
/**
 * Write a description of class Region here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Region
{
    private char color;
    private int poblacion;
    private int infectados;
    private boolean region;
    public Region(int poblacion, int infectados){
        this.color = 'B';
        this.poblacion = poblacion;
        this.infectados = infectados;
        this.region = true;
    }
    
    public Region(){
        this.region = false;
    }
    
    public int getInfectados(){
        return infectados;
    }
    
    public int getPoblacion(){
        return poblacion;
    }
    
    public char getColor(){
        return color;
    }
    
    public boolean getRegion(){
        return region;
    }
    
    public void setInfectados(int infectados){
        this.infectados = infectados;
    }
    
    public void setPoblacion(int poblacion){
        this.poblacion = poblacion;
    }
    
    public void setColor(char color){
        this.color = color;
    }
}
