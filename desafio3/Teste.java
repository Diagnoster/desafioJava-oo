package desafio3;

public class Teste {
	
	public static void main(String[] args) {
		
		Elevador elevador = new Elevador(1, 5, 3);
		elevador.access();
		elevador.leave();
		elevador.rise();
		elevador.down();
		
	}

}
