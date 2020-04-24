package tiposDeZapato;


import enumeraciones.Categoria;
import modelo.Fecha;
import modelo.Zapato;

public class Boleado extends Zapato{
	
	private String tipoDeZapatoBoleado;
	
	public Boleado(int ClaveProducto, double talla, double precio, Fecha fechaFabricacion, String marca, Categoria categoriaZapato, String tipoDeZapatoBoleado)
	{
		super(ClaveProducto, talla, precio, fechaFabricacion, marca, categoriaZapato);
		setTipoZapatoBoleado(tipoDeZapatoBoleado);
	}

	public void setTipoZapatoBoleado(String tipoDeZapatoBoleado) 
	{
		this.tipoDeZapatoBoleado = tipoDeZapatoBoleado;
	}
	
	
	public String getTipoZapatoBoleado()
	{
		return tipoDeZapatoBoleado;
	}
	
}
