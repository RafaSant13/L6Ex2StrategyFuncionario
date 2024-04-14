package controller;

import javax.swing.JOptionPane;


import model.TempoIntegral;

public class TempoIntegralController {

	public TempoIntegralController() {
		super();
	}

	public TempoIntegral contratacao() {
		TempoIntegral f = new TempoIntegral();
		f.setId(Integer.parseInt(JOptionPane.showInputDialog("Insira o ID: ")));
		f.setNome(JOptionPane.showInputDialog("Insira o nome: "));
		f.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Insira o salário: ")));
		f.setBancoHoras(Integer.parseInt(JOptionPane.showInputDialog("Insira o bando de horas: ")));
		return f;
	}

	




}
