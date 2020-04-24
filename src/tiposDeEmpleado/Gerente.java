package tiposDeEmpleado;

import java.util.ArrayList;

import modelo.Empleado;
import modelo.Fecha;
import modelo.NombreCompleto;
import modelo.Turno;

public class Gerente extends Empleado{
	
	private ArrayList<Turno> turnoDelGerente;
	
	public Gerente(int NumeroDeEmpleado, NombreCompleto nombreDeEmpleado, int NSS, double suelod, Fecha fechaDeRegistro, ArrayList<Turno> turnoDelGerente)
	{
		super(NumeroDeEmpleado, nombreDeEmpleado, NSS, suelod, fechaDeRegistro);
		
		setTurnoDelGerente(turnoDelGerente);
	}

	public void setTurnoDelGerente(ArrayList<Turno> turnoDelGerente)
	{
		this.turnoDelGerente = turnoDelGerente;
	}
	
	
	public ArrayList<Turno> getTurnoDelGerente()
	{
		return turnoDelGerente;
	}
	
	@Override
	public void RegistrarVenta()
	{
		
	}
}
