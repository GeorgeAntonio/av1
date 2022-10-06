package br.ufrn.imd.domino;

public class Carro extends Veiculo{
	private int potenciaMotor;
	private int qtdPortas;
	
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	@Override
	public String toString() {
		return super.toString() + " portas " + qtdPortas;
	}
	
}
