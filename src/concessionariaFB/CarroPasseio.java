package concessionariaFB;

public class CarroPasseio extends Veiculo{

	public String nomeCarro;
	public String combustivel;
	
	boolean tipoCombustivel() {
		if(combustivel == "gasolina") {
			return true;
		}else {
			return false;
		}
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getNomeCarro() {
		return nomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
}
