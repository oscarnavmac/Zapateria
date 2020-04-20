package modulo;

public class Descripcion {
	
	private String color;
	private String material;
	
	public Descripcion(String color, String material)
	{
		setColor(color);
		setMaterial(material);
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setMaterial(String material)
	{
		this.material = material;
	}
	
	
	public String getColor()
	{
		return color;
	}
	
	public String getMaterial()
	{
		return material;
	}
	
	
	@Override
	public String toString()
	{
		return "Color: " + getColor() + ", Material: " + getMaterial();
	}
}
