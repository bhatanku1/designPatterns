package strategyPattern;

public class Aeroplane {
	private int numberOfEngines;
	TakingOff takingOff;
	public Aeroplane(int numberOfEngines, TakingOff takingOff){
		this.numberOfEngines = numberOfEngines;
		this.takingOff = takingOff;
	}
	
	public void takeoff(){
		takingOff.takeoff();
	}

}
