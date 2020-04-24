package modelo;

import enumeraciones.Categoria;

public abstract class Zapato {
	
	private int claveProducto;
	private double talla;
	private double precio;
	private Fecha fechaFabricacion;
	private String marca;
	private Categoria categoriaZapato;
	
	public Zapato(int ClaveProdcuto, double talla, double precio, Fecha fechaFabricacion, String marca, Categoria categoriaZapato)
	{
		setClaveProducto(ClaveProdcuto);
		setTalla(talla);
		setPrecio(precio);
		setFechaFabricacion(fechaFabricacion);
		setMarca(marca);
		SetCategoriaZapato(categoriaZapato);
	}
	
	public void setClaveProducto(int claveProducto)
	{
		this.claveProducto = claveProducto;
	}
	
	public void setTalla(double talla)
	{
		this.talla = talla;
	}
	
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
	
	public void setFechaFabricacion(Fecha fechaFabricacion)
	{
		this.fechaFabricacion = fechaFabricacion;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public void SetCategoriaZapato(Categoria categoriaZapato)
	{
		this.categoriaZapato = categoriaZapato;
	}
	
	
	public int getClaveProducto()
	{
		return claveProducto;
	}
	
	public double getTalla()
	{
		return talla;
	}
	
	public double getPrecio()
	{
		return precio;
	}
	
	public Fecha getFechaFabricacion()
	{
		return fechaFabricacion;
	}
	
	public String getMarca()
	{
		int x = 4;
		if (x > 5)
			System.out.print("hola");

		return marca;
	}
	
	public Categoria getCategoriaZapato()
	{
		return categoriaZapato;
	}
	
}




