
/**
 * Write a description of class IdentificadorRostros here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IdentificadorRostros
{
    private int[][] matriz;
    private int[][] m;
    public IdentificadorRostros(int [][] matriz){
        this.matriz = matriz;
        m = new int[3][3];
    }

    public int[][] reducirMatriz(){
        int var = matriz.length - 2;
        int sumatoria=0;
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){

                for(int i = a; i < var +a ;i++){
                    for(int j = b; j < var + b;j++){
                        sumatoria += matriz[i][j];
                    }
                }

                m[a][b] = sumatoria / (var*var);
                sumatoria = 0;
            }    
        }

        return m;
    }

    public double compararMatriz(){
        double promedioM = 0;
        int tamanioM = matriz.length;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                promedioM += matriz[i][j];
            } 
        }
        promedioM = promedioM / Math.pow(tamanioM, 2);
        
        double promedioMP = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                promedioMP += m[i][j];
            } 
        }
        promedioMP = promedioMP / Math.pow(3, 2);
        
        if(promedioMP >= promedioM){
            return Math.round((promedioM / promedioMP) * 100);
        }else{
            return Math.round((promedioMP / promedioM) * 100);
        }
    }
}
