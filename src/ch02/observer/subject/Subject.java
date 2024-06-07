package ch02.observer.subject;

import ch02.observer.Observer;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
