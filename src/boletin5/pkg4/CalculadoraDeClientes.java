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
public class CalculadoraDeClientes {
    private int pulpo;
    private int patatas;
    
    public CalculadoraDeClientes (){
        
    }
    
    public CalculadoraDeClientes(int pulpo, int patatas){
        this.patatas = patatas;
        this.pulpo = pulpo;
        
        
    }
    
    public void setPulpo (int pulpo){
        this.pulpo = pulpo;
    }
    
    public double getPulpo (){
        return pulpo;
    }
    
    public void setPatatas (int patatas){
        this.patatas = patatas;
    }
    
    public double getPatatas (){
        return patatas;
    }
    
    public double calcularNumeroClientes() {
        double calculo = (patatas*2/3) + (pulpo*1/3);
        return calculo;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
