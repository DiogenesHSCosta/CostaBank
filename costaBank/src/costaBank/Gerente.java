package costaBank;

public class Gerente extends FuncionarioAutenticavel {
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao()+super.getSalario();
	}
}
