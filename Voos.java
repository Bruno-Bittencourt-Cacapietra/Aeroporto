public  abstract class Voos implements Autorizacao {

	protected String  codigo;

	protected String  origem;

	protected String  destino;

	protected double distancia;

	protected  double combDisp;

	protected boolean  situDoc;

	public  Voos(String codigo, String origem, String destino, double distancia, double combDisp, boolean situDoc) {
		this.codigo = codigo;
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
		this.combDisp = combDisp;
		this.situDoc = situDoc;
	}

	public  abstract  double  calcularCombustivelNec(double quilPerc, double quilTrans);
    public abstract double calcularCustoOp();

	public String getOrigem() {
		return null;
	}

	public String getDistino() {
		return null;
	}

	public String getDistancia() {
		return null;
	}

	public double getCombDisp() {
		return 0;
	}

	public boolean getSituDoc() {
		return false;
	}

	public String getcodigo() {
		return null;
	}

	


	/**
	 * @see Autorizacao#public autorizacao(boolean)
	 *  
	 */
	public boolean autorizacao(boolean doc) {
		return false;
	}

}
