import java.io.Serializable;

@SuppressWarnings("serial")
public class Cita implements Serializable {
	
	String fecha;
	String hora;
	Persona persona;
	Lugar lugar;
	
	public Cita(String fecha, String hora, Persona pe, Lugar lu) {
		
		this.fecha = fecha;
		this.hora = hora;
		this.persona = pe;
		this.lugar = lu;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public Persona getPersona() {
		return persona;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public Lugar getLugar() {
		return lugar;
	}
	
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public String toString() {
		return "Cita [Fecha: " + getFecha() + ", Hora: " + getHora() + ", Persona de la cita: "
				+ getPersona() + ", Lugar de la cita: " + getLugar() + "]";
	}
}