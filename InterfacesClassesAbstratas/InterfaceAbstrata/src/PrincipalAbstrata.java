import br.com.angeloakm.abstratas.Animal;
import br.com.angeloakm.abstratas.AnimalRacional;
import br.com.angeloakm.entidades.Cachorro;
import br.com.angeloakm.entidades.Carro;
import br.com.angeloakm.entidades.Gato;
import br.com.angeloakm.entidades.Homem;
import br.com.angeloakm.entidades.Mulher;
import br.com.angeloakm.interfaces.Acao;
import br.com.angeloakm.interfaces.Comunicacao;

public class PrincipalAbstrata {

	public static void main(String[] args) {
		System.out.println(" ");

		/**
		 * A B S T R A T A
		 */

		Homem homem1 = new Homem();
		Cachorro cachorro1 = new Cachorro();
		Comunicacao gato1 = new Gato();
		Mulher mulher1 = new Mulher();
		

		conversar(homem1);
		conversar(cachorro1);
		conversar(gato1);
		conversar(mulher1);

		System.out.println(" ");
		/*****************************************/

		Animal homem2 = new Homem();
		homem2.setNome("Angelo");
		homem2.locomover();

		System.out.println(" ");
		/*****************************************/

		Mulher mulher2 = new Mulher();
		decidir(mulher2);

		System.out.println(" ");
		/*****************************************/
		
		Gato gato2 = new Gato();
		gato2.setNome("Gato Coração");
		locomover(gato2);

		System.out.println(" ");
		/*****************************************/

		Carro carro = new Carro();
		locomover(carro);
		System.out.println(" ");
		/*****************************************/
		
	}

	public static void conversar(Comunicacao objeto) {
		objeto.comunicar();
	}

//	public static void decidir(Raciocinio objeto) {
//		objeto.raciocinar();
//	}
	
	public static void decidir(AnimalRacional objeto) {
		objeto.raciocinar();
	}

//	public static void locomover(Animal animal) {
//		animal.locomover();
//	}
	
	public static void locomover(Acao acao) {
		acao.locomover();
	}
}
