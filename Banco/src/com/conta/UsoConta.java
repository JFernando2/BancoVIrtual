package com.conta;

import javax.swing.JOptionPane;

public class UsoConta {

	public static void main(String[] args) {

	String nomeInicial = "";
	double deposito, saque; 
	int escolha;
	
	JOptionPane.showMessageDialog(null, "Bem vindo ao Banco Bomba", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);

	nomeInicial = JOptionPane.showInputDialog(null,"Informe o nome do titular");
					
	Conta newBank = new Conta (nomeInicial);
	
	JOptionPane.showMessageDialog(null, "Seu saldo é de: " + newBank.getSaldo());
	
	do {
		escolha = Integer.parseInt(JOptionPane.showInputDialog("0- cancelar 1- Depósitar 2- Saque 3- Ver Saldo"));
	
	if ( escolha == 1) {
		deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a ser Depositado"));
		newBank.depositar(deposito);
		JOptionPane.showMessageDialog(null, "Seu saldo é de: "+ newBank.getSaldo());
		
	}else if (escolha == 2) {
		saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser sacado"));
		newBank.sacar(saque);
		JOptionPane.showMessageDialog(null, "Seu saldo é de: "+ newBank.getSaldo());
	
	}else if (escolha == 3) {
		JOptionPane.showMessageDialog(null, "Seu saldo é de: "+ newBank.getSaldo());
	}
	
	} while (escolha != 0);
		JOptionPane.showMessageDialog(null, "Agradecemos a preferência");
	
	}
}