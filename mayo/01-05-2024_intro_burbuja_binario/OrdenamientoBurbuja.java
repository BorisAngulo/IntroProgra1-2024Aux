
/**
 * Write a description of class OrdenamientoBurbuja here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrdenamientoBurbuja
{
    private int[] array;
    public OrdenamientoBurbuja(int[] array){
        this.array = array;
    }
    public String toString(){
        String res="[";
        for(int arr: array){
            res += arr+",";
        }
        return res+"]";
    }
    public int[] ordenar(){
        int aux;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i; j < array.length; j++ ){
                if(array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;
    }
}
