
/**
 * Write a description of class Dibujador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dibujador
{
    public void dibujarMapa(Region[][] r){
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                if(r[i][j].getRegion()){
                    System.out.print("[R]");
                }else{
                    System.out.print("[-]");
                }
            }
            System.out.print("\n");
        }
    }

    public void dibujarColores(Region[][] r){
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                if(r[i][j].getRegion()){
                    switch(r[i][j].getColor()){
                        case 'B': System.out.print("["+'B'+"]");break;
                        case 'V': System.out.print("["+'V'+"]");break;
                        case 'A': System.out.print("["+'A'+"]");break;
                        case 'N': System.out.print("["+'N'+"]");break;
                        case 'R': System.out.print("["+'R'+"]");break;
                    }
                }else{
                    System.out.print("[-]");
                }
            }
            System.out.print("\n");
        }
    }
}
