package afundacion.injectiondependency.v3;
 
public class Vehiculo
{
	

	private String matricula;
	private String modelo;
    private IMotor motor;
 
    public Vehiculo(String matricula, String modelo, IMotor motor)
    {
    	this.setMatricula(matricula);
    	this.modelo = modelo;
        this.motor = motor;
    }
    
    public String getModelo() {
		return modelo + " " + motor.getNombre();
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
 
    public int getConsumo()
    {
        return motor.getConsumo();
    }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [modelo=" + getModelo() + ", motor.consumo=" + motor.getConsumo() + "]";
	}
    
    
}