package modelo;

public class Descripcion {
	
	private String color;
	private String material;
	
	//Constructor
	public Descripcion(String color, String material)
	{
		setColor(color);
		setMaterial(material);
	}
	
	//Métodos Set
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setMaterial(String material)
	{
		this.material = material;
	}
	
	//Métodos Get
	public String getColor()
	{
		return color;
	}
	
	public String getMaterial()
	{
		return material;
	}
	
	
	//Método toString
	@Override
	public String toString()
	{
		return "Color: " + getColor() + ", Material: " + getMaterial();
	}
}
