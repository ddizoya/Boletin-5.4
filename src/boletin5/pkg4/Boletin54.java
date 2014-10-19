/*
Un restaurante galego, especializado en polbo con patacas, pídenos que lle deseñemos 
un método co que se poda saber cantos clientes poden atender coa materia prima que teñen no almacen .
O método recibe a cantidade de polbo e patacas, en kilos, e devolve o número de clientes que pode atender o restaurante .
Tendo en conta que por cada 3 persoas , o restaurante utiliza 2 kg de polbo e 1 de patacas. 
Na clase creada anteriormente implementa, tamén, os seguintes métodos : 

   public void engadirPolbo(int x ) . Engade x kg de polbo a os xa existentes
   public void engadirPatacas ( int x) . Engade x kg de patacas  ''       ''           
   public void amosarPolbo( ) . Amosa por pantalla os kg de polbo que ten no almacen
   public void amosarPatacas ( ) .  ''        ''       ''              ''   ''    patacas   ''     ''       ''                  

 */
package boletin5.pkg4;

/**
 *
 * @author David
 */
public class Boletin54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraDeClientes jejejeguapo = new CalculadoraDeClientes ();
        jejejeguapo.setPatatas(5);
        jejejeguapo.setPulpo(50);
        System.out.println("Con las cantidades introducidas, podrás atender a "+jejejeguapo.calcularNumeroClientes()+" clientes.");
    }
    
    
}
