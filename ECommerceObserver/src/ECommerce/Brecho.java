package ECommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Brecho implements Subject{
	
	private List<Observer> observers;
	private int number;
	
	public Brecho() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(this, number);
		}
	}
	
	public void generateNewNumber() {
		Random random = new Random();
		number = random.nextInt(40);
		// Ap�s a modificacao, avisa os observadores
		notifyObservers();
	}
	

}