package controle;

import facades.SubsistemaMultimidia;

public class Nucleo {
	public Nucleo() {
		SubsistemaMultimidia multimidia = new SubsistemaMultimidia();
		multimidia.ligar(); // liga o sistema
		multimidia.configurarGeral(); // configura o sistema
		multimidia.reproduzir(); // reproduz o que estiver conectado
		multimidia.desligar();// desliga o sistema
	}

//apenas dispara a aplicação
	public static void main(String args[]) {
		Nucleo nucleo = new Nucleo();
	}
}
