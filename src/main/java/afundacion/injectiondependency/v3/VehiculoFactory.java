package afundacion.injectiondependency.v3;
public class VehiculoFactory
{
    public static Vehiculo Create(String matricula, String modelo, TipoMotor tipo)
    {
        Vehiculo v = null;
 
        switch(tipo)
        {
            case MOTOR_DIESEL:
                v = new Vehiculo(matricula, modelo, new MotorDiesel());
                break;
            case MOTOR_GASOLINA:
                v = new Vehiculo(matricula, modelo, new MotorGasolina());
                break;
            default:
                break;
        }
         
        return v;
    }
}