package desafio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	private String name;
	private int age;
	private float height;
	
	
	
	public Agenda(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	static ArrayList<Agenda> peoples = new ArrayList<Agenda>();
	
	static void addPeople() { //ok
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa: ");
		String name = input.nextLine();
		System.out.println("Digite a idade da pessoa: ");
		int age = input.nextInt();
		System.out.println("Digite a altura da pessoa: ");
		Float height = input.nextFloat();
		peoples.add(new Agenda(name, age, height));
		input.close();
		System.out.println("Pessoa adicionar com sucesso! ");
	}
	

	static void removePeople() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa que você quer remover: ");
		String peopleFind = input.nextLine();
		
		for(int i = 0; i < peoples.size(); i++) { // percorrer agenda
		     Agenda peoplePosition = peoples.get(i); // pega a posição de cada elemento da agenda
		     if(peoplePosition.getName().equals(peopleFind)) { // se a posição for igual a pessoa digitada
		            peoples.remove(peoplePosition); // remove
		     } 
		}
		input.close();
	}
	
	static void findPeople() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa que você quer encontrar na agenda: ");
		String peopleFind = input.nextLine();
		
		for(int i = 0; i < peoples.size(); i++) { // percorrer agenda
		     Agenda peoplePosition = peoples.get(i); // pega a posição de cada elemento da agenda
		     if(peoplePosition.getName().equals(peopleFind)) { // se a posição for igual a pessoa digitada
		    	System.out.println("Nome: " + peoplePosition.name + " Idade: " + peoplePosition.getAge() + " Altura: " + peoplePosition.getHeight());
		     } 
		}
		input.close();
	}
	
	static void printAll() { //ok
		for(Agenda p: peoples) {
			System.out.println("Nome: " + p.name + " Idade: " + p.age + " Altura: " + p.height);
		}
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	
	
}
