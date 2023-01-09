package afundacion.injectiondependency.v3;

public class MotorFactory {

    public static Motor create(TipoMotor tipo)
    {
        Motor m = null;

        switch(tipo)
        {
            case MOTOR_DIESEL:
                m = new MotorDiesel();
                break;
            case MOTOR_GASOLINA:
                m = new MotorGasolina();
                break;
            default:
                break;
        }
        return m;
    }
}
