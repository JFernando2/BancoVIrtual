package com.conta;

import javax.swing.JOptionPane;

public class Conta {

	private String nome;
	private double saldo;

	public Conta(String fer) {
		nome = fer;
		saldo = 100;
	}

	public void setNome(String fallen) {
		nome = fallen;
	}

	public String getNome() {
		return nome;
	}

	public void setSaldo(double valor) {
		saldo = valor;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor; 
		
	}
	
	public void sacar (double valor) {
		if (valor > 150) {
			JOptionPane.showMessageDialog(null, "Saques Disponíveis até 150.00.");
		} else if (saldo < valor) {
			JOptionPane.showMessageDialog(null, "Valor Indispovível em conta.");
		}else if (saldo >= valor && valor <= 150) {
			saldo = saldo - valor;
			JOptionPane.showMessageDialog(null, "Transação realizada com sucesso");
		}
	}
}









