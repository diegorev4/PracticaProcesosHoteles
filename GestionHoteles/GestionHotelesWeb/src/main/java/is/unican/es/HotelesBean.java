package is.unican.es;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import is.unican.es.dominio.Hotel;
import is.unican.es.dominio.Reserva;
import is.unican.es.dominio.ReservaTipoHabitacion;
import is.unican.es.dominio.TipoHabitacion;

@Named
@SessionScoped
public class HotelesBean implements Serializable{

	@EJB
	private IGestionHotelesEJBRemote gest;
	@EJB
	private IGestionReservasEJBRemote res;
	
	private String nombre;
	private String localidad;
	
	private Date fechaEntrada;
	private Date fechaSalida;
	
	private String nombrereserva;
	private String dni;
	private int numtarjeta;

	private DataModel<Hotel> ho;
	private DataModel<TipoHabitacion> hab;
	
	private Map<TipoHabitacion, Integer> habitacionesSeleccionadas = new HashMap<TipoHabitacion, Integer>();
	private List<Reserva> idsReservas;
	
	private int idReserva;
	
	private Hotel h;
	
	public String buscarHotel() {
		ho = null;
		
		if(nombre.isEmpty()) {
			if (localidad.isEmpty()) {
				return "index.xhtml";
			}else {

				ho = new ListDataModel<Hotel>(gest.consultarHotelLocalidad(localidad));
				return "hotelDetalle.xhtml";
			}
		}else {
			List<Hotel> h = new ArrayList<Hotel>();
			h.add(gest.consultarHotel(nombre));
			
			ho = new ListDataModel<Hotel>(h);
			return "hotelDetalle.xhtml";
		}
	}
	
	public String verDisponibilidad() {
		h = ho.getRowData();
		
		hab = new ListDataModel<TipoHabitacion>(gest.verDisponibilidad(h, fechaEntrada, fechaSalida));
		return "disponibilidad.xhtml";
	}
	
	public String reservar() {
		Iterator i = hab.iterator();
		idsReservas = new ArrayList<Reserva>();
		
		while(i.hasNext()) {
			TipoHabitacion t = (TipoHabitacion) i.next();
			//int aux = t.getId();
			ReservaTipoHabitacion r;
			
			if(habitacionesSeleccionadas.get(t) != null) {
				//Cambiar tipo habitacion por una lista de tipos de habitacion
				r = res.reservar(t, nombrereserva, dni, numtarjeta, habitacionesSeleccionadas.get(t), fechaEntrada, fechaSalida, "", "", "", 0, 11, 2030, null);
				idsReservas.add(r.getReserva());
			}
		}
		return "confirmacion.xhtml";
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
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public DataModel<Hotel> getHo() {
		return ho;
	}

	public void setHo(DataModel<Hotel> ho) {
		this.ho = ho;
	}
	public DataModel<TipoHabitacion> getHab() {
		return hab;
	}

	public void setHab(DataModel<TipoHabitacion> hab) {
		this.hab = hab;
	}

	public Map<TipoHabitacion, Integer> getHabitacionesSeleccionadas() {
		return habitacionesSeleccionadas;
	}

	public void setHabitacionesSeleccionadas(Map<TipoHabitacion, Integer> habitacionesSeleccionadas) {
		this.habitacionesSeleccionadas = habitacionesSeleccionadas;
	}

	public String getNombrereserva() {
		return nombrereserva;
	}

	public void setNombrereserva(String nombreReserva) {
		this.nombrereserva = nombreReserva;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumtarjeta() {
		return numtarjeta;
	}

	public void setNumtarjeta(int numTarjeta) {
		this.numtarjeta = numTarjeta;
	}

	public Hotel getH() {
		return h;
	}

	public void setH(Hotel h) {
		this.h = h;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public List<Reserva> getIdsReservas() {
		return idsReservas;
	}

	public void setIdsReservas(List<Reserva> idsReservas) {
		this.idsReservas = idsReservas;
	}

	
}
