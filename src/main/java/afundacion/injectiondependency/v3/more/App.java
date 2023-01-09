package afundacion.injectiondependency.v3.more;

import afundacion.injectiondependency.v3.MotorFactory;
import afundacion.injectiondependency.v3.TipoMotor;
import afundacion.injectiondependency.v3.Vehiculo;

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
        Vehiculo v1 = VehiculoFactory.create("1", "Ford Fiesta", TipoMotor.MOTOR_DIESEL);
        Vehiculo v2 = VehiculoFactory.create("2", "Citroen Saxo", TipoMotor.MOTOR_DIESEL);
        Vehiculo v3 = VehiculoFactory.create("3", "Ford Fiesta", TipoMotor.MOTOR_GASOLINA);

        List<Vehiculo> vs = new ArrayList<Vehiculo>();
        vs.add(v1);
        vs.add(v2);
        vs.add(v3);
        
        for (Vehiculo v : vs) {
        	System.out.println(v);
        }
        
        // este caso no refleja la realidad de los motores, realmente muchos vehiculos, admiten los tipos mas habituales de motor: diesel, gasolina, gasoleo...
        // Podemos ayudarnos de algun patron de diseño creacional https://www.tutorialspoint.com/design_pattern
    }
}
