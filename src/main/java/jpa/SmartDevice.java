package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SmartDevice {

	public SmartDevice() {
		super();
	}


	long id_ed;
	
	public SmartDevice(long id){
		this.id_ed = id;
	}
	
	@Id
	@GeneratedValue
	public long getId_ed() {
		return id_ed;
	}

	
	public void setId_ed(long id_ed) {
		this.id_ed = id_ed;
	}
	
	
}
