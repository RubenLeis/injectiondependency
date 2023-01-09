package afundacion.injectiondependency.v3.more;

import afundacion.injectiondependency.v3.*;

public class VehiculoFactory {

    public static Vehiculo create(String matricula, String modelo, TipoMotor tipo)
    {
        Vehiculo v = new Vehiculo(matricula, modelo, MotorFactory.create(tipo));
        return v;
    }
}
