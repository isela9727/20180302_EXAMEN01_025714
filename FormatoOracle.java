
public class FormatoOracle implements Formato
{
	Banco banco;

	@Override
	public void notify(Banco bancoOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Enviando monto desde oracle");
	}
}
