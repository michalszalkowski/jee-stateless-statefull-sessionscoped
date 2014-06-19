package pl.btbw;

import javax.ejb.Stateful;

@Stateful
public class CounterFull {

	private int number = 1;

	public void increase() {
		number++;
	}

	public int getNumber() {
		return number;
	}
}
