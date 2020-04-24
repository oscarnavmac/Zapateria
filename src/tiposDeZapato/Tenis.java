package tiposDeZapato;


import enumeraciones.Categoria;
import modelo.Fecha;
import modelo.Zapato;

public class Tenis extends Zapato{

	private String tipoTenis;
	
	public Tenis(int ClaveProducto, double talla, double precio, Fecha fechaFabricacion, String marca, Categoria categoriaZapato, String tipoTenis)
	{
		super(ClaveProducto, talla, precio, fechaFabricacion, marca, categoriaZapato);
		setTipoTenis(tipoTenis);
	}
	
	public void setTipoTenis(String tipoTenis)
	{
		this.tipoTenis = tipoTenis;
	}
	
	
	public String getTipoTenis()
	{
		return tipoTenis;
	}
	
}
