package afundacion.injectiondependency.v1;

public class Motor
{
	private int consumo;
	
    public Motor(int consumo) {
		super();
		this.consumo = consumo;
	}

	public int getConsumo()
    {
		return consumo;
    }

	@Override
	public String toString() {
		return "Motor [consumo=" + consumo + "]";
	}
	
}

