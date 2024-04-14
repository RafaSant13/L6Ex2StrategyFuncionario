package view;

import controller.TempoIntegralController;
import controller.TempoParcialController;
import controller.TemporarioController;
import model.TempoIntegral;
import model.TempoParcial;
import model.Temporario;

public class Teste {

	public static void main(String[] args) {
		TempoIntegralController tic = new TempoIntegralController();
		TempoIntegral ti = tic.contratacao();
		System.out.printf("ID: %d | Nome: %s | Salario: R$%.2f | Banco de horas: %d\n", ti.getId(), ti.getNome(), ti.getSalario(), ti.getBancoHoras());
		
		TempoParcialController tpc = new TempoParcialController();
		TempoParcial tp = tpc.contratacao();
		System.out.printf("ID: %d | Nome: %s | Salario: R$%.2f | Horário de Entrada: %d:00 | Horário de saída: %d:00\n", tp.getId(), tp.getNome(), tp.getSalario(), tp.getHoraEntrada(), tp.getHoraSaida());
		
		TemporarioController tc = new TemporarioController();
		Temporario t = tc.contratacao();
		System.out.printf("ID: %d | Nome: %s | Salario: R$%.2f | Data fim do contrato: %d/%d/%d\n", t.getId(), t.getNome(), t.getSalario(), t.getDia(), t.getMes(), t.getAno());
	}

}
