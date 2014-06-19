package pl.btbw;

import javax.ejb.Stateless;

@Stateless
public class CounterLess {

	private int number = 1;

	public void increase() {
		number++;
	}

	public int getNumber() {
		return number;
	}
}
