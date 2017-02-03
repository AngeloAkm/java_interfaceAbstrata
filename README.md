# Entendendo Interfaces e classes Abstratas !

INTERFACE

Garantir um comportamento comum entre todos os objetos que a implementem

Cachorro comunica 
Homem comunica 

Mas ambos se comunicam de formas diferentes

criamos então uma interface chamada Comunicacao aonde ela recebe um método aonde todos que implementam dela automaticamente recebe o método comunicar

Na chamada agora do método comunicar dos objetos, não precisamos mais passar o objeto homem e criar outro metodo passando cachorro, precisamos passar apenas quem implementar Comunicação

public interface Comunicacao {

	public void comunicar();
}

Mas vejamos ... Homem e Mulher de certa formam pensam diferente dos animais que agem por instinto ( tudo bem isso não faz muito sentido as vezes mas vamos acreditar que nessa situação isso aconteça hehehe ) então para diferenciarmos " humanos " dos " animais " criamos mais uma interface que se chama Raciocinio e nela criamos um método que se chama raciocinar 

public interface Raciocinio {

	public void raciocinar();

}

Legal, dessa forma agora conseguimos diferenciar humanos dos animais. Mas vamos mais além ...


Vejam que as classes Homem e Mulher são exatamente iguais
tem o mesmo atributo ---> nome ( tipo String )
e o método comunicar tambem tem o mesmo tipo de ação, ambos se comunicam ( idependente da forma como fazem isso hehe )
Agora imagine a seguinte situação. Vamos supor que será necessario alterar a ação que o método comunicar de homem e mulher fazem. No momento é simples porque são apenas duas classes mas imagine se fossem 10, 15 ou N classes ... teriamos que entrar uma a uma para alterar ? Isso daria muito trabalho sendo que todas estas classes fazem a mesma coisa.

Para resolvermos esse tipo de situação criamos então uma classe ABSTRATA chamada Animal !
Cachorro , gato , homem e mulher não são animais ?

Então criamos uma classe Animal com todos os atributos que todas as classes ( homem/mulher/cachorro/gato ) tem 

public abstract class Animal {

	private String nome;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void comunicar() {
		System.out.println("Homem falando");
		
	}

}

Muito bom, agora todo animal que viermos a criar futuramente , não sera mais necessário a implementação dos métodos básico que um animal faz e muito menos o atributo que todos tem - NOME.

Mas ... eu posso então fazer animal = new Animal ? Ja que todos extendem de animal é mais fácil fazer animal direto, e não precisamos mais usar homem, mulher, gato e bla bla bla ...



Vamos lá ! Com muita calma hehe agora temos o seguinte cenario, se fizermos Animal animal = new Animal() irá funcionar ? 
SIM ! 

Mas esta correto ? 
Nããão ! 

Mas pq  ?
Esse animal é um ser abstrato, ou seja, eu não faço " idéia " do que ele faz. Quando eu uso Animal animal = new Animal(); eu estou me referindo a que tipo de animal ? Homem ? Mulher ? Peixe ? Gato ?

Então a classe Animal na verdade está aqui para identificar o tipo do ser. Ou seja toda mulher, homem, gato e etc são animais. Então eles extendem de Animal recebendo seus atributos sendo assim tornando animais ... sacou ? 

Simplificando 

HOMEM ------( extende )------- ANIMAL ------( homem agora passa a ter )------- HOMEM
zé ruela 						Tem nome										Tem nome
não tem nada					Se comunica										Se comunica
								Se locomove										Se locomove
			
			

Toda classe abstrata não pode ser istanciada, assim como as interfaces. Você pode instanciar quem herda de animal ;)

Interface - definimos um método ( sem implementação ) - quem implementar essa interface implementa o método.
Abstrata - o método ja é pré-definido , ja está implementado. Se caso você quiser implementar de forma diferente vou mostrar um exemplo

Classe Animal 
	método 
		public void locomover(){
			System.out.println("Animal andando");
		}
Classe Homem que extende de Animal
	método 
		public void locomover(){
			System.out.println("Homem andando");
		}
		
Dessa forma toda vez que for chamado o método comunicar do Homem, a execução dele será sempre "System.out.println("Homem falando"); ---> Homem andando"


Legal né ? Mas você reparou que até este ponto ha algo no nosso código que esta duplicado e podemos melhorar ? 
A classe Homem e a classe Mulher tem o mesmo método que é o comunicar ... até ai tudo bem pois todo animal se comunicar de alguma forma, mas vc reparou que o homem e a mulher falam da mesma maneira ? eles usam palavras e se comunicam entre si da mesma forma " Oi - Oi - Tudo bem ? - Tudo e você ? - Tudo também - Legal - Legal - Fui - Eu também " 

Como resolver ?
Poderia fazer a classe Animal ter o método comunicar e pronto agora toda classe que extender animal vai ter o método de se comunicar ... mas isso estaria resolvido ? 
Por exemplo..
Se o cachorro "late" quem entende ? O humano ou outro cachorro ?
Se a mulher "fala" quem entende ? O homem ou o cachorro ? ( Sim eu sei as vezes os cachorros entendem mas não é o nosso caso aqui hehe )

Ou seja hoje temos a interface comunicar que esta sendo implementada em Gato, Cachorro, Homem e Mulher. 

Vamos fazer o seguinte para resolver este problema. 

Pegamos a classe Animal e fazemos ela implementar a interface Comunicacao !  ( não entendi ainda nada ... )

Calma hehe ... agora vamos nas classes dos animais e tiramos a implementação de Comunicação ... e deixamos apenas elas extendendo de Animal.

Animal por ter o método comunicar da interface Comunicacao automaticamente obriga as outras classes que extendem dela a terem também.

Ta mas e aonde se encaixa a solução do comunicar do homem e mulher com o resto dos animais ? 

Simples ! 

A classe Animal é a classe super , e lá deixaremos o método comunicar com a ação de " falar "

public void comunicar(){
			System.out.println("humano falando");
		}

E as classes gato e cachorro vão reescrever o método alterando a ação dele

Cachorro
	public void comunicar(){
			System.out.println("cachorro latindo");
		}
Gato
public void comunicar(){
			System.out.println("gato miando");
		}



Ta ficando bom né ? Mas da pra melhorar, vamos lá e deixarmos melhor definido quem apenas fala e quem não fala ;)  

Concorda comigo que podemos separar melhor a os animais dos racionais dos irracionais ? 

Mas como ?! 

Vamos agora criar mais uma classe abstrata chamada Animal Racional e vamos fazer ela extender Animal e implementar o método da interface Raciocinio
Eita ... calma !

Hehehe olha só que legal vai ficar agora a classe homem e mulher ... vamos por partes

AnimalRacional
	Vai receber Animal
					Animal tem
							- nome
							- implementa Comunicacao
								comunicacao tem o método comunicar()
							- metodo comunicar() que por default retorna humano falando
							- metodo locomover() pois todo animal se locomove
							- implementa Raciocinio
								raciocinio tem o metodo raciocinar()


Agora voltamos a classe Animal e tiramos o método comunicar !

Pois quem FALA é apenas animal racional correto ? Então na classe AnimalRacional implementamos o método comunicar
	public void comunicar(){
		System.out.println("humano falando");
	}


Ufa ! Acho que agora ta ficando legal ... mas pera lá ... no nosso projeto tem um classe carro, que nunca será um animal correto ?!?! E ai o que a aonde ela se encaixa nesse contexto todo ?!
Bem lembrado, tesmo mesmo uma classe carro e agora vamos usar ela !


De todos os métodos que temos aonde carro se encaixaria sem criarmos algo especifico para ele ? comunicar() ? decidir() ? ou ...

método ----> locomover() !

Mas locomover é apenas do animal, e carro não é um animal !

E agora ? Simples ... interface !!!

Criamos uma interface chamada Acao ( Ação ) e fazemos animal implemente ela assim como o carro ... e na chamada dessa ação chamaos uma Ação e não um animal ou um carro !
Vamos ao código 

Criamos a classe Acao

public interface Acao {
	public void locomover();

}

fazemos a classe Animal e Carro implementarem a interface Acao

e por fim 

mudamos o método na classe principal de 
	public static void locomover(Animal animal) {
		animal.locomover();
	}
	
	para 
	
	public static void locomover(Acao acao) {
		acao.locomover();
	}

Pronto ! Agora tudo esta em ordem. Espero que tenha ficado claro a explicação. 
Qualquer dúvida me chame !



