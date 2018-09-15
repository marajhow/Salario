package BaseSalarial.Salario;

public class CalculoSalarioLiq {
	
	private double qtdHoras;
	private double salarioHora;
	private int numDependentes;
	private double vlSalarioBruto;
	private double vlDescontoINSS;
	private double vlDescontoIR;
	private double vlSalarioLiquido;
	
	public CalculoSalarioLiq(double qtdHoras, double salarioHora, int numDependentes) {
		this.qtdHoras = qtdHoras;
		this.salarioHora = salarioHora;
		this.numDependentes = numDependentes;
	}

	public double getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getNumDependentes() {
		return numDependentes;
	}

	public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}
	
	public double salarioBruto() {
		
		vlSalarioBruto = qtdHoras * salarioHora + (50 * numDependentes);
		return vlSalarioBruto;
	}
	
	public double descontoINSS() {
		
		if (vlSalarioBruto <= 1000.0) {
			vlDescontoINSS = vlSalarioBruto * 8.5 / 100;
		} else {
			vlDescontoINSS = vlSalarioBruto * 9.0 / 100;
		}
		
		return vlDescontoINSS;
	}
	
	public double descontoIR() {
		if (vlSalarioBruto <= 500.0) {
			vlDescontoIR = 0.0;
		} else if (vlSalarioBruto > 500.0 && vlSalarioBruto < 1000.0) {
			vlDescontoIR = vlSalarioBruto * 5.0 / 100.0;
		} else {
			vlDescontoIR = vlSalarioBruto * 7.0 /100.0;
		}
		
		return vlDescontoIR;
	}
	
	public double salarioLiquido() {
		vlSalarioLiquido = vlSalarioBruto - vlDescontoIR - vlDescontoINSS;
		return vlSalarioLiquido;
	}

}
