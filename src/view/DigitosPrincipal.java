package view;

import javax.swing.JOptionPane;

import controller.DigitosController;
public class DigitosPrincipal {
	public static void main (String[] args) {
		DigitosController digCon = new DigitosController();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser verificado: "));
		
		System.out.println("Este número tem " + digCon.contarDigitos(num, 1) + " dígitos.");
	}	
}
