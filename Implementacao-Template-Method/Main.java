public class Main {
	public static void main(String[] args) {

		PlayList minhaPlayList = new PlayList(ModoDeReproducao.porNome);
		minhaPlayList.adicionarMusica("Everlong", "Foo Fighters", "1997", 4);
		minhaPlayList.adicionarMusica("Square Hammer", "Ghost", "2016", 5);
		minhaPlayList.adicionarMusica("Smoke On The Water", "Deep Purple", "1972", 2);
		minhaPlayList.adicionarMusica("Lithium", "Nirvana", "1991", 3);
		minhaPlayList.adicionarMusica("Ten", "Pearl Jam", "1991", 1);

		System.out.println("=== Lista por Nome de Musica ===");
		minhaPlayList.mostrarListaDeReproducao();

		System.out.println("\n=== Lista por Autor ===");
		minhaPlayList.setModoDeReproducao(ModoDeReproducao.porAutor);
		minhaPlayList.mostrarListaDeReproducao();

		System.out.println("\n=== Lista por Ano ===");
		minhaPlayList.setModoDeReproducao(ModoDeReproducao.porAno);
		minhaPlayList.mostrarListaDeReproducao();

		System.out.println("\n=== Lista por Estrela ===");
		minhaPlayList.setModoDeReproducao(ModoDeReproducao.porEstrela);
		minhaPlayList.mostrarListaDeReproducao();
	}
}