package strategyPattern;

public class Test {
	public static void main(String[] arg){
		int numberOfEngines = 4;
		TakingOff takingOff = new TakingOff3();
		Boeing boeing = new Boeing(numberOfEngines, takingOff);
		boeing.takeoff();
	}
}
