package example.ObserverPattern;



public interface Stock {
	 void registerObserver( Observer o);
	 void deregisterObserver(Observer o);
	 void notifyObservers();

}
