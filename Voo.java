public abstract class Voo implements autorizacao{

	protected String codigo;

	protected String origem;

	protected String destino;

	protected double distanciaKm;

	protected double combustivelDisp;

	protected boolean documentacaoReg;

	public voo(String codigo, String origem, double distanciaKm, double combustivelDisp, boolean documentacaoReg) {

	}

	public String getCodigo() {
		return this.codigo;
	}

	public String getOrigem() {
		return this.origem;
	}

	public String getDestino() {
		return this.destino;
	}

	public double getDistanciakm() {
		return this.distanciaKm;
	}

	public double getCombustivelDisp() {
		return this.combustivelDisp;
	}

	public boolean isDocumentacaoReg() {
		return this.documentacaoReg;
	}

	public double calcularCombustivelNec() {
		return 0;
	}

	public abstract double calcularCustoOp();

	public abstract String getipo();

	public abstract boolean autorizarDecolagem();

	public abstract String getMotivoPend();

	public void exibirResumo() {

	}


	/**
	 * @see autorizacao#autorizaDecolagem()
	 *  
	 */
	public boolean autorizaDecolagem() {
		return false;
	}

}
