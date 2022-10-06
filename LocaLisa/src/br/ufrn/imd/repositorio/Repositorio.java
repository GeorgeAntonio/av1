package br.ufrn.imd.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufrn.imd.domino.Veiculo;

public class Repositorio {
	private List<Veiculo> veiculos;

	public void addVeiculo(Veiculo v) {
		if(veiculos == null)
			veiculos = new ArrayList<Veiculo>();
		veiculos.add(v);
	}
	
	public List<Veiculo> listarVeiculosCadastrados() {
		return veiculos;
	}
	
	public String maiorMarca() {
		HashMap<String,Integer> qtdMarcas = new HashMap<String, Integer>();
		for(Veiculo veiculo:veiculos) {
			if(qtdMarcas.get(veiculo.getMarca())==null) {
				qtdMarcas.put(veiculo.getMarca(), 1);
			}else {
				int qtdVeiculo = qtdMarcas.get(veiculo.getMarca());
				qtdMarcas.put(veiculo.getMarca(), qtdVeiculo+1);
			}
		}
		
		int maiorMarca = 0;
		String retorno = "";
		
		for(Map.Entry<String, Integer> set: qtdMarcas.entrySet()) {
			if(maiorMarca<set.getValue()) {
				maiorMarca = set.getValue();
				retorno = set.getKey();
			}
		}
		
		return retorno;
	}
	
	public List<Veiculo> veiculosAlugados() {
		return veiculos(true);
	}
	
	public List<Veiculo> veiculos(boolean alugado) {
		List<Veiculo> veiculosAlugados = new ArrayList<Veiculo>();
		for (Veiculo veiculo : veiculos) {
			if(veiculo.isAlugado() == alugado)
				veiculosAlugados.add(veiculo);
		}
		return veiculosAlugados;
	}
	
	public double valorAlugueis() {
		
		double total = 0;
		for (Veiculo veiculo : veiculosAlugados()) {
			total+= veiculo.getValorAluguel();
		}
		
		return total;
	}
	
	public List<Veiculo> veiculosDisponiveis() {
		
		return veiculos(false);
		
	}
	
	public Veiculo veiculoMaisCaroDisponivel() {
		double valorAluguel = 0;
		Veiculo maisCaro = new Veiculo();
		for (Veiculo veiculo : veiculos) {
			if(valorAluguel < veiculo.getValorAluguel()) {
				valorAluguel = veiculo.getValorAluguel();
				maisCaro = veiculo;
			}
		}
		return maisCaro;
	}
	
	public Veiculo veiculoMaisBaratoDisponivel() {
		
		double valorAluguel = 0;
		Veiculo maisBarato = new Veiculo();
		for (Veiculo veiculo : veiculos) {
			if(valorAluguel == 0 || valorAluguel > veiculo.getValorAluguel()) {
				valorAluguel = veiculo.getValorAluguel();
				maisBarato = veiculo;
			}				

		}
		return maisBarato;
	}
	
	
}
