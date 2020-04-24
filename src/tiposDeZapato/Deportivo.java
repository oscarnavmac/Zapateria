package tiposDeZapato;

import enumeraciones.Categoria;
import modelo.Fecha;
import modelo.Zapato;

public class Deportivo extends Zapato{

	private String deporte;
	
	public Deportivo(int ClaveProducto, double talla, double precio, Fecha fechaFabricacion, String marca, Categoria categoriaZapato, String deporte)
	{
		super(ClaveProducto, talla, precio, fechaFabricacion, marca, categoriaZapato);
		setDeporte(deporte);
	}
	
	public void setDeporte(String deporte)
	{
		this.deporte = deporte;
	}
	
	
	public String getDeporte()
	{
		return deporte;
	}
}
