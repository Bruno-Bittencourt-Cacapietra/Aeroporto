public abstract class Voo implements autorizacao{

	protected String codigo;

	protected String origem;

	protected String destino;

	protected double distanciaKm;

	protected double combustivelDisp;

	protected boolean situDoc;

	public Voo(String codigo, String origem, double distanciaKm, double combustivelDisp, boolean situDoc) {
		this.codigo = codigo;
		this.origem = origem;
		this.distanciaKm = distanciaKm;
		this.combustivelDisp = combustivelDisp;
		this.situDoc = situDoc;
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

	public double getCombustivelDisponivel() {
		return this.combustivelDisp;
	}

	public boolean getSituacaoDocumento() {
		return this.situDoc;
	}

	public double calcularCombustivelNec() {
		return 0;
	}

	public abstract double calcularCustoOp();

	public abstract String getipo();

	public abstract boolean autorizarDecolagem();

	public abstract String getMotivoPend();

	public void exibirResumo() {
		System.out.print("Código: " + codigo + "\nOrigem: " + "\nDestino: " + destino + "\nDistância: " + distanciaKm + "\nCombustível Disponível: " + combustivelDisp + "\nSituação da Documentação: " + situDoc);
	}

}
