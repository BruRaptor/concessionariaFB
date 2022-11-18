package concessionariaFB;

public class TestaCarro {

	public static void main(String[] args) {
		
		CarroPasseio palio = new CarroPasseio();
		palio.setNomeCarro("Palio Wekeend");
		palio.setCombustivel("gasolina");
		CarroPasseio corsa = new CarroPasseio();
		corsa.setNomeCarro("Corsa Hatch");
		
		System.out.println(palio.getNomeCarro());
		System.out.println(corsa.getNomeCarro());

	}

}
