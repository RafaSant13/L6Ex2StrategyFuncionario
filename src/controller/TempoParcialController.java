package controller;

import javax.swing.JOptionPane;

import model.TempoParcial;

public class TempoParcialController {

	public TempoParcialController() {
		super();
	}

	public TempoParcial contratacao() {
		TempoParcial f = new TempoParcial();
		f.setId(Integer.parseInt(JOptionPane.showInputDialog("Insira o ID: ")));
		f.setNome(JOptionPane.showInputDialog("Insira o nome: "));
		f.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Insira o salário: ")));
		f.setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de entrada: ")));
		f.setHoraSaida(Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de saída: ")));
		return f;
	}

}
