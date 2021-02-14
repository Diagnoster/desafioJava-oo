package desafio2;

public class Televisao {

	private int channel;
	private int volume;
	
	
	
	public Televisao(int canais, int volume) {
		this.channel = canais;
		this.volume = volume;
	}
	
	public int getCanais() {
		return channel;
	}
	public void setCanais(int canais) {
		this.channel = canais;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
}
