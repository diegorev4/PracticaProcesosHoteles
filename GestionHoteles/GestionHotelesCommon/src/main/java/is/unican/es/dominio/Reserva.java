package is.unican.es.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reserva {

	@Id
	private int id;
	private Date fechaEntrada;
	private Date fechaSalida;
	private double precio;
	@ManyToOne
	@JoinColumn(name="cliente_fk")
	private Cliente cliente;
	private Pago metodoPago;
	
	
	public Reserva() {
		
	}
	
	public Reserva(int id, Date fechaEntrada, Date fechaSalida, double precio, Cliente cliente, Pago pago) {
		super();
		this.id = id;
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
}
