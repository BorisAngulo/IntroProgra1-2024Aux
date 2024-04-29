
/**
 * Dos números amigos son dos números enteros positivos distintos tales que 
 * la suma de los divisores propios de cada uno es igual al otro. 
 * Los divisores propios de un número incluyen la unidad pero no 
 * al propio número. Por ejemplo, los divisores propios de 220 
 * son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110. La suma de estos 
 * números equivale a 284. A su vez, los divisores 
 * propios de 284 son 1, 2, 4, 71 y 142. Su suma equivale a 220. 
 * Por tanto, 220 y 284 son amigos.
 */
public class NumerosAmigos{
    private int a;
    private int b;
    private int[] array;
    public NumerosAmigos(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public NumerosAmigos(int[] array){
        this.array = array;
    }
    
    public boolean sonAmigos(){
        boolean res = false;
        int sumaA = sumarDivisores(a);
        int sumaB = sumarDivisores(b);
        if(sumaA == b && sumaB == a) res = true;
        return res;
    }
    
    public void sonAmigosArray(){
        int guardador;
        int[] arraySumaDivisores = new int[array.length];
        //array[4,8,16,5,6,3,7, 220,284]
        //arraySumaDivisores[3,7,15,6,6,1,1,284,220]
        for(int i = 0; i < array.length; i++){
            arraySumaDivisores[i] = sumarDivisores(array[i]);
        }
        
        for(int i = 0; i < array.length; i++){// i = 7 arraSumaDivisores[i] = 284 array[i] = 220
            for(int j = 0; j < array.length; j++){// j = 8 array[j] = 284 arraSumaDivisores[j] = 220
                if(arraySumaDivisores[i] == array[j]){
                    if(arraySumaDivisores[j] == array[i]){
                        if(array[i] == array[j]){
                        }else{
                            System.out.println("Estos numeros son amigos: " + array[i] + " Y "+ array[j]);
                        }
                    }
                }
            }
        }
    }
      
    private int sumarDivisores(int num){
        int res = 0;

        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                res += i;
            }
        }
        return res;
    }
}
