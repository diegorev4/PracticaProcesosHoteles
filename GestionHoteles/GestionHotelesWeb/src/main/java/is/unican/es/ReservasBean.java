package is.unican.es;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ReservasBean implements Serializable {

	@EJB
	private IGestionReservasEJBRemote reservas;
	
	private int numReserva;

	private Date fechaEntrada;
	private Date fechaSalida;
	
	public void cancelarReserva() {
		reservas.cancelarReserva(numReserva);
	}
	
	public String modificarReserva() {
		return "modificarReserva.xhtml";
	}
	
	public String modificarFechas() {
		reservas.modificarReservaFecha(numReserva, fechaEntrada, fechaSalida);
		return "confirmadaModificacion.xhtml";
	}
	
	public int getNumReserva() {
		return numReserva;
	}

	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	
}
