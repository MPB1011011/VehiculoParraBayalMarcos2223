
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        operativaVehiculosParraBayalMarcos2223(50);
      }
      public static void operativaVehiculosParraBayalMarcos2223(int cantidad) {
        VehiculoParraBayalMarcos2223 miVehiculoParraBayalMarcos2223;
        int stockActual;
        
        miVehiculoParraBayalMarcos2223 = new VehiculoParraBayalMarcos2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoParraBayalMarcos2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoParraBayalMarcos2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoParraBayalMarcos2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
