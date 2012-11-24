package agenda;

public class Cita 
{
	private Persona persona;
	private Lugar lugar;
	private String fechayhora;
	
	
	public Cita(Persona persona, Lugar lugar, String fechayhora) 
	{
		this.persona = persona;
		this.lugar = lugar;
		this.fechayhora = fechayhora;
	}

	public Persona getPersona() 
	{
		return persona;
	}

	public void setPersona(Persona persona) 
	{
		this.persona = persona;
	}

	public Lugar getLugar() 
	{
		return lugar;
	}

	public void setLugar(Lugar lugar) 
	{
		this.lugar = lugar;
	}

	public String getFechayhora() 
	{
		return fechayhora;
	}

	public void setFechayhora(String fechayhora) 
	{
		this.fechayhora = fechayhora;
	}

	public String toString() 
	{
		return "Cita [persona=" + persona.toString() + ", lugar=" + lugar.toString()
				+ ", fechayhora=" + fechayhora + "]";
	}
	
	
	
	

}
