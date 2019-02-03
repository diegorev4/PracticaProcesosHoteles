package is.unican.es.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date fechaEntrada;
	@Temporal(TemporalType.DATE)
	private Date fechaSalida;
	private double precio;
	@ManyToOne
	@JoinColumn(name="cliente_fk")
	private Cliente cliente;
	private Pago metodoPago;
	@ManyToOne
	@JoinColumn(name="hotel_fk")
	private Hotel hotel;
	@OneToMany(mappedBy="reserva")
	private List<ReservaTipoHabitacion> habitaciones;
	
	
	public Reserva() {
		
	}
	
	public Reserva(Date fechaEntrada, Date fechaSalida, double precio, Cliente cliente, Pago pago) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.precio = precio;
		this.cliente = cliente;
		this.metodoPago = pago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(Pago metodoPago) {
		this.metodoPago = metodoPago;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<ReservaTipoHabitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<ReservaTipoHabitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
}
