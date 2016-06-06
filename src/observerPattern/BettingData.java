package observerPattern;

import java.util.ArrayList;

public class BettingData implements Subject {
	private int numberOfGoals;
	private ArrayList observers;
	public BettingData(){
		observers = new ArrayList();
	}
	public void setGoals(int numberOfGoals){
		this.numberOfGoals = numberOfGoals;
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void deDegisterObserver(Observer o) {
		int i;
		i = observers.indexOf(o);
		observers.remove(i);

	}

	@Override
	public void notifyObserver() {
		Observer o;
		for(int i = 0; i<observers.size();i++){
			o = (Observer) observers.get(i);
			o.update(numberOfGoals);
		}

	}

}
