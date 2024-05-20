import java.util.ArrayList;
/**
 * Write a description of class Transfer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transfer{
    Vehiculo[] vehiculos;
    public Transfer(Vehiculo[] vehiculos){
        this.vehiculos = vehiculos;
    }
    
    /**
     * @method registra las ganancias del dia totales de todos los vehiculos
     * @return retorna la ganancia total en bolivianos
     */
    public double registrarGanancias(){
        double ganancia = 0;
        for(Vehiculo v: vehiculos){
            ganancia += v.getRecaudacionDia();
        }
        return ganancia;
    }
    
    /**
     * @method metodo para saber que vehiculos tienen una ruta con
     * lugar X a un lugar Y
     * @param x lugar inicial
     * @param y lugar final.
     * @return lista de vehiculos que cumplen con esa ruta
     */
    public ArrayList<Vehiculo> llevaRuta(String x, String y){
        ArrayList<Vehiculo> vr = new ArrayList<>();
        for(Vehiculo v: vehiculos){
            if(v.llevaRuta(x, y)){
                vr.add(v);
            }
        }
        return vr;
    }
}
