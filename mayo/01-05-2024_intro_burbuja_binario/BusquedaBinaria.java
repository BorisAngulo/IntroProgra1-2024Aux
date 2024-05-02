
/**
 * Write a description of class Busqueda_Binaria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BusquedaBinaria
{
    int [] array;
    
    public BusquedaBinaria(int[] array){
        this.array = array;
    }
    //Devuelve el indice del array
    public int buscar(int num){
        int bajo = 0;
        int alto = array.length - 1;

        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;

            if (array[medio] == num) {
                return medio; // num encontrado, devuelve indice
            } else if (array[medio] < num) {
                bajo = medio + 1; // Buscar en la mitad derecha
            } else {
                alto = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // num no encontrado
    }
}
