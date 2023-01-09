package afundacion.injectiondependency.v3;

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
        Vehiculo v1 = new Vehiculo("1", "Ford Fiesta", MotorFactory.create(TipoMotor.MOTOR_DIESEL));
        Vehiculo v2 = new Vehiculo("2", "Citroen Saxo", MotorFactory.create(TipoMotor.MOTOR_DIESEL));
        Vehiculo v3 = new Vehiculo("3", "Ford Fiesta", MotorFactory.create(TipoMotor.MOTOR_GASOLINA));

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
