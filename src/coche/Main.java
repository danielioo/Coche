package coche;

/**
 *
 * @author
 */
public class Main {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Coche mycar;
        int stockActual;
        
        mycar = new Coche("Opel",12000,500);
        vender_car(mycar);
        comprar_car(mycar);
        stockActual = mycar.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    /**
     *
     * @param mycar metodo comprar coche
     */
    public static void comprar_car(Coche mycar) {
        try
        {
            System.out.println("Compra de Coches");
            mycar.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    /**
     *
     * @param mycar metodo vender coche
     */
    public static void vender_car(Coche mycar) {
        try
        {
            System.out.println("Venta de Coches");
            mycar.vender(300, 100);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }

}