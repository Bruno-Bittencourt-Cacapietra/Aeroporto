public class vooCarga extends Voo {

	private double pesoCargaKg;

	private double capacidadeMaxKg;

	private boolean cargaInspecionada;

	public vooCarga(double pesoCargaKg, double capacidadeMaxKg, boolean cargaInspecinada) {

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
