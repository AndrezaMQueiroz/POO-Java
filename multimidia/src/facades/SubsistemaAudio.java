package facades;

import audio.AutoFalante;
import input.ConectorUSB;

public class SubsistemaAudio {
	private AutoFalante autoFalanteDianteiroDireito;
	private AutoFalante autoFalanteDianteiroEsquerdo;
	private AutoFalante autoFalantetraseiraDireito;
	private AutoFalante autoFalanteatraseiraEsquerdo;
	private ConectorUSB conectorTeclado;

	public SubsistemaAudio(ConectorUSB conectorTeclado) {
		autoFalanteDianteiroDireito  = new AutoFalante();
		autoFalanteDianteiroEsquerdo  = new AutoFalante();
		autoFalantetraseiraDireito  = new AutoFalante();
		autoFalanteatraseiraEsquerdo  = new AutoFalante();
	}

	public void ligar() {
		this.autoFalanteDianteiroDireito.ligar();
		this.autoFalanteDianteiroEsquerdo.ligar();
		this.autoFalantetraseiraDireito.ligar();
		this.autoFalanteatraseiraEsquerdo.ligar();
		this.conectorTeclado.ligar();
	}

	public void configurarAutoFalantes() {
		this.autoFalanteDianteiroDireito.alterarVolume(conectorTeclado.lerDados());
		this.autoFalanteDianteiroEsquerdo.alterarVolume(conectorTeclado.lerDados());
		this.autoFalantetraseiraDireito.alterarVolume(conectorTeclado.lerDados());
		this.autoFalanteatraseiraEsquerdo.alterarVolume(conectorTeclado.lerDados());
	}

	public void alterarVolume() {
		this.autoFalanteDianteiroDireito.alterarVolume(conectorTeclado.lerDados());
		this.autoFalanteDianteiroEsquerdo.alterarVolume(conectorTeclado.lerDados());
		this.autoFalantetraseiraDireito.alterarVolume(conectorTeclado.lerDados());
		this.autoFalanteatraseiraEsquerdo.alterarVolume(conectorTeclado.lerDados());
	}

	public void desligar() {
		this.autoFalanteDianteiroDireito.desligar();
		this.autoFalanteDianteiroEsquerdo.desligar();
		this.autoFalantetraseiraDireito.desligar();
		this.autoFalanteatraseiraEsquerdo.desligar();
		this.conectorTeclado.desligar();
	}
}
