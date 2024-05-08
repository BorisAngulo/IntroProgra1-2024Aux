/**
 * Write a description of class Pais here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pais
{
    private Region[][] matrizPais;

    public Pais(Region[][] matrizPais){
        this.matrizPais = matrizPais;
    }

    public String generarMCalor(){
        for(int i = 0; i < matrizPais.length; i++) {
            for (int j = 0; j < matrizPais[i].length; j++) {
                if(matrizPais[i][j].getRegion()){
                    matrizPais[i][j].setColor(calcularColor(matrizPais[i][j]));
                }
            }
        }
        return generarEstado(matrizPais);
    }

    private char calcularColor(Region region){
        double porcentajeInfectados = (double)region.getInfectados()/region.getPoblacion()*100;
        if(porcentajeInfectados == 0.0){
            return 'B';
        }else if(porcentajeInfectados > 0 && porcentajeInfectados < 11.0){
            return 'V';
        }else if(porcentajeInfectados > 10 && porcentajeInfectados < 31){
            return 'A';
        }else if(porcentajeInfectados > 30 && porcentajeInfectados < 61){
            return 'N';
        }else{
            return 'R';
        }
    }

    private String generarEstado(Region[][] matriz){
        String res = "";
        int b = 0;int v = 0;int a = 0;int n = 0;int r = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                switch(matriz[i][j].getColor()){
                    case 'B': b++;break;
                    case 'V': v++;break;
                    case 'A': a++;break;
                    case 'N': n++;break;
                    case 'R': r++;break;
                }
            }
        }
        char colorMayor = calcularMayor(b,v,a,n,r);
        switch(colorMayor){
            case 'B': res = "No hay Infectados, todo posi";break;
            case 'V': res = "Vigilancia, peligro bajo";break;
            case 'A': res = "prevencion, peligro moderado";break;
            case 'N': res = "peligro, peligro alto";break;
            case 'R': res = "emergencia, peligro maximo";break;
        }
        return res;
    }

    public String cambiarInfectados(int x, int y, int infectados){//mejorar
        String res = "";
        if(matrizPais[y-1][x-1].getRegion()){
            matrizPais[y-1][x-1].setInfectados(infectados);
            res = "La region en las coordenadas: " + x + ", " + y + "han sido"+
            " cambiadas exitosamente"; 
        }else{
           res = "La region en las coordenadas: " + x + ", " + y + "No es parte"+
            " parte del pais";  
        }
        return res;
    }

    private char calcularMayor(int b, int v, int a, int n, int r){
        if(b >= v && b >= a && b >= n && b >= r)return 'B';
        else if(v >= b && v >= a && v >= n && v >= r)return 'V';
        else if(a >= v && a >= b && a >= n && a >= r)return 'A';
        else if(n >= v && n >= a && n >= b && n >= r)return 'N';
        else{return 'R';}
    }

    public Region[][] getMatrizPais(){
        return matrizPais;
    }
}