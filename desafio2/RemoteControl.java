package desafio2;

import java.util.Scanner;

public class RemoteControl {
	
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int changeChannel;	
	@SuppressWarnings("unused")
	private int lessVolume;
	@SuppressWarnings("unused")
	private int moreVolume;
	 
	 public RemoteControl(String name) {
		 this.name = name;
	 }
	
	  public void toChangeChannel(Televisao tv) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Digite um canal desejado: ");
		  int number = input.nextInt();
		  tv.setCanais(number);
		  System.out.println("A tv está no canal " + tv.getCanais());
		  input.close();
	 }
	  
	 public void turnUpTheVolume(Televisao tv) {
		 tv.setVolume(tv.getVolume()+1);
		 if(tv.getVolume() <= 50) {
			 System.out.println("Volume está em: " + tv.getVolume());
		 } else {
			 System.out.println("Volume máximo!");
		 }
	 }
	 
	 public void lowerVolume(Televisao tv) {
		 tv.setVolume(tv.getVolume()-1);
		 if(tv.getVolume() > 0) {
			 System.out.println("Volume está em: " + tv.getVolume());
		 } else {
			 System.out.println("Tv no modo mudo!");
		 }
	 }
	 
	 public void statusTv (Televisao tv) {
		 System.out.println("Sua tv está no canal " + tv.getCanais() + " e no volume " + tv.getVolume());
	 }
	
	 
}
