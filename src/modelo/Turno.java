package modelo;

import enumeraciones.DiaDeLaSemana;

public class Turno {
	private int hora;
	private int minutos;
	//private DiaDeLaSemana dia;
	private String dia;
	
	public Turno(int hora, int minutos, DiaDeLaSemana dia)
	{
		setHora(hora);
		setMinutos(minutos);
		setDia(dia);
	}
	
	public void setHora(int hora)
	{
		this.hora = hora;
	}
	
	public void setMinutos(int minutos)
	{
		this.minutos = minutos;
	}
	
	public void setDia(DiaDeLaSemana dia)
	{
		switch(dia)
		{
		case LUNES:
			this.dia = "Lunes";
			break;
			
		case MARTES:
			this.dia = "Martes";
			break;
			
		case MIERCOLES:
			this.dia = "Miércoles";
			break;
			
		case JUEVES:
			this.dia = "Jueves";
			break;
			
		case VIERNES:
			this.dia = "Viernes";
			break;
			
		case SABADO:
			this.dia = "Sábado";
			break;
			
		case DOMINGO:
			this.dia = "Domingo";
			break;
		}
	}
	
	
	public int getHora()
	{
		return hora;
	}
	
	public int getMinutos()
	{
		return minutos;
	}
	
	public String getDia()
	{
		return dia;
	}
	
	
	@Override
	public String toString()
	{
		return "Día: " + getDia() + ", Hora: " + String.format("%02d", getHora()) + ":" + String.format("%02d", getMinutos());
	}
}
