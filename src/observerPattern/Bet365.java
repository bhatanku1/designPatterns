package observerPattern;

public class Bet365 implements Observer {
	private Subject bettingData;
	public Bet365(Subject bettingData){
		this.bettingData = bettingData;
		bettingData.registerObserver(this);
		
	}
	@Override
	public void update(int numberOfGoals) {
		System.out.println("Goal scored: Bet365 increasing the bets " + numberOfGoals);

	}

}
