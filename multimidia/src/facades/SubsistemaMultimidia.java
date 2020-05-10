package facades;

import input.ConectorUSB;
import input.Joystic;
import input.M4pPlayer;

public class SubsistemaMultimidia {
	private SubsistemaVideo subsistemaVideo;
	private SubsistemaAudio subsistemaAudio;

	private ConectorUSB conectorTeclado;
	private ConectorUSB conectorMP4;
	private ConectorUSB conectorJoystic;
	
	

	public SubsistemaMultimidia() {
		conectorTeclado = new ConectorUSB();
		subsistemaVideo = new SubsistemaVideo(conectorTeclado);
		subsistemaAudio = new SubsistemaAudio(conectorTeclado);		
		conectorMP4 = new ConectorUSB();
		conectorJoystic = new ConectorUSB();
	}

	public void ligar() {
		subsistemaVideo.ligar();
		subsistemaAudio.ligar();

		conectorTeclado.ligar();
		conectorMP4.ligar();
		conectorJoystic.ligar();
	}

	public void configurarGeral() {
		subsistemaVideo.configurarTelas();
		subsistemaAudio.alterarVolume();
	}

	public void alterarBrilhoContraste() {
		subsistemaVideo.alterarBrilhoContraste();
	}

	public void alterarVolume() {
		subsistemaAudio.alterarVolume();
	}

	public void reproduzir() {
		this.conectarMP4();
		this.conectarJoystic();
	}

	private void conectarMP4() {
		M4pPlayer player = new M4pPlayer();
		this.conectorMP4.conectaDispositivo(player);
	}
	
	private void conectarJoystic() {
		Joystic joystic = new Joystic();
		this.conectorJoystic.conectaDispositivo(joystic);
	}

	public void desligar() {
		subsistemaVideo.desligar();
		subsistemaAudio.desligar();
		conectorTeclado.desligar();
		conectorMP4.desligar();
		conectorJoystic.desligar();
	}
}
