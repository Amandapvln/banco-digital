package entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("***Extrato Conta Corrente***");
		super.imprimirInfosComuns();
	}
	@Override
    public String getTipoConta() {
        return "Conta Corrente";
    }
}