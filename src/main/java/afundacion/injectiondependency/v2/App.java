package afundacion.injectiondependency.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Motor motorDiesel = new Motor(5);
        Motor motorGasolina = new Motor(6);
    	
        Vehiculo v1 = new Vehiculo("1","Ford Fiesta Diesel", motorDiesel);
        Vehiculo v2 = new Vehiculo("2","Citroen Saxo Diesel", motorDiesel);
        Vehiculo v3 = new Vehiculo("3", "Ford Fiesta Gasolina", motorGasolina);
        
        List<Vehiculo> vs = new ArrayList<Vehiculo>();
        vs.add(v1);
        vs.add(v2);
        vs.add(v3);
        
        for (Vehiculo v : vs) {
        	System.out.println(v);
        }
        
        //¿y si cambia el consumo de los motores? ¿tengo que cambiar su valor en todas las instancias de Motor? Ademas, nuestro codigo ahora mismo es propenso a errores, es muy fácil que 
        //instancie un motor diesel con el consumo del gasolina o viceversa
        
        //¿Que podemos hacer para evitar estas duplicidades?
        // Podemos ayudarnos de algun patro de diseño creacional https://www.tutorialspoint.com/design_pattern
        
        //¿Os atrevéis?
    }
}
