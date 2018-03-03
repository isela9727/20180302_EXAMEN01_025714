import java.util.*;

public abstract class Banco
{
	Banco origen, destino;
	double monto;
	UUID numCuenta;
	
	public UUID getCuenta()
	{
		return this.numCuenta;
	}
	
	public void setCuenta()
	{
		this.numCuenta = UUID.randomUUID();
	}
	
	public Banco getOrigen()
	{
		return this.origen;
	}
	
	public void setOrigen(Banco origen)
	{
		this.origen = origen;
	}
	
	public Banco getDestino()
	{
		return this.destino;
	}
	
	public void setDestino(Banco destino)
	{
		this.destino = destino;
	}
	
	public double getMonto()
	{
		return this.monto;
	}
	
	public void setMonto(double monto)
	{
		this.monto = monto;
	}
}
