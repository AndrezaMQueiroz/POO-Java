package facades;

import input.ConectorUSB;
import video.Tela;

public class SubsistemaVideo {
	private Tela telaEncostoEsquerdo;
	private Tela telaEncostoDireito;
	private Tela telaPainel;
	private ConectorUSB conectorTeclado;
	
	public SubsistemaVideo(ConectorUSB conectorTeclado) {
		telaEncostoEsquerdo = new Tela("800x600");
		telaEncostoDireito = new Tela("800x600");
		telaPainel = new Tela("1024x768");
	}

	public void ligar() {
		telaEncostoEsquerdo.ligar();
		telaEncostoDireito.ligar();
		telaPainel.ligar();
		conectorTeclado.ligar();
	}

	public void configurarTelas() {
		telaEncostoEsquerdo.alteraBrilho(conectorTeclado.lerDados());
		telaEncostoEsquerdo.alteraContraste(conectorTeclado.lerDados());
		telaEncostoDireito.alteraContraste(conectorTeclado.lerDados());
		telaEncostoDireito.alteraBrilho(conectorTeclado.lerDados());
		telaPainel.alteraContraste(conectorTeclado.lerDados());
		telaPainel.alteraBrilho(conectorTeclado.lerDados());
	}

	public void alterarBrilhoContraste() {
		telaEncostoEsquerdo.alteraBrilho(conectorTeclado.lerDados());
		telaEncostoEsquerdo.alteraContraste(conectorTeclado.lerDados());
		telaEncostoDireito.alteraContraste(conectorTeclado.lerDados());
		telaEncostoDireito.alteraBrilho(conectorTeclado.lerDados());
		telaPainel.alteraContraste(conectorTeclado.lerDados());
		telaPainel.alteraBrilho(conectorTeclado.lerDados());
	}

	public void desligar() {
		telaEncostoEsquerdo.desligar();
		telaEncostoDireito.desligar();
		telaPainel.desligar();
		conectorTeclado.desligar();
	}
}
