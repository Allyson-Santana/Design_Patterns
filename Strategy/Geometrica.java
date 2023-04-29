public class Geometrica implements ICalcMedia {
	@Override
	public double calcularMedia(double a, double b) {
		return Math.sqrt(a * b);
	}
	
	@Override
	public String situacao(double media) {
		if (media > 7) {
			return "APROVADO";
		} 
		return "REPROVADO";
	}
}