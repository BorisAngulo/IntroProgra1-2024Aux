
/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administracion{
    private double basuraEntregada;
    private double basuraNoEntregada;
    public Administracion(){
        basuraEntregada = 0.0;
        basuraNoEntregada = 0.0;
    }
    
    public void registrar(Carro carro){
        if(carro.getBasuraEntregada() != 0){
            basuraEntregada += carro.getBasuraEntregada();
        }else{
            basuraNoEntregada += carro.getBasuraActual();
        }
    }
    
    public String estadisticas(){
        String res = "";
        double porcentajeEntregado = 100.0*(basuraEntregada /(basuraEntregada+basuraNoEntregada)) ;
        double porcentajeNoEntregado = (double)(basuraNoEntregada /(basuraEntregada+basuraNoEntregada)) * 100;
        res = "Porcentaje de basura entregada a los botaderos es igual a : " + porcentajeEntregado + "%"
            + "\nPorcentaje de basura no entregada a los botaderos es igual a: " + porcentajeNoEntregado + "%";
        return res;
    }
}
