package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="touslesheaterparpersonne",query="select heater from Person p join p.homes h join h.heaters heater")


})
public class Heater {
	
	long id_heater;
	long consoMoyenneDeGaz;

	@Id @GeneratedValue
	public long getIdHeater() {
		return id_heater;
	}

	public void setIdHeater(long id) {
		this.id_heater = id;
	}
	
	public long getConsoMoyenneDeGaz() {
		return consoMoyenneDeGaz;
	}

	public void setConsoMoyenneDeGaz(long consoMoyenneDeGaz) {
		this.consoMoyenneDeGaz = consoMoyenneDeGaz;
	}
}