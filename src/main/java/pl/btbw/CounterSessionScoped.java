package pl.btbw;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class CounterSessionScoped implements Serializable {

	private int number = 1;

	public void increase() {
		number++;
	}

	public int getNumber() {
		return number;
	}
}
