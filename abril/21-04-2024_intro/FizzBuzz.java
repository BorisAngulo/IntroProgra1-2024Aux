
/**
 * imprimir numeros del 1 al 100
 * si es multiplo de 3 imprimira fizz
 * si es multiplo de 5 imprimira buzz
 * si es multiplo de 3 y 5 imprimira fizzBuzz
 */
public class FizzBuzz{
    public void imprimirFizzBuzz(int posicion){
        for(int i = 1; i <= posicion; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
