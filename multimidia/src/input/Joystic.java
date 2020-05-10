package input;

import java.util.Scanner;

public class Joystic implements Dispositivo {
	private Scanner entrada;
	private String direcao;
	
	
	public Joystic() {
		entrada = new Scanner(System.in);
	}

	@Override
	public String lerEntrada() {
		// TODO Auto-generated method stub
		return entrada.next();
	}
		
	public String getdirecao() {
		return direcao;	
	}
	
	public void direita () {
		this.direcao = "direita";
	}
	
	public void esquerda () {
		this.direcao = "esquerda";
	}
	
	public void cima () {
		this.direcao= "cima";
	}
	
 	public void baixo () {
 		this.direcao= "baixo";
 	}
}