package is.unican.es;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ReservasBean implements Serializable {

	@EJB
	private IGestionReservasEJBRemote reservas;
	
	private int numReserva;

	public void cancelarReserva() {
		reservas.cancelarReserva(numReserva);
	}
	
	public String modificarReserva() {
		return "modificarReserva.xhtml";
	}
	
	public int getNumReserva() {
		return numReserva;
	}

	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}
	
	
}
