package pl.btbw;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("state")
public class SlSfResource {

	@EJB
	private CounterLess less;

	@EJB
	private CounterFull full;

	@Inject
	private CounterSessionScoped sessionScoped;

	@GET
	@Path("/less")
	public String testLess() {
		less.increase();
		less.increase();
		return "test-less: " + less.getNumber();
	}

	@GET
	@Path("/full")
	public String testFull() {
		full.increase();
		full.increase();
		return "test-full:" + full.getNumber();
	}

	@GET
	@Path("/session")
	public String testSession() {
		sessionScoped.increase();
		sessionScoped.increase();
		return "test-sessionScoped:" + sessionScoped.getNumber();
	}

}
