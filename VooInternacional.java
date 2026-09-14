public class VooInternacional extends Voo {

	private int qtdPassageiros;

	private int capacidadeMax;

	private boolean autorizaçãoIntern;

	public VooInternacional(int qtdPassageiros, int capacidadeMax) {

	}

	public double calcularCombustivelNec() {
		return 0;
	}

	public double calcularCustoOp() {
		return 0;
	}

	public String getTipo() {
		return null;
	}

	public boolean autorizarDecolagem() {
		return false;
	}

	public String getMotivoPend() {
		return null;
	}

}
