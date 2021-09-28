import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Init {

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int a=validar(2);
        do {

        System.out.println("Menu");
        System.out.println("----------------");
        System.out.println("1) Mostrar pares adyacentes");
        System.out.println("2) Mostrar el mayor valor numerico");
        System.out.println("0) SALIR");
        if (a == 1){
            //caso 1
        }else if(a==2){
            //caso 2System.out.println("")
        }else{
            a=0;
        }


        }while(a!= 0);
    }
    public static int validar(int x) {
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner(System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            if (n < 0 || n > x) {
                System.out.println("Indice Erróneo");
            }
        } while (n < 0 || n > x);
        return n;
    }
}
