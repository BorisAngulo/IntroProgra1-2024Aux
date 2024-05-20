
/**
 * una empresa de transporte p´ublico, que tiene una flota 
 * de t´axis y una variedad de l´ıneas de buses. Los t´axis tienen 
 * un nombre que los identifica ( por ejemplo: Rojo 100), una ubicacin actual,
 * el costo de pasaje b´asico, el costo adicional por persona, el estado 
 * (ocupado/libre) y la recaudacin del dia. De los buses se conoce el nombre
 * de la linea, la ruta, el costo del pasaje b´asico y la recaudacin del dia.
 * Los buses debido a que se tiene un costo ´unico se recoge pasajeros de 
 * uno en uno, pero los t´axis pueden recoger a uno o a muchos pasajeros. 
 * Los veh´ıculos deber´ıan poder indicar si pueden llevar a un pasajero de X a Y.
 * La ruta se considera como una secuencia ordenada de lugares que se puede visitar.
 * La empresa deseaautomatizar algunos de sus procesos, 
 * mismos que se detallan a continuacin:
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehiculo
{
    private String nombre;
    private double pasajeBasico;
    private double recaudacionDia;
    
    public Vehiculo(String nombre, double pasajeBasico){
        this.nombre = nombre;
        this.pasajeBasico = pasajeBasico;
        this.recaudacionDia = 0.0;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPasajeBasico(){
        return pasajeBasico;
    }
    
    public double getRecaudacionDia(){
        return recaudacionDia;
    }
    
    public void addRecaudacion(double recaudacion){
        this.recaudacionDia += recaudacion;
    }
    
    public boolean llevaRuta(String x, String y){
        return false;
    }
}
