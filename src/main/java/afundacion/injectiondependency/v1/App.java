package afundacion.injectiondependency.v1;

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
        Vehiculo v1 = new Vehiculo("1","Ford Fiesta Diesel");
        Vehiculo v2 = new Vehiculo("2","Citroen Saxo Diesel");
        //Vehiculo v3 = new Vehiculo("3","Ford Fiesta Gasolina");
        
        // ¿y si agrego un modelo que usa motor gasolina?
        // Tenemos un problema de diseño ¿Como arreglariais esto?
        List<Vehiculo> vs = new ArrayList<Vehiculo>();
        vs.add(v1);
        vs.add(v2);
        //vs.add(v3);
        
        for (Vehiculo v : vs) {
        	System.out.println(v);
        }
    }
}
