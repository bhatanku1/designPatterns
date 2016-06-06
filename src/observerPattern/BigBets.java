package observerPattern;

public class BigBets implements Observer{
	private int numberOfGoals;
	private Subject bettingData;
	public BigBets(Subject bettingData){
		this.bettingData = bettingData;
		bettingData.registerObserver(this);
	}
	@Override
	public void update(int numberOfGoals) {
		System.out.println("Goal scored: Bigbets decreasing the bets " + numberOfGoals);

		
		
	}

}
