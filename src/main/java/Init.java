import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Init {
    private static ArrayList<ArrayList> nueva;

    public static void main(String[] args) {
        generarArreglo(10);
        System.out.println(mayorProductoAdyacente(nueva));

    }

    public static ArrayList<Integer> generarArreglo(int length){
        ArrayList<Integer> ar= new ArrayList<>();
        if (length >=2&&length <=10){
        for (int i = 0; i < length; i++) {
            int y = (new Random().nextInt(1000-(-1000)) - 1000);
            ar.add(y);
            }
        }
        System.out.println(mostrarParesAdyacentes(ar));
        return ar;
    }

    public static ArrayList<ArrayList> mostrarParesAdyacentes(ArrayList<Integer> ar){
        nueva = new ArrayList<>();
        for (int a=0,b = 1; b<ar.size() ; a++,b++) {
            int i = ar.get(a);
            int j = ar.get(b);
            ArrayList<Integer> par = new ArrayList<>();
            par.add(i);
            par.add(j);
            nueva.add(par);
        }
        return nueva;
    }

    public static int mayorProductoAdyacente(ArrayList<ArrayList> nueva){
        int counter=0;
        for (ArrayList<Integer> arrays:nueva) {
            if(arrays.get(0)*arrays.get(1)>counter){
                counter=arrays.get(0)*arrays.get(1);
            }
        }
        return counter;
    }
    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int a=validar(2);
        var arreglo=generarArreglo(10);
        do {

        System.out.println("Menu");
        System.out.println("----------------");
        System.out.println("1) Mostrar pares adyacentes");
        System.out.println("2) Mostrar el mayor valor numerico");
        System.out.println("0) SALIR");
        if (a == 1){
            mostrarParesAdyacentes(arreglo);
        }else if(a==2){
            System.out.println(mayorProductoAdyacente(mostrarParesAdyacentes(arreglo)));
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
