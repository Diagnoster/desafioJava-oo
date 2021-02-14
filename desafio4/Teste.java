package desafio4;

public class Teste {
	
	public static void main(String[] args) {
		
		Agenda.peoples.add(new Agenda("james", 5, (float)1.71));
		Agenda.peoples.add(new Agenda("joao", 5, (float)1.71));
	
		//Agenda.addPeople();
		Agenda.printAll();
		//Agenda.removePeople();
		Agenda.findPeople();
		
		
		
	}

}
