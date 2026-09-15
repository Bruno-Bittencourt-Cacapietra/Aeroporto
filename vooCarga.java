public class vooCarga extends Voo {

	private double pesoCargaKg;

	private double capacidadeMaxKg;

	private boolean cargaInspecionada;

	public vooCarga(String codigo, String origem, String destino, double distancia, double combDisp, boolean situDoc,double pesoCargaKg, double capacidadeMaxKg, boolean cargaInspecinada) {
		super(codigo, origem, destino, distancia, combDisp, situDoc );
		this.capacidadeMaxKg = capacidadeMaxKg;
		this.cargaInspecionada = cargaInspecinada;

	}

	public double calcularCombustivelNec() {
		return (this.ditancia * 0.15) + (this.pesoCargakg * 0.02);
	}

	public double calcularCustoOp() {
		return (10 * this.distancia) + ( 1.50 * pesoCargakg) ;
	}

	public String getTipo() {
		return "Carga!"	;
	}

	public boolean autorizarDecolagem() {
		if((this.situDoc) && (combDisp >= calcularCombustivelNec())){
			return true;
		}
		return false;
	}

	public String getMotivoPend() {
		if (!this.situDoc){
			return "Documentação pendente.";
		}
		if(combDisp >= calcularCombustivelNec()){
			return "Combustivel insuficiente.";
		}
		if(combDisp >= calcularCombustivelNec() && )

		return ;
	}

}
