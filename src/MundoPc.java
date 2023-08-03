import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {

        Raton raton1 = new Raton("PS/2", "Logitech");
        Raton raton2 = new Raton("USB", "HP");
        Teclado teclado1 = new Teclado( "Mini-DIN de 6 pies", "Logitech" );
        Teclado teclado2 = new Teclado( "USB", "Razer" );
        Monitor monitor1 = new Monitor("LG", 48.7 );
        Monitor monitor2 = new Monitor("Samsung", 53.13 );

        Computadora computadora1 = new Computadora(5000, monitor1, teclado1, raton1);
        Computadora computadora2 = new Computadora(6000, monitor2, teclado2, raton2);

        //System.out.println(computadora1);
        //System.out.println(computadora2);

        Orden orden = new Orden();
        orden.agregarComputadora(computadora1);
        orden.agregarComputadora(computadora2);
        orden.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora1);
        orden2.mostrarOrden();



    }
}
