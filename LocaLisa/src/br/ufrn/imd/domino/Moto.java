package br.ufrn.imd.domino;

public class Moto extends Veiculo{
	private String tipoPartida;
	private int cilindradas;
	
	public String getTipoPartida() {
		return tipoPartida;
	}
	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + tipoPartida;
	}
	
}
