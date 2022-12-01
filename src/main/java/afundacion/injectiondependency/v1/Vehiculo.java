package afundacion.injectiondependency.v1;
 
public class Vehiculo
{
	private String matricula;
	private String modelo;
    private Motor motor;
 
    public Vehiculo(String matricula, String modelo)
    {
    	this.setMatricula(matricula);
    	this.modelo = modelo;
        //¿Que problema vemos aqui?
        this.motor = new Motor(5);
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