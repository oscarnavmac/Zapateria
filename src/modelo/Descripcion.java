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
	
	//M�todos Set
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setMaterial(String material)
	{
		this.material = material;
	}
	
	//M�todos Get
	public String getColor()
	{
		return color;
	}
	
	public String getMaterial()
	{
		return material;
	}
	
	
	//M�todo toString
	@Override
	public String toString()
	{
		return "Color: " + getColor() + ", Material: " + getMaterial();
	}
}
