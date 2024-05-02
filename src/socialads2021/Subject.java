package socialads2021;

public interface Subject {
    public void notifyObservers();
	public void attach(Observer observer);
	public void detach(Observer observer);
    
}
