import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InitTest {


    @Test
    void generarArreglo() {
        assertEquals(10,Init.generarArreglo(10).size());
    }

    @Test
    void  casoDePrueba4() {
        ArrayList<Integer> test4 =new ArrayList<>();
        test4.add(3); test4.add(6);test4.add(-2) ;
        test4.add(-5);test4.add(7);test4.add( 3);
        assertEquals(21,Init.mayorProductoAdyacente(Init.mostrarParesAdyacentes(test4)));
    }


    @Test
    void  casoDePrueba5() {
        ArrayList<Integer> test5 =new ArrayList<>();
        test5.add(-1);
        test5.add(-2);
        assertEquals(2,Init.mayorProductoAdyacente(Init.mostrarParesAdyacentes(test5)));
    }
    @Test
    void casoDePrueba6() {
        ArrayList<Integer> test5 =new ArrayList<>();
        test5.add(1);
        test5.add(0);
        test5.add(1);
        test5.add(0);
        test5.add(1000);
        assertEquals(0,Init.mayorProductoAdyacente(Init.mostrarParesAdyacentes(test5)));
    }
}