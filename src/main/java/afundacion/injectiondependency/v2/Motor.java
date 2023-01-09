package afundacion.injectiondependency.v2;

public class Motor
{

	private String tipo;
	private int consumo;
	
    public Motor(String tipo,int consumo) {
		super();
		this.tipo = tipo;
		this.consumo = consumo;
	}

	public int getConsumo()
    {
		return consumo;
    }

	@Override
	public String toString() {
		return "Motor{" +
				"tipo='" + tipo + '\'' +
				", consumo=" + consumo +
				'}';
	}
}

