
/**
 * Write a description of class Carro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carro{
    private int capacidad;
    private int basuraActual;
    private int basuraEntregada;
    private boolean lleno;
    public Carro(int capacidad){
        this.capacidad = capacidad;
        this.basuraActual = 0;
        this.basuraEntregada = 0;
        this.lleno = false;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    
    public boolean getLleno(){
        return lleno;
    }
    
    public int getBasuraEntregada(){
        return basuraEntregada;
    }
    
    public int getBasuraActual(){
        return basuraActual;
    }
    
    public String cargar(int cantidadBasura){
        String res = "";
        int ayudin = 0;
        //CantidadBasura = 700, basuraActual = 800, capacidad = 1000, ayudin = 200
        if(cantidadBasura + basuraActual >= capacidad){
            ayudin = capacidad - basuraActual;
            basuraActual += ayudin;
            res = "Basura recogida " + ayudin + ", carro lleno";
        }else{
            basuraActual += cantidadBasura;
            res = "Basura recogida " + cantidadBasura; 
        }
        return res;
    }
    
    public String entregar(Botadero botadero){
        String res = "";
        if(botadero.getAbierto()){
            basuraEntregada+= basuraActual;
            res = "Se hizo la entrega,Cantidad " + basuraActual + " . Carro vacío";
            basuraActual = 0;
            
        }else{
            res = "No se hizo la entrega";
        }
        return res;
    }
    
}
    