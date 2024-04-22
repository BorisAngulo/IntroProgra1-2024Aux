
public class Fibonacci{
    //1-1-2-3-5-8-13.....   VALOR
    //1-2-3-4-5-6-7 - 8 -9 POSICION
    //a1 = 1, a2 = 1                    i = 0
    //a1 = 1, a2 = 1                    i = 1
    //a1 = 1, a2 = 2                    i = 2
    //guardador= 2  a1 = 2, a2 = 3                    i = 3
    //guardador= 3  a1 = 3, a2 = 5                    i = 4
    //guardador= 5  a1 = 5, a2 = 8                    i = 5
    public int mostrarFibonacci(int posicion){
        int a1 = 1;
        int a2 = 1;
        int guardador;
        for(int i = 1; i <= posicion; i++){
            if(i == 1 || i == 2){
                System.out.println("posicion: " + i + " valor:" + a1);
            }else if (i == 3){
                a2 = 2;
                System.out.println("posicion: " + i + " valor:" + a2);
            }else{
                guardador = a2;
                a2 = a2 + a1;
                a1 = guardador;
                System.out.println("posicion: " + i + " valor:" + a2);
            }
            
        }
        return a2;
    }
    
    public int mostrar(int posicion){
        int a1 = 1;
        int a2 = 1;
        int guardador;
        for(int i = 1; i <= posicion; i++){
            if (i == 3){
                a2 = 2;
            }else if(i > 3){
                guardador = a2;
                a2 = a2 + a1;
                a1 = guardador;
            }
            
        }
        return a2;
    }
}