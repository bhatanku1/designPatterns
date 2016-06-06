package observerPattern;

public interface Subject {
	public void registerObserver(Observer o);
	public void deDegisterObserver(Observer o);
	public void notifyObserver();
	
}
