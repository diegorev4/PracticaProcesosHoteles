package is.unican.es.dominio;

public class Pago {
	
	private int numTarjeta;
	private int cvc;
	private int mesCaducidad;
	private int anhoCaducidad;
	private TipoTarjeta tipo;
	
	public Pago() {
		
	}

	public Pago(int numTarjeta, int cvc, int mesCaducidad, int anhoCaducidad, TipoTarjeta tipo) {
		super();
		this.numTarjeta = numTarjeta;
		this.cvc = cvc;
		this.mesCaducidad = mesCaducidad;
		this.anhoCaducidad = anhoCaducidad;
		this.tipo = tipo;
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public int getMesCaducidad() {
		return mesCaducidad;
	}

	public void setMesCaducidad(int mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}

	public int getAnhoCaducidad() {
		return anhoCaducidad;
	}

	public void setAnhoCaducidad(int anhoCaducidad) {
		this.anhoCaducidad = anhoCaducidad;
	}

	public TipoTarjeta getTipo() {
		return tipo;
	}

	public void setTipo(TipoTarjeta tipo) {
		this.tipo = tipo;
	}
	
	
}
