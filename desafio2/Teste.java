package desafio2;

public class Teste {
	
	public static void main(String[] args) {
	
		Televisao tv = new Televisao(12, 20);
		RemoteControl samsung = new RemoteControl("Samsung");
		
		samsung.toChangeChannel(tv);
		samsung.turnUpTheVolume(tv);
		samsung.lowerVolume(tv);
		samsung.lowerVolume(tv);
		samsung.turnUpTheVolume(tv);
		samsung.statusTv(tv);

	
	}

}
