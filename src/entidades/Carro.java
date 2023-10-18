package entidades;

public class Carro extends Veiculo{
	
	private String modelo;

	public Carro(String cor, String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + "]";
	}
	
	

}
