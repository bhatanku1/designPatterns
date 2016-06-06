package observerPattern;

public class ObserverTest {
	public static void main(String[] main) {
		BettingData bettingData = new BettingData();
		Bet365 bet365 = new Bet365(bettingData);
		BigBets bigBet = new BigBets(bettingData);
		bettingData.setGoals(4);
	}
}
