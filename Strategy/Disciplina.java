public class Disciplina {
	private ICalcMedia calcMedia;
	private double media; 
	private String nome; 
	private double p1; 
	private double p2; 
	private String situacao;


	public void calcularMedia() {
		this.media = this.calcMedia.calcularMedia(this.p1, this.p2);
		this.situacao = this.calcMedia.situacao(media);
	} 

	public Disciplina(ICalcMedia calcMedia, double p1, double p2, String nome) {
		this.calcMedia = calcMedia;
		this.p1 = p1;
		this.p2 = p2;
		this.nome = nome;
	} 

	public double getP1() {
		return this.p1;
	}

	public double getP2() {
		return this.p2;
	}

	public String getSituacao () {
		return this.situacao;
	}

	public double getMedia () {
		return this.media;
	}

	public String getNome () {
		return this.nome;
	}
}