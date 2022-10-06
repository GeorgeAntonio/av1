package br.ufrn.imd.main;

import br.ufrn.imd.domino.Carro;
import br.ufrn.imd.domino.Moto;
import br.ufrn.imd.domino.Veiculo;
import br.ufrn.imd.repositorio.Repositorio;

public class LocaLisa {
	public static void main(String[] args) {
		Moto moto1 = new Moto();
		moto1.setId(1);
		moto1.setMarca("titan");
		moto1.setAlugado(true);
		moto1.setCilindradas(10);
		moto1.setQuilometragem(10000);
		moto1.setTipoPartida("elétrica");
		moto1.setValorAluguel(450);
		
		Moto moto2 = new Moto();
		moto2.setId(2);
		moto2.setMarca("titan2");
		moto2.setAlugado(false);
		moto2.setCilindradas(10);
		moto2.setQuilometragem(10000);
		moto2.setTipoPartida("elétrica");
		moto2.setValorAluguel(30);
		
		Moto moto3 = new Moto();
		moto3.setId(3);
		moto3.setMarca("titan2");
		moto3.setAlugado(true);
		moto3.setCilindradas(10);
		moto3.setQuilometragem(333);
		moto3.setTipoPartida("34");
		moto3.setValorAluguel(450);
		
		Carro carro1 = new Carro();
		carro1.setId(4);
		carro1.setAlugado(true);
		carro1.setMarca("gol");
		carro1.setPotenciaMotor(185);
		carro1.setQtdPortas(4);
		carro1.setQuilometragem(100000);
		carro1.setValorAluguel(800);
		
		Repositorio bd = new Repositorio();
		bd.addVeiculo(moto1);
		bd.addVeiculo(moto2);
		bd.addVeiculo(moto3);
		bd.addVeiculo(carro1);
		
		System.err.println("Maior marca");
		System.out.println(bd.maiorMarca());
		
		for(Veiculo v : bd.listarVeiculosCadastrados()) {
			System.out.println(v);
		}
		
		System.out.println(bd.veiculoMaisCaroDisponivel());
		System.out.println(bd.veiculoMaisBaratoDisponivel());
		
	}
}
