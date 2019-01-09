package is.unican.es.dominio;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public enum TipoTarjeta {
	
	@Enumerated
	VISA, MASTERCARD, AMERICAN_EXPRESS

}
