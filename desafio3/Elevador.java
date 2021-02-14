package desafio3;

public class Elevador {
	
	private int currentFloor;
	private int totalFloors;
	private int capacity;
	
	public Elevador(int currentFloor, int totalFloors, int capacity) {
		this.currentFloor = currentFloor;
		this.totalFloors = totalFloors;
		this.capacity = capacity;
	}
	
	static void access(Elevador elevador) {
		if(elevador.getCapacity() < 4 && elevador.getCapacity() >= 0) {
			elevador.setCapacity(elevador.getCapacity() + 1);
			System.out.println(elevador.getCapacity() + " pessoa(s) esta(ão) no elevador");
		} else {
			System.out.println("Capacidade máxima atingida!");
		}
	}
	
	static void leave(Elevador elevador) {
		if(elevador.getCapacity() >= 1) {
			elevador.setCapacity(elevador.getCapacity() - 1);
			System.out.println(elevador.getCapacity() + " pessoa(s) esta(ão) no elevador");
		} else {
			System.out.println("Elevador está vazio! ");
		}
	}
	
	static void rise(Elevador elevador) {
		if(elevador.getCurrentFloor() >= 0 && elevador.getCurrentFloor() < 5) {
			elevador.setCurrentFloor(elevador.getCurrentFloor() + 1);
			System.out.println("Você está no andar " + elevador.getCurrentFloor());
		} else if (elevador.getCurrentFloor() == 5){
			System.out.println("Você já esta no último andar!");
		} 
	}
	
	static void down(Elevador elevador) {
		if(elevador.getCurrentFloor() > 0) {
			elevador.setCurrentFloor(elevador.getCurrentFloor() - 1);
			if(elevador.getCurrentFloor() == 0) {
				System.out.println("Você está no térreo! ");
			} else {
				System.out.println("Você está no andar " + elevador.getCurrentFloor());
			}
		} else {
			System.out.println("Você está no térreo, impossível descer mais!");
		}
	}
	
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public int getTotalFloors() {
		return totalFloors;
	}
	public void setTotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	
	
}
