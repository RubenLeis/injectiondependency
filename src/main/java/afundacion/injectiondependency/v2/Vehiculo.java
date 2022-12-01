package afundacion.injectiondependency.v2;
 
public class Vehiculo
{
	private String matricula;
	private String modelo;
    private Motor motor;
 
    public Vehiculo(String matricula, String modelo, Motor motor)
    {
    	this.setMatricula(matricula);
    	this.modelo = modelo;
        this.motor = motor;
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
		return "Vehiculo [modelo=" + modelo + ", motor=" + motor + "]";
	}
    
    
}