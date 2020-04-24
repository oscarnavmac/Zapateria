package tiposDeEmpleado;

import java.util.ArrayList;

import modelo.Empleado;
import modelo.Fecha;
import modelo.NombreCompleto;
import modelo.Turno;

public class Vendedor extends Empleado{
	
	private ArrayList<Turno> turnoDelVendedor;
	
	public Vendedor(int NumeroDeEmpleado, NombreCompleto nombreDeEmpleado, int NSS, double suelod, Fecha fechaDeRegistro, ArrayList<Turno> turnoDelVendedor)
	{
		super(NumeroDeEmpleado, nombreDeEmpleado, NSS, suelod, fechaDeRegistro);
		
		setTurnoDelVendedor(turnoDelVendedor);
	}
	
	public void setTurnoDelVendedor(ArrayList<Turno> turnoDelVendedor)
	{
		this.turnoDelVendedor = turnoDelVendedor;
	}
	
	
	public ArrayList<Turno> getTurnoDelVendedor()
	{
		return turnoDelVendedor;
	}
	
	@Override
	public void RegistrarVenta()
	{
		
	}
	
}
