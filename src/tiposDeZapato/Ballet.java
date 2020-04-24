package tiposDeZapato;

import enumeraciones.Categoria;
import modelo.Fecha;
import modelo.Zapato;

public class Ballet extends Zapato{
	
	private String tipoDeZapatilla;
	
	public Ballet(int ClaveProducto, double talla, double precio, Fecha fechaFabricacion, String marca, Categoria categoriaZapato, String tipoDeZapatilla)
	{
		super(ClaveProducto, talla, precio, fechaFabricacion, marca, categoriaZapato);
		setTipoDeZapatilla(tipoDeZapatilla);
	}
	
	public void setTipoDeZapatilla(String tipoDeZapatilla)
	{
		this.tipoDeZapatilla = tipoDeZapatilla;
	}
	
	
	public String getTipoDeZapatilla()
	{
		return tipoDeZapatilla;
	}

}
