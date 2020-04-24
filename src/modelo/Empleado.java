package modelo;

public abstract class Empleado {
	
	private int numeroDeEmpleado;
	private NombreCompleto nombreDeEmpleado;
	private int NSS;
	private double sueldo;
	private Fecha fechaDeRegistro;
	
	public Empleado(int NumeroDeEmpleado, NombreCompleto nombreDeEmpleado, int NSS, double suelod, Fecha fechaDeRegistro)
	{
		setNumeroDeEmpleado(NumeroDeEmpleado);
		setNombreDeEmpleado(nombreDeEmpleado);
		setNSS(NSS);
		setSueldo(suelod);
		setFechaDeRegistro(fechaDeRegistro);
	} 
	
	public void setNumeroDeEmpleado(int numeroDeEmpleado)
	{
		this.numeroDeEmpleado = numeroDeEmpleado;
	}
	
	public void setNombreDeEmpleado(NombreCompleto nombreDeEmpleado)
	{
		this.nombreDeEmpleado = nombreDeEmpleado;
	}
	
	public void setNSS(int NSS)
	{
		this.NSS = NSS;
	}
	
	public void setSueldo(double sueldo)
	{
		this.sueldo = sueldo;
	}
	
	public void setFechaDeRegistro(Fecha fechaDeRegistro)
	{
		this.fechaDeRegistro = fechaDeRegistro;
	}
	
	
	public int getNumeroDeEmpleado()
	{
		return numeroDeEmpleado;
	}
	
	public NombreCompleto getNombreDeEmpleado()
	{
		return nombreDeEmpleado;
	}
	
	public int getNSS()
	{
		return NSS;
	}
	
	public double getSueldo()
	{
		return sueldo;
	}
	
	public Fecha getFechaDeRegistro()
	{
		return fechaDeRegistro;
	}
	
	public abstract void RegistrarVenta();
	
}




