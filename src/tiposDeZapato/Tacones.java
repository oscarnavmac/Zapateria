package tiposDeZapato;


import enumeraciones.Categoria;
import modelo.Fecha;
import modelo.Zapato;

public class Tacones extends Zapato{
	
	private String tipoDeTacon;
	
	public Tacones(int ClaveProducto, double talla, double precio, Fecha fechaFabricacion, String marca, Categoria categoriaZapato, String tipoDeTacon)
	{
		super(ClaveProducto, talla, precio, fechaFabricacion, marca, categoriaZapato);
		setTipoDeTacon(tipoDeTacon);
	}
	
	public void setTipoDeTacon(String tipoDeTacon)
	{
		this.tipoDeTacon = tipoDeTacon;
	}
	
	
	public String getTipoDeTacon()
	{
		return tipoDeTacon;
	}
}
