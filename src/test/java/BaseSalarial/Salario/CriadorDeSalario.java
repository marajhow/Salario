package BaseSalarial.Salario;

public class CriadorDeSalario {

	private CalculoSalarioLiq salario;
	
	public CriadorDeSalario() {
		
	public CriadorDeSalario para(double qtdHoras, double salarioHora, int numDependentes) {
			this.salario = new CalculoSalarioLiq(qtdHoras,salarioHora,numDependentes);
		}
	}
	
	
}
