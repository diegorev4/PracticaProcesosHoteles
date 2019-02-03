package is.unican.es;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import is.unican.es.dominio.Reserva;

@Named
@SessionScoped
public class ReservasBean implements Serializable {

	@EJB
	private IGestionReservasEJBRemote reservas;
	
	private int numReserva;
	private Reserva r;
	private Date fechaEntrada;
	private Date fechaSalida;
	
	public String consultarReserva() {
		r = reservas.consultaReserva(numReserva);
		if(r==null) {
			return "mensajeError.xhtml";
		}
		return "buscarReserva";
	}
	public String cancelarReserva() {
		reservas.cancelarReserva(r.getId());
		return "confirmadaModificacion.xhtml";
	}
	
	public String modificarReserva() {
		return "modificarReserva.xhtml";
	}
	
	public String modificarFechas() {
		reservas.modificarReservaFecha(r.getId(), fechaEntrada, fechaSalida);
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
	public Reserva getR() {
		return r;
	}
	public void setR(Reserva r) {
		this.r = r;
	}
	
	
}
