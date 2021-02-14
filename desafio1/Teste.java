package desafio1;

public class Teste {
	
	public static void calculateAge(Pessoa pessoa) {
		
		int idade =  pessoa.getcurrentAge() - pessoa.getYear();
		System.out.println("Você tem " + idade + " anos de idade");
	}
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("James", 1.71, 5, 2, 1996);
		calculateAge(pessoa);
		
		
		
	}

}
