package modelo;

public class NombreCompleto {
	
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	public NombreCompleto(String nombres, String apellidoPaterno, String apellidoMaterno)
	{
		setNombres(nombres);
		setApellidoPaterno(apellidoPaterno);
		setApellidoMaterno(apellidoMaterno);
	}
	
	public void setNombres(String nombres)
	{
		this.nombres = nombres;
	}
	
	public void setApellidoPaterno(String apellidoPaterno)
	{
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public void setApellidoMaterno(String apellidoMaterno)
	{
		this.apellidoMaterno = apellidoMaterno;
	}
	
	
	public String getNombres()
	{
		return nombres;
	}
	
	public String getApellidoPaterno()
	{
		return apellidoPaterno;
	}
	
	public String getApellidoMaterno()
	{
		return apellidoMaterno;
	}
	
	
	@Override
	public String toString()
	{
		return getApellidoPaterno() + " " + getApellidoMaterno() + " " + getApellidoPaterno();
	}
	
}
