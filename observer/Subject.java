package patternobserver;

public interface Subject {
	
	public void addObserver(Observer o);
	
    public void removeObserver(Observer o);
    
    public void notifyObservers(Object obj);

}
