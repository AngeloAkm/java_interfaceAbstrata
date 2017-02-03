import br.com.angeloakm.entidades.Cachorro;
import br.com.angeloakm.entidades.Gato;
import br.com.angeloakm.entidades.Homem;
import br.com.angeloakm.interfaces.Comunicacao;

public class PrincipalInterface {

	public static void main(String[] args) {

		/**
		 * I N T E R F A C E
		 */

		Homem homem = new Homem();
		Cachorro cachorro = new Cachorro();
		Comunicacao gato = new Gato();

		homem.setNome("Angelo");
		cachorro.setNome("Jake");

		// 1 * Aqui não consigo setar o nome do gato pois a variavel é do tipo
		// Comunicacao e não do tipo Gato.
		// 1 * gato.setNome(); ???
		// 1 * Mas então como setar o nome do gato ?

		conversar(homem);
		conversar(cachorro);
		conversar(gato);

	}

	// Para usar o método basta a classe implementar "Comunicacao.class"
	public static void conversar(Comunicacao objeto) {

		// 1 * Para setar o nome do gato fazemos dessa forma, usamos o CAST()
		// 1 * Mas cuidado ao fazer isso, pois você não pode saber o tipo objeto que vem na variavel objeto
		Comunicacao Gato = new Gato();
		if (objeto instanceof Gato) {
			Gato gato = (Gato) objeto;
			gato.setNome("Coração");
			System.out.println("O gato se chama ---> " + gato.getNome());
		}
		objeto.comunicar();
	}
}
