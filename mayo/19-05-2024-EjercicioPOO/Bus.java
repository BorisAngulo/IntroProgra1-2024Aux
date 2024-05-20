
/**
 * De los buses se conoce el nombre
 * de la linea, la ruta, el costo del pasaje b´asico y la recaudacin del dia.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bus extends Vehiculo{
    private String[] ruta;
    
    public Bus(String nombre, double pasajeBasico, String[] ruta){
        super(nombre, pasajeBasico);
        this.ruta = ruta;
    }
    
    public String[] getRuta(){
        return ruta;
    }
    
    public void recogerPasajero(){
        addRecaudacion(getPasajeBasico());
    }
    
    /**
     * @method metodo para saber si el bus lleva de un lugar X a un lugar Y
     * @param x lugar inicial
     * @param y lugar final.
     */
    @Override
    public boolean llevaRuta(String x, String y){
        boolean res = false;
        boolean bandera = false;
        for(String arr: ruta){
            if(arr.equals(x)){
                bandera = true;
            }
            if(bandera == true && arr.equals(y)){
                res = true;
            }
        }
        return res;
    }
}
