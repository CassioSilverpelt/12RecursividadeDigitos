package controller;

public class DigitosController {
	public DigitosController () {
		super();
	}
	
	public int contarDigitos(int num, int par) {
		if (num < 0) {num = num * (-1);}
		else if (num == 0) {return 1;}
		if (num/par < 1) {
			return 0;
			//Ao dividir o número pelo par, que aumenta multiplicando de 10 em 10, uma hora o número, dividido pelo múltiplo de 10, que será maior que ele, será menor do que 1.
		} else {
			return 1 + contarDigitos(num, (par*10));
			//A progressão vai somando unidades e aumentando o valor de parâmetro, até ultrapassar o número escolhido.
		}
	}
	
}
