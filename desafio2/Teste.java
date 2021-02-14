package desafio2;

public class Teste {
	
	public static void main(String[] args) {
	
		Televisao tv = new Televisao(12, 20);
		
		RemoteControl.toChangeChannel(tv);
		RemoteControl.turnUpTheVolume(tv);
		RemoteControl.lowerVolume(tv);
		RemoteControl.lowerVolume(tv);
		RemoteControl.turnUpTheVolume(tv);
		RemoteControl.statusTv(tv);

	
	}

}
