import java.util.*;
/**
 * Write a description of class Examen2_2021 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Examen2_2021{

    /**
     * Analizar e implementar la funcionalidad necesaria para; dado un texto,
     * eliminar todas aquellas palabras que tienen cualquier otra vocal diferente
     * a v, la intencionalidad es quedarse con palabras que solo tienen la vocal
     * v, de tal manera de quedarse con las palabras que formarian un Lipograma
     * de v
     *
     * @param v es una vocal
     * @param texto un texto 
     * @return    palabras del texto que solo contengan la vocal v
     */
    public String quitar(char v, String texto){
        
        return null;
    }
    
    public boolean esLipograma(String texto){
        
        return false;
    }
    
    /**
     * Analizar e implementar la funcionalidad decesaria para; dado un texto, 
     * seleccionar y clasificar las palabras que tienen solo una vocal y 
     * desechar aquellas que tienen mas de una vocal, sobre la base de esta 
     * clasificacion se pide formar el texto de mayor cantidad de palabras 
     * que sea un Lipograma.
     * 
     * Recuerda que se tienen 5 vocales por que el analisis de un texto puede
     * a lo sumo tener 5 grupos de clasificacion: las palabras que tiene
     * solo la 'a', las palabras que tiene solo la 'e', las palabras que tiene
     * solo la 'i', las palabras que tiene solo la 'o' y las palabras que tiene
     * solo la 'u'. Palabras que tienen mas de una vocal diferente no estan 
     * en algun grupo de clasificacion.
     */
    public String obtenerLipograma(String texto){
        texto = texto.toLowerCase();
        Map <Character, List<String>> palabraVocal = new HashMap<>();//List
        //{key1: value1,key2: value2,key3: value3,key5: value5}
        //{'a':ArrayList<String>,'e':ArrayList<String>,'i':ArrayList<String>,'o':ArrayList<String>,'u':ArrayList<String>}
        char[] vocalesChar = "aeiou".toCharArray();//{a,e,i,o,u}
        //llenar Mapa
        for(char vocal: vocalesChar){
            palabraVocal.put(vocal, new ArrayList<>());
        }
        
        //Diferenciar palabras con las vocales
        for(String palabra: texto.split(" ")){//"Hola mundo, mi nombre es Boris" == {"Hola", "mundo,", "mi", "nombre", "es", "Boris"}
            boolean soloUnaVocal = true;
            char vocal = ' ';
            
            for(char letra: palabra.toCharArray()){//"palabra" == {'p','a','l','a','b','r','a'}
                if("aeiou".indexOf(letra) >= 0){
                    if(vocal == ' ' || vocal == letra){
                        vocal = letra;
                    }else{
                        soloUnaVocal = false;
                        break;
                    }
                }
            }
            //key>a
            //value>List
            if(soloUnaVocal){
                palabraVocal.get(vocal).add(palabra);
            }
        }
        
        List<String> palabrasLipograma;
        int maxPalabras = 0;
        char vocalMax = ' ';
        //obtener la vocal que tenga mas palabras
        for(Map.Entry<Character, List<String>> entrada: palabraVocal.entrySet()){//{a,e,i,o,u}
            int numPalabras = entrada.getValue().size();
            if(numPalabras > maxPalabras){
                maxPalabras = numPalabras;
                vocalMax = entrada.getKey();//'e'
            }
        }
        
        palabrasLipograma = palabraVocal.get(vocalMax);
        String lipograma = "";
        if(palabrasLipograma != null){
            for(int i = 0; i < palabrasLipograma.size(); i++){
                lipograma += palabrasLipograma.get(i);
                if(i < palabrasLipograma.size() - 1){
                    lipograma += " ";
                }
                
            }
        }
        
        return lipograma;
    }
    
}
