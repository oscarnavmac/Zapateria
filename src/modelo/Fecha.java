package modelo;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	//Constructor
	public Fecha(int dia, int mes, int anio)
	{
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}
	
	//Métodos Set
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	
	public void setAnio(int anio)
	{
		this.anio = anio;
	}
	
	//Métodos get
	public int getDia()
	{
		return dia;
	}
	
	public int getMes()
	{
		return mes;
	}
	
	public int getAnio()
	{
		return anio;
	}
	
	//Método toString
	@Override
	public String toString()
	{
		return String.format("%02d", getDia()) + "/" + String.format("%02d", getMes()) + "/" 
		+ String.format("%04d", getAnio());
	}
}
