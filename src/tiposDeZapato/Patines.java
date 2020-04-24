package tiposDeZapato;


import enumeraciones.Categoria;
import modelo.Fecha;
import modelo.Zapato;

public class Patines extends Zapato{
	
	private String tipoDeRueda;
	
	public Patines(int ClaveProducto, double talla, double precio, Fecha fechaFabricacion, String marca, Categoria categoriaZapato, String tipoDeRueda)
	{
		super(ClaveProducto, talla, precio, fechaFabricacion, marca, categoriaZapato);
	}
	
	public void setTipoDeRueda(String tipoDeRueda)
	{
		this.tipoDeRueda = tipoDeRueda;
	}
	
	
	public String getTipoDeRueda()
	{
		return tipoDeRueda;
	}
}
