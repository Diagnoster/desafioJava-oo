package desafio3;

public class Teste {
	
	public static void main(String[] args) {
		
		Elevador elevador = new Elevador(1, 5, 3);
		Elevador.access(elevador);
		Elevador.leave(elevador);
		Elevador.rise(elevador);
		Elevador.down(elevador);
		
	}

}
