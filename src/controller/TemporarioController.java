package controller;

import javax.swing.JOptionPane;

import model.Temporario;

public class TemporarioController {

	public TemporarioController() {
		super();
	}

	public Temporario contratacao() {
		Temporario f = new Temporario();
		f.setId(Integer.parseInt(JOptionPane.showInputDialog("Insira o ID: ")));
		f.setNome(JOptionPane.showInputDialog("Insira o nome: "));
		f.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Insira o salário: ")));
		f.setDia(Integer.parseInt(JOptionPane.showInputDialog("Insira o dia: ")));
		f.setMes(Integer.parseInt(JOptionPane.showInputDialog("Insira o mês: ")));
		f.setAno(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano: ")));
		return f;
	}

}
