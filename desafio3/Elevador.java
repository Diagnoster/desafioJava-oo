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
	
	public void access() {
		if(this.getCapacity() < 4 && this.getCapacity() >= 0) {
			this.setCapacity(this.getCapacity() + 1);
			System.out.println(this.getCapacity() + " pessoa(s) esta(ão) no elevador");
		} else {
			System.out.println("Capacidade máxima atingida!");
		}
	}
	
	public void leave() {
		if(this.getCapacity() >= 1) {
			this.setCapacity(this.getCapacity() - 1);
			System.out.println(this.getCapacity() + " pessoa(s) esta(ão) no elevador");
		} else {
			System.out.println("Elevador está vazio! ");
		}
	}
	
	public void rise() {
		if(this.getCurrentFloor() >= 0 && this.getCurrentFloor() < 5) {
			this.setCurrentFloor(this.getCurrentFloor() + 1);
			System.out.println("Você está no andar " + this.getCurrentFloor());
		} else if (this.getCurrentFloor() == 5){
			System.out.println("Você já esta no último andar!");
		} 
	}
	
	public void down() {
		if(this.getCurrentFloor() > 0) {
			this.setCurrentFloor(this.getCurrentFloor() - 1);
			if(this.getCurrentFloor() == 0) {
				System.out.println("Você está no térreo! ");
			} else {
				System.out.println("Você está no andar " + this.getCurrentFloor());
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
