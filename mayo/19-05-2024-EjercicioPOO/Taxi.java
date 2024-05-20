
/**
 * Los t´axis tienen 
 * un nombre que los identifica ( por ejemplo: Rojo 100), una ubicacin actual,
 * el costo de pasaje b´asico, el costo adicional por persona, el estado 
 * (ocupado/libre) y la recaudacin del dia.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Taxi extends Vehiculo{
    private String ubicacionActual;
    private double costoAdicionalPersona;
    private boolean estado;
    public Taxi(String nombre, double pasajeBasico, String ubicacionActual,
                    double costoAdicionalPersona, boolean estado){
        super(nombre, pasajeBasico);
        this.ubicacionActual = ubicacionActual;
        this.costoAdicionalPersona = costoAdicionalPersona;
        this.estado = estado;
    }
    
    public String getUbicacionActual(){
        return ubicacionActual;
    }
    
    public double getCostoAdicionalPersona(){
        return costoAdicionalPersona;
    }
    
    public boolean estado(){
        return estado;
    }
    
    public void recogerPasajero(int personas){
        double recaudacion = getPasajeBasico() +(costoAdicionalPersona * personas);
        addRecaudacion(recaudacion);
        estado = false;
    }
    
    public void dejarPasajero(){
        estado = true;
    }
    
    @Override
    public boolean llevaRuta(String x, String y){
        return true;
    } 
}
