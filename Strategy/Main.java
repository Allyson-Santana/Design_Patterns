public class Main {
	public static void main(String[] args) {

	Disciplina disc = new Disciplina(new Aritmetica(), 7, 8, "Allyson");
	disc.calcularMedia();

	System.out.println("\nMédia Aritmética");

	System.out.println("Nome: " + disc.getNome());
	System.out.println("P1: " + disc.getP1());
	System.out.println("P2: " + disc.getP2());
	System.out.println("Situacao: " + disc.getSituacao());
	System.out.println("Media: " + disc.getMedia());

	Disciplina disc2 = new Disciplina(new Geometrica(), 7, 8, "Allyson");
	disc2.calcularMedia();

	System.out.println("\nMedia Geometrica");
	System.out.println("Nome: " + disc2.getNome());
	System.out.println("P1: " + disc2.getP1());
	System.out.println("P2: " + disc2.getP2());
	System.out.println("Situacao: " + disc2.getSituacao());
	System.out.println("Media: " + disc2.getMedia());
	
	}
}