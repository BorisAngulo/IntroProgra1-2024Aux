
/**
 * Write a description of class Ahorcado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ahorcado
{
    // instance variables - replace the example below with your own
    private int vidas;
    private String palabra;
    private String jugarPalabra = "";
    private char caracter = ' ';
    private char[] array;
    
    /**
     * Constructor for objects of class Ahorcado
     */
    public Ahorcado(int vidas, String palabra)
    {
        this.vidas = vidas;
        this.palabra = palabra;
        for(int i =0 ; i< palabra.length(); i++){
            jugarPalabra += " ";
            array = jugarPalabra.toCharArray();
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String jugar(char letra){
        String res = "";
        boolean acertado;
        acertado = comprobarLetra(letra);
        
        if(!acertado){
            vidas--;
            res = "Letra incorrecta, tienes vidas: " + vidas;
        }
        else{
            jugarPalabra = llenarPalabra(letra);
            if (palabra.equals(arrayToString(array))){
                res = "Felicidades, GANASTE, la palabra es: " + palabra;
            }else{
                res = "Letra correcta tu palabra tiene este estado: " + arrayToString(array);
            }
            
            
        }
        if(vidas < 0){
            res = "PERDISTE, la palabra era:" + palabra;
        }   
        return res;
    }
    
    private boolean estado(){
        if(palabra == arrayToString(array)){
            return true;
        }
        return false;
    }
    
    private boolean comprobarLetra(char letra){
        for(int i =0; i < palabra.length(); i++){
            if(palabra.charAt(i) == letra){
                return true;
            }
        }
        return false;
    }
    
    private String llenarPalabra(char letra){
        String res = "";
        for(int i =0 ; i< array.length; i++){
            if(palabra.charAt(i) == letra){
                array[i] = letra;
            }else{
                if(array[i] == ' '){
                    array[i] += ' ';
                }
                
            }
        }
        
        res = arrayToString(array);
        
        return res;
    }
    
    private String arrayToString(char[] array){
        String res = "";
        for(int i = 0; i < array.length; i++){
            res += array[i];
        }
        return res;
    }
    
    public int getVidas(){
        return vidas;
    }
    public String getPalabra(){
        return palabra;
    }
    public char getCaracter(){
        return caracter;
    }
    public void setVidas(int vidas){
        this.vidas = vidas;
    }
    public void setPalabra(String palabra){
        this.palabra = palabra;
    }
    public void setCaracter(char caracter){
        this.caracter = caracter;
    }
}
